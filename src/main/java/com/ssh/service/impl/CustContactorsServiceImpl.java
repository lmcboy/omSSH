package com.ssh.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.dao.impl.CustContactorsDaoImpl;
import com.ssh.model.OmCustContactors;
import com.ssh.service.ICustContactorsService;

@Service("custContactorsService")
public class CustContactorsServiceImpl implements ICustContactorsService {

	@Autowired
	private CustContactorsDaoImpl custContactorsDao;
	/**
	 * 添加客户联系人信息
	 * @param OmCustContactors occ
	 * return
	 */
	public Serializable saveContactors(OmCustContactors occ) {
		return custContactorsDao.saveContactors(occ);
	}

}
