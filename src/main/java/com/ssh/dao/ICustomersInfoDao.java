package com.ssh.dao;

import java.io.Serializable;
import java.util.List;

import com.ssh.model.OmCustomersInfo;
import com.ssh.model.User;

public interface ICustomersInfoDao {
	/**
	 * 获取汇总客户信息
	 * @param OmCustomersInfo oci
	 * return List<OmCustomersInfo>
	 */
	public List<OmCustomersInfo> getCustomersInfo(OmCustomersInfo oci);
	/**
	 * 根据客户Id获取客户详细信息
	 * @param Integer custId
	 * return OmCustomersInfo
	 */
	public OmCustomersInfo getCustomerInfoById(Integer custId);
	/**
	 * 添加客户信息
	 * @param OmCustomersInfo oci
	 * return
	 */
	Serializable saveCustomer(OmCustomersInfo oci); 
	
	/**
	 * 修改客户信息状态
	 * @param Integer custId
	 * return boolean
	 */
	boolean updateCustStatus(Integer custId);
	/**
	 * 修改客户地址信息
	 * @param OmCustomersInfo oci
	 * return boolean
	 */
	boolean updateCustAddress(OmCustomersInfo oci);
	/**
	 * 修改客户付款信息
	 * @param OmCustomersInfo oci
	 * return boolean
	 */
	boolean updateCustPay(OmCustomersInfo oci);
}
