package com.ssh.service;

import java.io.Serializable;
import java.util.List;

import com.ssh.model.OmCustomersInfo;

public interface ICustomersInfoService {
	/**
	 * 获取汇总客户信息
	 * @param OmCustomersInfo oci
	 * return List<OmCustomersInfo>
	 */
	public List<OmCustomersInfo> getCustomersInfo(OmCustomersInfo oci);
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
}
