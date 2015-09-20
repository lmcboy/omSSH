package com.ssh.service;

import java.util.List;

import com.ssh.model.OmSpecialDiscount;
import com.ssh.model.OmSpecialDiscountAppliedRecords;

public interface specialDiscountService {

	public List<OmSpecialDiscount> find(String discount_name, String cust_code);

	public List<OmSpecialDiscount> save(OmSpecialDiscount omSpecialDiscount);

	public List<OmSpecialDiscount> getById(int sd_id);

	public List<OmSpecialDiscount> getByamount(String cust_code);
	
	public List<OmSpecialDiscountAppliedRecords> savr(OmSpecialDiscountAppliedRecords omSpecialDiscountAppliedRecords);
}
