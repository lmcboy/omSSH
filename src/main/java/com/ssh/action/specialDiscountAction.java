package com.ssh.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

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
import com.ssh.service.specialDiscountService;
@ParentPackage("basePackage")
@Action(value="special")//使用convention-plugin插件提供的@Action注解将一个普通java类标注为一个可以处理用户请求的Action，Action的名字为struts2Test
@Namespace("/")//使用convention-plugin插件提供的@Namespace注解为这个Action指定一个命名空间
public class specialDiscountAction extends ActionSupport{

	@Autowired
	private specialDiscountService discountService;
	
	private String discount_name;
	private String cust_code;
	private int sd_id;
	private String amount;
	private String applied_amount;
	private String balance;
	private String activity;
	private Integer cust_id;
	HttpServletResponse response = ServletActionContext.getResponse();
	
	public void specialFindByOne()throws Exception{
		//System.out.println(this.discount_name+this.cust_code);
		List<OmSpecialDiscount> list = discountService.find(this.discount_name, this.cust_code);		
		JsonArray array = new JsonArray();
		for(int i=0;i<list.size();i++){
			JsonObject object = new JsonObject();
			object.addProperty("sd_id", list.get(i).getSdId());
			object.addProperty("discount_name", list.get(i).getDiscountName());
			object.addProperty("cust_code", list.get(i).getCustCode());
			object.addProperty("amount", list.get(i).getAmount());
			object.addProperty("applied_amount", list.get(i).getAppliedAmount());
			object.addProperty("balance", list.get(i).getBalance());
			object.addProperty("activity", list.get(i).getActivity());
			array.add(object);
		}
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(array.toString());
		
	}
	
	public String specialFindById()throws Exception{
		List<OmSpecialDiscount> list = discountService.getById(this.sd_id);
		List<OmSpecialDiscount> newlist = new ArrayList<OmSpecialDiscount>();
		OmSpecialDiscount os =new OmSpecialDiscount();
		OmCustomersInfo info = new OmCustomersInfo();		
		info.setCustId(list.get(0).getOmCustomersInfo().getCustId());		
		os.setSdId(list.get(0).getSdId());
		os.setDiscountName(list.get(0).getDiscountName());
		os.setCustCode(list.get(0).getCustCode());
		os.setAmount(list.get(0).getAmount());
		os.setAppliedAmount(list.get(0).getAppliedAmount());
		os.setBalance(list.get(0).getBalance());
		os.setActivity(list.get(0).getActivity());
		os.setOmCustomersInfo(info);
		newlist.add(os);
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("list", newlist);		
		return "getById";
	}
	
	
	public String save()throws Exception{		
		OmCustomersInfo info = new OmCustomersInfo();
		info.setCustId(this.cust_id);
		try {
			OmSpecialDiscount discount = new OmSpecialDiscount();
			discount.setSdId(this.sd_id);
			discount.setDiscountName(this.discount_name);
			discount.setCustCode(this.cust_code);
			discount.setAmount(this.amount);
			discount.setAppliedAmount(this.applied_amount);
			discount.setBalance(this.balance);
			discount.setActivity(this.activity);
			discount.setOmCustomersInfo(info);
			discountService.save(discount);
			OmSpecialDiscountAppliedRecords appliedRecords =new OmSpecialDiscountAppliedRecords();
			appliedRecords.setDiscountName(this.discount_name);	
			appliedRecords.setOmCustomersInfo(info);
			appliedRecords.setAdnIdentifyNum("123321");
			appliedRecords.setAppliedAmount(this.applied_amount);
			Date date = new Date();
			appliedRecords.setAppliedDate(date);
			appliedRecords.setCancel(1);
			appliedRecords.setCustCode(this.cust_code);
			appliedRecords.setCancelDate(date.toString());
			discountService.savr(appliedRecords);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}						
	}
	
	public void findAmount()throws Exception{
		List<OmSpecialDiscount> list = discountService.getByamount(this.cust_code);		
		JsonObject object = new JsonObject();
		object.addProperty("applied_amount", list.get(0).getAppliedAmount());
		object.addProperty("balance", list.get(0).getBalance());
		object.addProperty("cust_id", list.get(0).getOmCustomersInfo().getCustId());
		System.out.println(object.toString());
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(object.toString());
	}
	
	public String insert()throws Exception{
		OmCustomersInfo info = new OmCustomersInfo();
		info.setCustId(this.cust_id);
		try {
			OmSpecialDiscount discount =new OmSpecialDiscount();
			discount.setDiscountName(this.discount_name);
			discount.setCustCode(this.cust_code);
			discount.setAmount(this.amount);
			discount.setAppliedAmount(this.applied_amount);
			discount.setBalance(this.balance);
			discount.setActivity(this.activity);
			discount.setOmCustomersInfo(info);
			discountService.save(discount);
			OmSpecialDiscountAppliedRecords appliedRecords = new OmSpecialDiscountAppliedRecords();
			appliedRecords.setDiscountName(this.discount_name);
			appliedRecords.setOmCustomersInfo(info);
			String num = String.valueOf((int)(Math.random()*100000));
			appliedRecords.setAdnIdentifyNum(num);
			appliedRecords.setAppliedAmount(this.applied_amount);
			Date date = new Date();
			appliedRecords.setAppliedDate(date);
			appliedRecords.setCustCode(this.cust_code);
			discountService.savr(appliedRecords);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	public String getDiscount_name() {
		return discount_name;
	}
	public void setDiscount_name(String discount_name) {
		this.discount_name = discount_name;
	}
	public String getCust_code() {
		return cust_code;
	}
	public void setCust_code(String cust_code) {
		this.cust_code = cust_code;
	}
	public specialDiscountService getDiscountService() {
		return discountService;
	}
	public void setDiscountService(specialDiscountService discountService) {
		this.discountService = discountService;
	}

	public int getSd_id() {
		return sd_id;
	}

	public void setSd_id(int sd_id) {
		this.sd_id = sd_id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	

	public String getApplied_amount() {
		return applied_amount;
	}

	public void setApplied_amount(String applied_amount) {
		this.applied_amount = applied_amount;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public Integer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}
	
	
	
}
