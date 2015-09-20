package com.ssh.dao;

import java.util.List;

import com.ssh.model.OmSpecialDiscount;
import com.ssh.model.OmSpecialDiscountAppliedRecords;

public interface specialDiscountAppliedRecordsDao {

	public List<OmSpecialDiscountAppliedRecords> findByName(String discount_name);
	
	public List<OmSpecialDiscount> findByname(String discount_name);
}
