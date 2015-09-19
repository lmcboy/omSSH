package com.ssh.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.model.OmCustomersInfo;
import com.ssh.model.OmSpecialDiscount;
import com.ssh.model.OmSpecialDiscountAppliedRecords;
import com.ssh.service.specialDiscountAppliedRecordsService;
@ParentPackage("basePackage")
@Action(value="appliedRecord")//使用convention-plugin插件提供的@Action注解将一个普通java类标注为一个可以处理用户请求的Action，Action的名字为struts2Test
@Namespace("/")//使用convention-plugin插件提供的@Namespace注解为这个Action指定一个命名空间
public class specialDiscountAppliedRecordsAction extends ActionSupport{

	@Autowired
	private specialDiscountAppliedRecordsService recordsService;
	
	private String discount_name;

	HttpServletResponse response = ServletActionContext.getResponse();
	
	public String findByName()throws Exception{	
		System.out.println(this.discount_name);
		List<OmSpecialDiscountAppliedRecords> list = recordsService.findByName(this.discount_name);
		List<OmSpecialDiscountAppliedRecords> list1  = new ArrayList<OmSpecialDiscountAppliedRecords>();
		OmSpecialDiscountAppliedRecords or = new OmSpecialDiscountAppliedRecords();
		OmCustomersInfo info = new OmCustomersInfo();
		List<OmSpecialDiscount> ls =recordsService.findByname(this.discount_name);
		List<OmSpecialDiscount> ls1 = new ArrayList<OmSpecialDiscount>();
		OmSpecialDiscount os = new OmSpecialDiscount();
		os.setAmount(ls.get(0).getAmount());
		os.setAppliedAmount(ls.get(0).getAppliedAmount());
		os.setBalance(ls.get(0).getBalance());
		ls1.add(os);
		for(int i=0;i<list.size();i++){
			or.setSdarId(list.get(i).getSdarId());
			or.setDiscountName(list.get(i).getDiscountName());
			info.setCustId(list.get(i).getOmCustomersInfo().getCustId());			
			or.setOmCustomersInfo(info);
			or.setAdnIdentifyNum(list.get(i).getAdnIdentifyNum());
			or.setAppliedAmount(list.get(i).getAppliedAmount());
			or.setAppliedDate(list.get(i).getAppliedDate());
			or.setCancel(list.get(i).getCancel());
			or.setCancelDate(list.get(i).getCancelDate());
			or.setCustCode(list.get(i).getCustCode());
			list1.add(or);
			System.out.println(list.get(i).toString());
		}
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("list", list1);
		session.setAttribute("ls", ls1);
		return "success";
	}
	
	public void findByname()throws Exception{
		
	}
	
	
	
	public specialDiscountAppliedRecordsService getRecordsService() {
		return recordsService;
	}

	public void setRecordsService(
			specialDiscountAppliedRecordsService recordsService) {
		this.recordsService = recordsService;
	}

	public String getDiscount_name() {
		return discount_name;
	}

	public void setDiscount_name(String discount_name) {
		this.discount_name = discount_name;
	}
	
	
	
	
}
