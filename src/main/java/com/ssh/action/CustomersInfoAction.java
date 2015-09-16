package com.ssh.action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.model.OmCustDiscount;
import com.ssh.model.OmCustomersInfo;
import com.ssh.service.ICustomersInfoService;
@ParentPackage("basePackage")
@Action(value="custInfo")
@Namespace("/")
public class CustomersInfoAction extends ActionSupport implements RequestAware{
	private Map<String, Object> request;
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	private String customerName;private String customerCode;
	private String addressLine1;private String addressLine2;
	private String portOfDestination;private String shippingMark;
	private String invoiceGroup;private Integer discountId;
	private String markupName;private String paymentTerm;
	private String priceTerm1;private String priceTerm2;
	private String mailFrom;private String prePoMailto;
	private String poMailto;private String ocPiMailto;
	private String invPklistMailto;
	private OmCustomersInfo custInfo;
	public void setCustInfo(OmCustomersInfo custInfo) {
		this.custInfo = custInfo;
	}
	
	@Autowired
	private ICustomersInfoService customersInfoService;
	
	/**
     * http://localhost:8080/omSSH/custInfo-getAll
     * MethodName: getAll
     * Description: 获取汇总客户信息
     * @author mclin
     */
	public String getAll(){
		System.out.println("====== Action: getAll()... ======");		
		custInfo.setCustomerName(customerName);
		custInfo.setAddressLine1(addressLine1);	
		request.put("customers", customersInfoService.getCustomersInfo(custInfo));
		System.out.println("====== Action: getAll() Done. ======");
		return "select_all";
	}
	
	/**
     * http://localhost:8080/omSSH/custInfo-addCust
     * MethodName: addCust
     * Description: 新建客户信息
     * @author mclin
     */
	public void addCust(){
		//设置属性，框架无法识别两个单词驼峰式的name
		custInfo.setCustomerName(customerName);custInfo.setCustomerCode(customerCode);
		custInfo.setAddressLine1(addressLine1);custInfo.setAddressLine2(addressLine2);
		custInfo.setPortOfDestination(portOfDestination);custInfo.setShippingMark(shippingMark);
		custInfo.setInvoiceGroup(invoiceGroup);custInfo.setMarkupName(markupName);
		custInfo.setPaymentTerm(paymentTerm);custInfo.setPriceTerm1(priceTerm1);
		custInfo.setPriceTerm2(priceTerm2);
		OmCustDiscount custDiscount = new OmCustDiscount();
		custDiscount.setDiscountId(discountId);custInfo.setOmCustDiscount(custDiscount);
		System.out.println(discountId);
		System.out.println("name="+custInfo.getCustomerName()+", code="+custInfo.getCustomerCode()
							+", address1="+custInfo.getAddressLine1()+", address2="+custInfo.getAddressLine2());
		System.out.println("port="+custInfo.getPortOfDestination()+", mark="+custInfo.getShippingMark()
							+", groop="+custInfo.getInvoiceGroup()+", markup="+custInfo.getMarkupName());
		System.out.println("payment="+custInfo.getPaymentTerm()+", price1="+custInfo.getPriceTerm1()
							+", price2="+custInfo.getPriceTerm2()+", discountId="+custInfo.getOmCustDiscount().getDiscountId());
		
		System.out.println("====== Action: addCust() Done. ======");
	}
	
	
	/**
	 * getter and setter方法
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public void setCportOfDestination(String portOfDestination) {
		this.portOfDestination = portOfDestination;
	}
	public void setShippingMark(String shippingMark) {
		this.shippingMark = shippingMark;
	}
	public void setInvoiceGroup(String invoiceGroup) {
		this.invoiceGroup = invoiceGroup;
	}
	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}
	public void setMarkupName(String markupName) {
		this.markupName = markupName;
	}
	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}
	public void setPriceTerm1(String priceTerm1) {
		this.priceTerm1 = priceTerm1;
	}
	public void setPriceTerm2(String priceTerm2) {
		this.priceTerm2 = priceTerm2;
	}
	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}
	public void setPrePoMailto(String prePoMailto) {
		this.prePoMailto = prePoMailto;
	}
	public void setPoMailto(String poMailto) {
		this.poMailto = poMailto;
	}
	public void setOcPiMailto(String ocPiMailto) {
		this.ocPiMailto = ocPiMailto;
	}
	public void setInvPklistMailto(String invPklistMailto) {
		this.invPklistMailto = invPklistMailto;
	}
	public void setCustomersInfoService(ICustomersInfoService customersInfoService) {
		this.customersInfoService = customersInfoService;
	}	
}
