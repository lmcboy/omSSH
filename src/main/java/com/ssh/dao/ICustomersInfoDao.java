package com.ssh.dao;

import java.util.List;

import com.ssh.model.OmCustomersInfo;

public interface ICustomersInfoDao {
	/**
	 * 获取汇总客户信息
	 * @param OmCustomersInfo oci
	 * return List<OmCustomersInfo>
	 */
	public List<OmCustomersInfo> getCustomersInfo(OmCustomersInfo oci);
}
