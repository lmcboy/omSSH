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
}
