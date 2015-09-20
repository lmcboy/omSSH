package com.ssh.service;

import java.util.List;

import com.ssh.model.OmNormalDiscount;

public interface normalDiscountService {

	public List<OmNormalDiscount> findSomeone(String discount_name, String type);

	public List<OmNormalDiscount> findAll();
	
	public List<OmNormalDiscount> save(OmNormalDiscount omNormalDiscount);
	
	public List<OmNormalDiscount> getOne(int discount_id);
	
	
}
