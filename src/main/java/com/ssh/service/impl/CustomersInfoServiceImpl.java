package com.ssh.service.impl;

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

}
