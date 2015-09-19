package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssh.dao.specialDiscountAppliedRecordsDao;
import com.ssh.model.OmSpecialDiscount;
import com.ssh.model.OmSpecialDiscountAppliedRecords;

@Repository("specialDiscountAppliedRecordsDaoImpl")
public class specialDiscountAppliedRecordsDaoImpl implements
		specialDiscountAppliedRecordsDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<OmSpecialDiscountAppliedRecords> findByName(String discount_name) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		String hql = "FROM OmSpecialDiscountAppliedRecords WHERE discountName='"
				+ discount_name + "'";
		try {

			Query query = session.createQuery(hql);
			List<OmSpecialDiscountAppliedRecords> list = query.list();
			ts.commit();
			return list;
		} catch (Exception e) {
			if (ts != null)
				ts.rollback();
			e.printStackTrace();
		}
		session.close();
		return null;
	}

	public List<OmSpecialDiscount> findByname(String discount_name) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		String hql = "FROM OmSpecialDiscount WHERE discountName='"
				+ discount_name + "'";
		try {

			Query query = session.createQuery(hql);
			List<OmSpecialDiscount> list = query.list();
			ts.commit();
			return list;
		} catch (Exception e) {
			if (ts != null)
				ts.rollback();
			e.printStackTrace();
		}
		session.close();
		return null;
	}

}
