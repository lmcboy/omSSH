package com.ssh.dao.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ssh.dao.PriceDao;
import com.ssh.model.OmCustPriceListConfig;

@Repository("priceDao")
public class PriceDaoImpl implements PriceDao {
	/**
	 * 使用@Autowired注解将sessionFactory注入到PriceDaoImpl中
	 */
	@Autowired
	private SessionFactory sessionFactory;
	
	public int getCustid(String code){
		Session session = sessionFactory.openSession();
		String hql = "select custId from OmCustomersInfo where customerCode= :code";
		Transaction tx = null; 
		try{
			tx = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setParameter("code", code);
			List oci = query.list();
			return (Integer) oci.get(0);
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {

			session.close();
		}
		return 0;
	}
	
	public List getHead(int custId){
		Session session = sessionFactory.openSession();
		String hql = "from OmCustPriceListConfig where omCustomersInfo.custId=:custId and activity='1'";
		Transaction tx = null; 
		try{
			tx = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setParameter("custId", custId);
			List<OmCustPriceListConfig> pc = query.list();
			String[] name=new String[pc.size()];
			int[] iexc=new int[pc.size()];
			int[] plc=new int[pc.size()];
			int i=0;
			for (Iterator iterator = pc.iterator(); iterator.hasNext();){
				OmCustPriceListConfig opc = (OmCustPriceListConfig) iterator.next();
				name[i]=opc.getDisplayName();
				iexc[i]=Integer.parseInt(opc.getExcelCol());
				plc[i]=Integer.parseInt(opc.getPriceListCol());
				i++;
				}
			int temp1;
			String temp2;
			int temp3;
			for(int k=iexc.length-1;k>=0;k--){
				for(int j=0;j<k;j++){
					if(iexc[j]>iexc[j+1]){
						temp1 = iexc[j];
						iexc[j] = iexc[j+1];
						iexc[j+1] = temp1;
						
						temp2 = name[j];
						name[j] = name[j+1];
						name[j+1] = temp2;
						
						temp3 = plc[j];
						plc[j] = plc[j+1];
						plc[j+1] = temp3;
					}
				}
			}
			List list = new ArrayList();
			for (int l = 0; l < plc.length; l++) {
				list.add(name[l]);
			}
			for (int m = 0; m < plc.length; m++) {
				list.add(plc[m]);
			}
//			System.out.println(list.get(plc.length-1));
//			System.out.println(list.get(plc.length));
			return list;
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {

			session.close();
		}
		return null;
	}

	
	public String getDname(int count){
		Session session = sessionFactory.openSession();
		String hql = "SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE table_name ='om_cust_price_list'";
		Transaction tx = null; 
		try{
			tx = session.beginTransaction();
			Query query = session.createSQLQuery(hql);
			List dn = query.list();
//			System.out.println(dn.get(count));
			return (String) dn.get(count);
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {

			session.close();
		}
		return null;
	}
	
	public String[] getDataByName(String name,int id){
		Session session = sessionFactory.openSession();
		String hql = "select "+name+" from om_cust_price_list where cust_id="+id;
		Transaction tx = null; 
		try{
			tx = session.beginTransaction();
			Query query = session.createSQLQuery(hql);
			List pl = query.list();
			String[] cpl=new String[pl.size()];
			int j=0;
			for (Iterator iterator = pl.iterator(); iterator.hasNext();){
					cpl[j]= iterator.next().toString();
				System.out.println(cpl[j]);
				j++;
			}
			System.out.println(cpl.length);
			return cpl;
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {

			session.close();
		}
		return null;
		
	}

}
