package com.ssh.dao;

import java.util.List;

import com.ssh.model.OmCustPriceListConfig;
import com.ssh.model.OmCustomersInfo;

public interface PriceConfigDao {
	public List<OmCustPriceListConfig> getPc(int custId);
	public OmCustomersInfo getCustomer(int id);
	public void update(int p,String n,String e,String a);
	public void insert(OmCustPriceListConfig opc);

}
