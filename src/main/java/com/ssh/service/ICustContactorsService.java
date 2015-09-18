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
}
