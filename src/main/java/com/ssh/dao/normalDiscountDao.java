package com.ssh.dao;

import java.util.List;

import com.ssh.model.OmNormalDiscount;

public interface normalDiscountDao {

	// �ۿ�������ѯ
	public List<OmNormalDiscount> findSomeone(String discount_name, String type);

	// ��ѯ�ۿ�ȫ����Ϣ

	public List<OmNormalDiscount> findAll();
	
	
	public List<OmNormalDiscount> save(OmNormalDiscount omNormalDiscount);
	
	
	public List<OmNormalDiscount> getOne(int discount_id);
	
	
}
