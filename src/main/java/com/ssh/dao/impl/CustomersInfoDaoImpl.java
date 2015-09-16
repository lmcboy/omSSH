package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssh.dao.ICustomersInfoDao;
import com.ssh.model.OmCustomersInfo;

@Repository("customersInfoDao")
public class CustomersInfoDaoImpl implements ICustomersInfoDao{

	@Autowired
    private SessionFactory sessionFactory;
	/**
	 * 获取session
	 */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	/**
	 * 获取所有客户信息
	 * @param OmCustomersInfo oci
	 * @return List<OmCustomersInfo>
	 */
	public List<OmCustomersInfo> getCustomersInfo(OmCustomersInfo oci) {
		//模糊查询,根据客户名称，客户简称，客户状态来进行查询
		String custName = null;
		String custCode = null;
		String status = null;
		if(oci.getCustomerName() != null){
			custName = oci.getCustomerName();
		}
		if(oci.getCustomerCode() != null){
			custCode = oci.getCustomerCode();
		}
		if(oci.getStatus() != null){
			status = oci.getStatus();
		}
		String hql = "FROM OmCustomersInfo oci WHERE customerName LIKE ? OR customerCode LIKE ? OR status LIKE ?";
		Query query = sessionFactory.openSession().createQuery(hql);
		//设置参数
		if(custName != null && !status.trim().equals("")){
			query.setString(0, "%" + custName + "%");			
		}else{
			query.setString(0, "%");
		}
		if(custCode != null && !status.trim().equals("")){
			query.setString(1, "%" + custCode + "%");
		}else{
			query.setString(1, "%");
		}
		if(status != null && !status.trim().equals("")){
			query.setString(2, "%" + status + "%");
		}else{
			query.setString(2, "%");
		}
		return query.list();
	}
	
}