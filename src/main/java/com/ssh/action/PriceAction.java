package com.ssh.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.ssh.service.PriceService;

public class PriceAction {
	private String code;
	
	@Autowired
	private PriceService priceService;
	Map session = ActionContext.getContext().getSession();
	
	public String getHead(){
		int custId =priceService.getCustid(code); 
		System.out.println(custId+"-------");
		List head_col =priceService.getHead(custId);
		String[] head =new String[head_col.size()/2];
		int[] plc =new int[head_col.size()/2];
		String splc;
		for (int i = 0; i < (head_col.size()/2); i++) {
			head[i]=(String) head_col.get(i);
			plc[i]=(Integer) head_col.get(head_col.size()/2+i);
			System.out.println(plc[i]+"-----------");
		}
		session.put("head", head);
		List data = new ArrayList();
		for (int j = 0; j < head.length; j++) {
			String[] sdata=priceService.getDataByName(priceService.getDname(plc[j]), custId);
			for (int k = 0; k < sdata.length; k++) {
				data.add(sdata[k]);
			}
		}
		
		session.put("data", data);
//		priceService;
		
		return "success2";
	}

	
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	

}
