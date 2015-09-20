package com.ssh.service;

import java.util.List;

public interface PriceService {
	public int getCustid(String code);
	public List getHead(int custId);
	public String getDname(int count);
	public String[] getDataByName(String name,int id);

}
