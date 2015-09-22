package com.ssh.dao;

import java.util.List;

import com.ssh.model.OmCustPriceList;
import com.ssh.model.OmCustomersInfo;

public interface PriceDao {
	public int getCustid(String code);
	public List getHead(int custId);
	public String getDname(int count);
	public String[] getDataByName(String name,int id);
	public String[] getDnameBy(int id);
	public OmCustomersInfo getCustomer(int id);
	public void add(OmCustPriceList opl);

}
