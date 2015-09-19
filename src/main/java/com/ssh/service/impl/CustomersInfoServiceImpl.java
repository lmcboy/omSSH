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
	 * 根据客户Id获取客户详细信息
	 * @param Integer custId
	 * return OmCustomersInfo
	 */
	public OmCustomersInfo getCustomerInfoById(Integer custId){
		return customersInfoDao.getCustomerInfoById(custId);
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
	/**
	 * 修改客户地址信息
	 * @param OmCustomersInfo oci
	 * return boolean
	 */
	public boolean updateCustAddress(OmCustomersInfo oci){
		return customersInfoDao.updateCustAddress(oci);
	}
	/**
	 * 修改客户付款信息
	 * @param OmCustomersInfo oci
	 * return boolean
	 */
	public boolean updateCustPay(OmCustomersInfo oci){
		return customersInfoDao.updateCustPay(oci);
	}
}
