package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssh.dao.PriceConfigDao;
import com.ssh.model.OmCustPriceListConfig;
import com.ssh.model.OmCustomersInfo;

@Repository("pcDao")
public class PriceConfigDaoImpl implements PriceConfigDao {
	/**
	 * 使用@Autowired注解将sessionFactory注入到PriceConfigDaoImpl中
	 */
	@Autowired
	private SessionFactory sessionFactory;

	public List<OmCustPriceListConfig> getPc(int custId){
		Session session = sessionFactory.openSession();
		String hql = "from OmCustPriceListConfig where omCustomersInfo.custId=:custId";
		Transaction tx = null; 
		try{
			tx = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setParameter("custId", custId);
			List<OmCustPriceListConfig> pc = query.list();
			return pc;
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {

			session.close();
		}
		return null;
	}
	
	public OmCustomersInfo getCustomer(int id){
		Session session = sessionFactory.openSession();
		Transaction tx = null; 
		try{
			tx = session.beginTransaction();
			OmCustomersInfo customer =(OmCustomersInfo) session.get(OmCustomersInfo.class, id);
			return customer;
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {

			session.close();
		}
		return null;
		
	}
	
	
	
	public void update(int plcid,String name,String exc,String atv){
		Session session = sessionFactory.openSession();
		String hql = "UPDATE OmCustPriceListConfig set displayName=:name,excelCol=:exc,activity=:atv"
				+ " WHERE plcId=:plcid";
		Transaction tx = null; 
		try{
			Query query = session.createQuery(hql);
			query.setParameter("name", name);
			query.setParameter("exc", exc);
			query.setParameter("atv", atv);
			query.setParameter("plcid", plcid);
			query.executeUpdate();
			System.out.println("---------update success-------");
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
	}
	
	public void insert(OmCustPriceListConfig opc){
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			session.save(opc);
			tx.commit();
			System.out.println("---------insert success-------");
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
	}

}
