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
import org.springframework.stereotype.Service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.model.OmNormalDiscount;
import com.ssh.service.normalDiscountService;
@ParentPackage("basePackage")
@Action(value="discount")//使用convention-plugin插件提供的@Action注解将一个普通java类标注为一个可以处理用户请求的Action，Action的名字为struts2Test
@Namespace("/")//使用convention-plugin插件提供的@Namespace注解为这个Action指定一个命名空间
public class normalDiscountAction extends ActionSupport{

	@Autowired
	private normalDiscountService discountService;
	private String discount_name;
	private String type;
	private int discount_id;
	private Double discount_rate;
	private String discount_base;
	private String base_qty;
	private String activity;
	
    public void findOne()throws Exception{  
    	System.out.println(discount_name+type);
    	List<OmNormalDiscount> list = discountService.findSomeone(this.discount_name, this.type);
    	JsonArray array = new JsonArray();
    	for(int i=0;i<list.size();i++){
			JsonObject object = new JsonObject();
			object.addProperty("discount_id", list.get(i).getDiscountId());
			object.addProperty("discount_name", list.get(i).getDiscountName());
			object.addProperty("type", list.get(i).getType());
			object.addProperty("discount_base", list.get(i).getDiscountBase());
			object.addProperty("base_qty", list.get(i).getBaseQty());
			object.addProperty("discount_rate", list.get(i).getDiscountRate());
			object.addProperty("activity", list.get(i).getActivity());
			array.add(object);
		}
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(array.toString());
		//return SUCCESS;
    }

	public void findAll()throws Exception{
		JsonArray array = new JsonArray();
		List<OmNormalDiscount> list = discountService.findAll();
		for(int i=0;i<list.size();i++){
			JsonObject object = new JsonObject();
			object.addProperty("discount_id", list.get(i).getDiscountId());
			object.addProperty("discount_name", list.get(i).getDiscountName());
			object.addProperty("type", list.get(i).getType());
			object.addProperty("discount_base", list.get(i).getDiscountBase());
			object.addProperty("base_qty", list.get(i).getBaseQty());
			object.addProperty("discount_rate", list.get(i).getDiscountRate());
			object.addProperty("activity", list.get(i).getActivity());
			array.add(object);
		}
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(array.toString());
		
	}
	public String getOne()throws Exception{
		
		List<OmNormalDiscount> rs = discountService.getOne(this.discount_id);
		List<OmNormalDiscount> list = new ArrayList<OmNormalDiscount>();
		OmNormalDiscount om = new OmNormalDiscount();
		om.setDiscountId(rs.get(0).getDiscountId());
		om.setDiscountName(rs.get(0).getDiscountName());
		om.setType(rs.get(0).getType());
		om.setBaseQty(rs.get(0).getBaseQty());
		om.setDiscountBase(rs.get(0).getDiscountBase());
		om.setActivity(rs.get(0).getActivity());
		om.setDiscountRate(rs.get(0).getDiscountRate());
		list.add(om);
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("list", list);
		return "list";
	}
	
	public String save()throws Exception{
		try{
			OmNormalDiscount discount = new OmNormalDiscount();
			discount.setDiscountId(this.discount_id);
			discount.setDiscountName(this.discount_name);
			discount.setDiscountRate(this.discount_rate);
			discount.setDiscountBase(this.discount_base);
			discount.setType(this.type);
			discount.setBaseQty(this.base_qty);
			discount.setActivity(this.activity);
			discountService.save(discount);		
		return "addlist";
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public String add()throws Exception{
		try {
			OmNormalDiscount discount = new OmNormalDiscount();			
			discount.setDiscountName(this.discount_name);
			discount.setDiscountRate(this.discount_rate);
			discount.setDiscountBase(this.discount_base);
			discount.setType(this.type);
			discount.setBaseQty(this.base_qty);
			discount.setActivity(this.activity);
			discountService.save(discount);
			return "addlist";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Double getDiscount_rate() {
		return discount_rate;
	}



	public void setDiscount_rate(Double discount_rate) {
		this.discount_rate = discount_rate;
	}



	public String getDiscount_base() {
		return discount_base;
	}



	public void setDiscount_base(String discount_base) {
		this.discount_base = discount_base;
	}



	public String getBase_qty() {
		return base_qty;
	}



	public void setBase_qty(String base_qty) {
		this.base_qty = base_qty;
	}



	public String getActivity() {
		return activity;
	}



	public void setActivity(String activity) {
		this.activity = activity;
	}



	public int getDiscount_id() {
		return discount_id;
	}



	public void setDiscount_id(int discount_id) {
		this.discount_id = discount_id;
	}



	public String getDiscount_name() {
		return discount_name;
	}



	public void setDiscount_name(String discount_name) {
		this.discount_name = discount_name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}

	HttpServletResponse response = ServletActionContext.getResponse();
	

	public normalDiscountService getDiscountService() {
		return discountService;
	}



	public void setDiscountService(normalDiscountService discountService) {
		this.discountService = discountService;
	}
	
}
