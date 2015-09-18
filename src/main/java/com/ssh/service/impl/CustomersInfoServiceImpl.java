package com.ssh.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.dao.ICustomersInfoDao;
import com.ssh.model.OmCustomersInfo;
import com.ssh.service.ICustomersInfoService;

@Service("customersInfoService")
public class CustomersInfoServiceImpl implements ICustomersInfoService {

    @Autowired
	private ICustomersInfoDao customersInfoDao;
    /**
	 * 获取所有客户信息
	 * @param OmCustomersInfo oci
	 * @return List<OmCustomersInfo>
	 */
	public List<OmCustomersInfo> getCustomersInfo(OmCustomersInfo oci) {
		return customersInfoDao.getCustomersInfo(oci);
	}
	/**
	 * 添加客户信息
	 * @param OmCustomersInfo oci
	 * return
	 */
	public Serializable saveCustomer(OmCustomersInfo oci){
		return customersInfoDao.saveCustomer(oci);
	}
	/**
	 * 修改客户信息状态
	 * @param Integer custId
	 * return boolean
	 */
	public boolean updateCustStatus(Integer custId) {
		return customersInfoDao.updateCustStatus(custId);
	}
}
