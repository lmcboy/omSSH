package com.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.dao.specoalDiscountDao;
import com.ssh.model.OmSpecialDiscount;
import com.ssh.model.OmSpecialDiscountAppliedRecords;
import com.ssh.service.specialDiscountService;
@Service("specialDiscountServiceImpl")
public class specialDiscountServiceImpl implements specialDiscountService{

	@Autowired
	private specoalDiscountDao discountDao;
	
	
	
	public specoalDiscountDao getDiscountDao() {
		return discountDao;
	}

	public void setDiscountDao(specoalDiscountDao discountDao) {
		this.discountDao = discountDao;
	}

	public List<OmSpecialDiscount> find(String discount_name, String cust_code) {
		List<OmSpecialDiscount> list = discountDao.find(discount_name, cust_code);
		return list;
	}

	public List<OmSpecialDiscount> save(OmSpecialDiscount omSpecialDiscount) {
		discountDao.save(omSpecialDiscount);
		return null;
	}

	public List<OmSpecialDiscount> getById(int sd_id) {
		List<OmSpecialDiscount> list = discountDao.getById(sd_id);
		return list;
	}
	public List<OmSpecialDiscount> getByamount(String cust_code){
		List<OmSpecialDiscount> list =discountDao.getByamount(cust_code);
		return list;
	}

	public List<OmSpecialDiscountAppliedRecords> savr(
			OmSpecialDiscountAppliedRecords omSpecialDiscountAppliedRecords) {
		discountDao.savr(omSpecialDiscountAppliedRecords);
		return null;
	}
}
