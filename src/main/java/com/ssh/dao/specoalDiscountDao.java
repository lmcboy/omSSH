package com.ssh.dao;

import java.util.List;

import com.ssh.model.OmSpecialDiscount;
import com.ssh.model.OmSpecialDiscountAppliedRecords;

public interface specoalDiscountDao {

	public List<OmSpecialDiscount> find(String discount_name,String cust_code);
	
	
	public List<OmSpecialDiscount> save(OmSpecialDiscount omSpecialDiscount);
	
	public List<OmSpecialDiscount> getById(int sd_id);
	
	public List<OmSpecialDiscount> getByamount(String cust_code);
	
	public List<OmSpecialDiscountAppliedRecords> savr(OmSpecialDiscountAppliedRecords omSpecialDiscountAppliedRecords);
}
