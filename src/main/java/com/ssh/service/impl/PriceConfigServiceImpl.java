package com.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.dao.PriceConfigDao;
import com.ssh.model.OmCustPriceListConfig;
import com.ssh.model.OmCustomersInfo;
import com.ssh.service.PriceConfigService;
//使用Spring提供的@Service注解将PriceConfigServiceImpl标注为一个Service
@Service("pcService")
public class PriceConfigServiceImpl implements PriceConfigService {
	/**
     * 注入pcDao
     */
    @Autowired
    private PriceConfigDao pcDao;
    
    public List<OmCustPriceListConfig> getPc(int custId){
    	return pcDao.getPc(custId);
    }

	public OmCustomersInfo getCustomer(int id) {
		return pcDao.getCustomer(id);
	}

	public void update(int p, String n, String e, String a) {
		pcDao.update(p, n, e, a);
	}

	public void insert(OmCustPriceListConfig opc) {
		pcDao.insert(opc);
		
	}

}
