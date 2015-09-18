package com.ssh.dao;

import java.io.Serializable;

import com.ssh.model.OmCustContactors;
import com.ssh.model.OmCustomersInfo;

public interface ICustContactorsDao {
	/**
	 * 添加客户联系人信息
	 * @param OmCustContactors oci
	 * return
	 */
	Serializable saveContactors(OmCustContactors occ);
	
}
