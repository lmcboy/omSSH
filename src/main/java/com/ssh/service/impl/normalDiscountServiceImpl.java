package com.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.dao.normalDiscountDao;
import com.ssh.model.OmNormalDiscount;
import com.ssh.service.normalDiscountService;
@Service("normalDiscountServiceImpl")
public class normalDiscountServiceImpl implements normalDiscountService{

	@Autowired
	private normalDiscountDao discountDao;
	
	
	
	public normalDiscountDao getDiscountDao() {
		return discountDao;
	}

	public void setDiscountDao(normalDiscountDao discountDao) {
		this.discountDao = discountDao;
	}

	public List<OmNormalDiscount> findSomeone(String discount_name, String type) {
		// TODO Auto-generated method stub
		List<OmNormalDiscount> list = discountDao.findSomeone(discount_name, type);
		return list;
	}

	public List<OmNormalDiscount> findAll() {
		List<OmNormalDiscount> listAll = discountDao.findAll();
		return listAll;
	}

	public List<OmNormalDiscount> save(OmNormalDiscount omNormalDiscount) {
		discountDao.save(omNormalDiscount);
		return null;
	}

	public List<OmNormalDiscount> getOne(int discount_id) {
		List<OmNormalDiscount> listOne = discountDao.getOne(discount_id);
		return listOne;
	}


	
}
