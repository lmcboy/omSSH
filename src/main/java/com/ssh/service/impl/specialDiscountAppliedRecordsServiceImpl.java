package com.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.dao.specialDiscountAppliedRecordsDao;
import com.ssh.model.OmSpecialDiscount;
import com.ssh.model.OmSpecialDiscountAppliedRecords;
import com.ssh.service.specialDiscountAppliedRecordsService;
@Service("specialDiscountAppliedRecordsServiceImpl")
public class specialDiscountAppliedRecordsServiceImpl implements
		specialDiscountAppliedRecordsService {

	@Autowired
	private specialDiscountAppliedRecordsDao appliedRecordsDao;
	
	
	
	public specialDiscountAppliedRecordsDao getAppliedRecordsDao() {
		return appliedRecordsDao;
	}



	public void setAppliedRecordsDao(
			specialDiscountAppliedRecordsDao appliedRecordsDao) {
		this.appliedRecordsDao = appliedRecordsDao;
	}



	public List<OmSpecialDiscountAppliedRecords> findByName(String discount_name) {
		List<OmSpecialDiscountAppliedRecords> list = appliedRecordsDao.findByName(discount_name);
		return list;
	}



	public List<OmSpecialDiscount> findByname(String discount_name) {
		List<OmSpecialDiscount> list = appliedRecordsDao.findByname(discount_name);
		return list;
	}

}
