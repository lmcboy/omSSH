package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ssh.dao.normalDiscountDao;
import com.ssh.model.OmNormalDiscount;

@Repository("normalDiscountdaoImpl")
public class normalDiscountDaoImpl implements normalDiscountDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<OmNormalDiscount> findSomeone(String discount_name, String type) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		String hql = "FROM OmNormalDiscount WHERE discountName like ? AND type like ?";
		try {
			Query query = session.createQuery(hql);
			if (discount_name == null) {
				query.setString(0, "%");
			} else {
				query.setString(0, "%" + discount_name + "%");
			}
			if (type == null) {
				query.setString(1, "%");
			}else{
				query.setString(1, "%" + type + "%");			
			}
			List<OmNormalDiscount> results = query.list();
			ts.commit();
			return results;

		} catch (Exception e) {
			if (ts != null)
				ts.rollback();
			e.printStackTrace();
		}
		session.close();
		return null;
	}

	public List<OmNormalDiscount> findAll() {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		String hql = "FROM OmNormalDiscount";
		try {

			Query query = session.createQuery(hql);
			List<OmNormalDiscount> results = query.list();
			ts.commit();
			return results;

		} catch (Exception e) {
			if (ts != null)
				ts.rollback();
		}
		session.close();
		return null;
	}

	public List<OmNormalDiscount> save(OmNormalDiscount omNormalDiscount) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		try {
			session.saveOrUpdate(omNormalDiscount);
			ts.commit();
		} catch (Exception e) {
			if(ts!=null)
				ts.rollback();
		}
		session.close();
		return null;
	}

	public List<OmNormalDiscount> getOne(int discount_id) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		String hql = "FROM OmNormalDiscount WHERE discountId = "+discount_id;
		try {
			Query query = session.createQuery(hql);
			List<OmNormalDiscount> results = query.list();
			ts.commit();
			return results;

		} catch (Exception e) {
			if (ts != null)
				ts.rollback();
		}
		session.close();
		return null;
	}


}
