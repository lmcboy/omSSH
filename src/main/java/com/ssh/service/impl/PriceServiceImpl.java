package com.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.dao.PriceDao;
import com.ssh.service.PriceService;

//使用Spring提供的@Service注解将PriceConfigServiceImpl标注为一个Service
@Service("priceService")
public class PriceServiceImpl implements PriceService {
	
	/**
     * 注入priceDao
     */
    @Autowired
    private PriceDao priceDao;

	public List getHead(int custId) {
		return priceDao.getHead(custId);
	}

	public int getCustid(String code) {
		return priceDao.getCustid(code);
	}

	public String getDname(int count) {
		return priceDao.getDname(count);
	}

	public String[] getDataByName(String name, int id) {
		return priceDao.getDataByName(name, id);
	} 
    
    

}
