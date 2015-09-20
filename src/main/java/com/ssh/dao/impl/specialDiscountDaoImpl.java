package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssh.dao.specoalDiscountDao;
import com.ssh.model.OmSpecialDiscount;
import com.ssh.model.OmSpecialDiscountAppliedRecords;
@Repository("specialDiscountdaoImpl")
public class specialDiscountDaoImpl implements specoalDiscountDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<OmSpecialDiscount> find(String discount_name, String cust_code) {		
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		String hql = "FROM OmSpecialDiscount WHERE discountName like ? AND custCode like ?";
		try {
			Query query = session.createQuery(hql);
			if(discount_name == null){
				query.setString(0, "%");
			}else{
				query.setString(0, "%"+discount_name+"%");
			}
			if(cust_code == null){
				query.setString(1, "%");
			}else{
				query.setString(1, "%"+cust_code+"%");
			}
			List<OmSpecialDiscount> list = query.list();						
			ts.commit();
			return list;
		} catch (Exception e) {
			if(ts!=null)
				ts.rollback();
			e.printStackTrace();
		}
		session.close();
		return null;
	}

	public List<OmSpecialDiscount> save(OmSpecialDiscount omSpecialDiscount) {


		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		try {
			
			session.saveOrUpdate(omSpecialDiscount);
			ts.commit();
			
		} catch (Exception e) {
			if(ts!=null)
				ts.rollback();
			e.printStackTrace();
		}
		session.close();
		return null;
	}

	public List<OmSpecialDiscount> getById(int sd_id) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		String hql = "FROM  OmSpecialDiscount WHERE sdId = "+sd_id;
		try {
			Query query = session.createQuery(hql);
			List<OmSpecialDiscount> list = query.list();
			ts.commit();
			return list;
		} catch (Exception e) {
			if(ts!=null)
				ts.rollback();
			e.printStackTrace();
		}
		session.close();
		return null;
	}

	public List<OmSpecialDiscount> getByamount(String cust_code) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		String hql ="FROM  OmSpecialDiscount WHERE custCode like ?";
		try {
			Query query = session.createQuery(hql);
			query.setString(0, "%"+cust_code+"%");
			List<OmSpecialDiscount> list = query.list();
			ts.commit();
			return list;
		} catch (Exception e) {
			if(ts!=null)
				ts.rollback();
			e.printStackTrace();
		}
		session.close();
		return null;
	}

	public List<OmSpecialDiscountAppliedRecords> savr(
			OmSpecialDiscountAppliedRecords omSpecialDiscountAppliedRecords) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		try {
			
			session.saveOrUpdate(omSpecialDiscountAppliedRecords);
			ts.commit();
			
		} catch (Exception e) {
			if(ts!=null)
				ts.rollback();
			e.printStackTrace();
		}
		session.close();
		return null;
	}

}
