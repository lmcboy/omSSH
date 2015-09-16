package com.ssh.service;

import java.util.List;

import com.ssh.model.OmCustomersInfo;

public interface ICustomersInfoService {
	/**
	 * 获取汇总客户信息
	 * @param OmCustomersInfo oci
	 * return List<OmCustomersInfo>
	 */
	public List<OmCustomersInfo> getCustomersInfo(OmCustomersInfo oci);
}
