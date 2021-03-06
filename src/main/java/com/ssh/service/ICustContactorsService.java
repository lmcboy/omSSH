package com.ssh.service;

import java.io.Serializable;

import com.ssh.model.OmCustContactors;

public interface ICustContactorsService {
	/**
	 * 添加客户联系人信息
	 * @param OmCustContactors occ
	 * return
	 */
	Serializable saveContactors(OmCustContactors occ);
	/**
	 * 根据客户Id获取客户联系人信息
	 * @param Integer custId
	 * return OmCustContactors
	 */
	public OmCustContactors getCustomerContactorsById(Integer custId);
	/**
	 * 更新客户联系人信息
	 * @param OmCustContactors
	 * return boolean
	 */
	public boolean updateCustContactors(OmCustContactors occ);
}
