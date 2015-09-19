package com.ssh.dao.impl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssh.dao.ICustContactorsDao;
import com.ssh.model.OmCustContactors;

@Repository("custContactorsDao")
public class CustContactorsDaoImpl implements ICustContactorsDao{
	
	@Autowired
    private SessionFactory sessionFactory;
	/**
	 * 获取session
	 */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	/**
	 * 添加客户联系人信息
	 * @param OmCustContactors occ
	 * return
	 */	
	public Serializable saveContactors(OmCustContactors occ) {
		return getSession().save(occ);
	}
	/**
	 * 根据客户Id获取客户联系人信息
	 * @param Integer custId
	 * return OmCustContactors
	 */
	public OmCustContactors getCustomerContactorsById(Integer custId){
		String hql = "FROM OmCustContactors WHERE cust_id = ?";
		Session session = sessionFactory.openSession();
		OmCustContactors occ = (OmCustContactors) session.createQuery(hql).setInteger(0, custId).uniqueResult();
		session.close();
		return occ;
	}
	/**
	 * 更新客户联系人信息
	 * @param OmCustContactors
	 * return boolean
	 */
	public boolean updateCustContactors(OmCustContactors occ){
		try{
			String hql = "FROM OmCustContactors WHERE cust_id = ?";
			OmCustContactors o = (OmCustContactors) getSession().createQuery(hql).setInteger(0, occ.getOmCustomersInfo().getCustId()).uniqueResult();
			o.setInvPklistMailto(occ.getInvPklistMailto());
			o.setMailFrom(occ.getMailFrom());
			o.setOcPiMailto(occ.getOcPiMailto());
			o.setPoMailto(occ.getPoMailto());
			o.setPrePoMailto(occ.getPrePoMailto());
			getSession().saveOrUpdate(o);
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		return true;		
	}
}
