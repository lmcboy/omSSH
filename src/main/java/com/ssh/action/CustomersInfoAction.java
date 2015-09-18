package com.ssh.action;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.JsonObject;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.model.OmCustContactors;
import com.ssh.model.OmCustDiscount;
import com.ssh.model.OmCustomersInfo;
import com.ssh.service.ICustContactorsService;
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
	private String invPklistMailto;private String postcode;
	private Integer custId;
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	private OmCustomersInfo custInfo;
	public void setCustInfo(OmCustomersInfo custInfo) {
		this.custInfo = custInfo;
	}
	
	@Autowired
	private ICustomersInfoService customersInfoService;
	
	@Autowired
	private ICustContactorsService custContactorsService;
	/**
     * http://localhost:8080/omSSH/custInfo-getAll
     * MethodName: getAll
     * Description: 获取汇总客户信息
     * @author mclin
     */
	public String getAll(){
		System.out.println("====== Action: getAll()... ======");		
		custInfo.setCustomerName(customerName);
		custInfo.setCustomerCode(customerCode);	
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
	public String addCust(){
		//设置属性，框架无法识别两个单词的name
		System.out.println("====== Action: addCust()... ======");
		custInfo.setCustomerName(customerName);custInfo.setCustomerCode(customerCode);
		custInfo.setAddressLine1(addressLine1);custInfo.setAddressLine2(addressLine2);
		custInfo.setPortOfDestination(portOfDestination);custInfo.setShippingMark(shippingMark);
		custInfo.setInvoiceGroup(invoiceGroup);custInfo.setMarkupName(markupName);
		custInfo.setPaymentTerm(paymentTerm);custInfo.setPriceTerm1(priceTerm1);
		custInfo.setPriceTerm2(priceTerm2);custInfo.setPostcode(postcode);
		OmCustDiscount custDiscount = new OmCustDiscount();
		OmCustContactors custContactors = new OmCustContactors();
		custDiscount.setDiscountId(discountId);custInfo.setOmCustDiscount(custDiscount);
//		System.out.println(discountId);
//		System.out.println("name="+custInfo.getCustomerName()+", code="+custInfo.getCustomerCode()
//							+", address1="+custInfo.getAddressLine1()+", address2="+custInfo.getAddressLine2());
//		System.out.println("port="+custInfo.getPortOfDestination()+", mark="+custInfo.getShippingMark()
//							+", groop="+custInfo.getInvoiceGroup()+", markup="+custInfo.getMarkupName());
//		System.out.println("payment="+custInfo.getPaymentTerm()+", price1="+custInfo.getPriceTerm1()
//							+", price2="+custInfo.getPriceTerm2()+", discountId="+custInfo.getOmCustDiscount().getDiscountId());
		Integer custId;//新建客户的客户id
		try{
			custId = (Integer) customersInfoService.saveCustomer(custInfo);
			//添加联系人信息
			custInfo.setCustId(custId);
			custContactors.setOmCustomersInfo(custInfo);
			custContactors.setInvPklistMailto(invPklistMailto);
			custContactors.setMailFrom(mailFrom);
			custContactors.setOcPiMailto(ocPiMailto);
			custContactors.setPoMailto(poMailto);custContactors.setPrePoMailto(prePoMailto);
			custContactorsService.saveContactors(custContactors);
		}catch(Exception ex){
			ex.printStackTrace();
			request.put("flag", "添加新客户失败！");
			System.out.println("====== Action: addCust() Done. ======");
			return "add_fail";
		}
		request.put("flag", "添加新客户成功！");
		System.out.println("====== Action: addCust() Done. ======");
		return "add_success";
	}
	/**
     * http://localhost:8080/omSSH/custInfo-operateCust
     * MethodName: operateCust
     * Description: 确认客户信息(采用AJAX)
     * @author mclin
     */
	private InputStream inputStream;
	public InputStream getInputStream(){
		return inputStream;
	}
	public String operateCust() throws UnsupportedEncodingException{
		System.out.println("====== Action: operateCust()... ======");
		boolean FLAG = customersInfoService.updateCustStatus(custId);
		if(FLAG){
			inputStream = new ByteArrayInputStream("1".getBytes("UTF-8"));
		}else{
			inputStream = new ByteArrayInputStream("0".getBytes("UTF-8"));
		}
		System.out.println("====== Action: operateCust() Done ======");
		return "operate_done";
	}
	/**
     * http://localhost:8080/omSSH/custInfo-updateCust
     * MethodName: updateCust
     * Description: 根据客户ID获取客户详细信息
     * @author mclin
     */
	public String updateCust(){
		System.out.println("====== Action: updateCust()... ======");
		OmCustomersInfo omCustomersInfo = customersInfoService.getCustomerInfoById(custId);
		request.put("customer", omCustomersInfo);
		OmCustContactors omCustContactors = custContactorsService.getCustomerContactorsById(custId);
		System.out.println("+++++"+omCustContactors);
		request.put("contactor", omCustContactors);
		System.out.println("====== Action: updateCust() Done ======");
		return "update_cust";
	}
	/**
     * http://localhost:8080/omSSH/custInfo-lookCust
     * MethodName: lookCust
     * Description: 根据客户ID获取客户详细信息
     * @author mclin
     */
	public String lookCust(){
		System.out.println("====== Action: lookCust()... ======");
		OmCustomersInfo omCustomersInfo = customersInfoService.getCustomerInfoById(custId);
		request.put("customer", omCustomersInfo);
		OmCustContactors omCustContactors = custContactorsService.getCustomerContactorsById(custId);
		request.put("contactor", omCustContactors);
		System.out.println("====== Action: lookCust() Done ======");
		return "look_cust";
	}
	/**
     * http://localhost:8080/omSSH/custInfo-updateCustAddress
     * MethodName: updateCustAddress
     * Description: 更新客户地址信息
     * @author mclin
	 * @throws UnsupportedEncodingException 
     */
	public String updateCustAddress() throws UnsupportedEncodingException{
		System.out.println("====== Action: updateCustAddress()... ======");
		OmCustomersInfo oci = new OmCustomersInfo();
		oci.setCustId(custId);oci.setAddressLine1(addressLine1);
		oci.setAddressLine2(addressLine2);oci.setPostcode(postcode);
		oci.setPortOfDestination(portOfDestination);oci.setShippingMark(shippingMark);
		boolean FLAG = customersInfoService.updateCustAddress(oci);
		if(FLAG){
			inputStream = new ByteArrayInputStream("1".getBytes("UTF-8"));
		}else{
			inputStream = new ByteArrayInputStream("0".getBytes("UTF-8"));
		}
		System.out.println("====== Action: updateCustAddress() Done ======");
		return "update_done";
	}
	/**
     * http://localhost:8080/omSSH/custInfo-updateCustPay
     * MethodName: updateCustPay
     * Description: 更新客户付款信息
     * @author mclin
	 * @throws UnsupportedEncodingException 
     */
	public String updateCustPay() throws UnsupportedEncodingException{
		System.out.println("====== Action: updateCustPay()... ======");
		OmCustomersInfo oci = new OmCustomersInfo();
		oci.setCustId(custId);oci.setInvoiceGroup(invoiceGroup);
		oci.setMarkupName(markupName);oci.setPaymentTerm(paymentTerm);
		oci.setPriceTerm1(priceTerm1);oci.setPriceTerm2(priceTerm2);
		OmCustDiscount ocd = new OmCustDiscount();
		ocd.setDiscountId(discountId);oci.setOmCustDiscount(ocd);
		boolean FLAG = customersInfoService.updateCustPay(oci);
		if(FLAG){
			inputStream = new ByteArrayInputStream("1".getBytes("UTF-8"));
		}else{
			inputStream = new ByteArrayInputStream("0".getBytes("UTF-8"));
		}
		System.out.println("====== Action: updateCustPay() Done ======");
		return "update_done";
	}
	/**
     * http://localhost:8080/omSSH/custInfo-updateCustContactors
     * MethodName: updateCustContactors
     * Description: 更新客户联系人信息
     * @author mclin
	 * @throws UnsupportedEncodingException 
     */
	public String updateCustContactors() throws UnsupportedEncodingException{
		System.out.println("====== Action: updateCustContactors()... ======");
		OmCustomersInfo oci = new OmCustomersInfo();
		oci.setCustId(custId);
		OmCustContactors occ = new OmCustContactors();
		occ.setOmCustomersInfo(oci);
		occ.setInvPklistMailto(invPklistMailto);
		occ.setMailFrom(mailFrom);
		occ.setOcPiMailto(ocPiMailto);
		occ.setPoMailto(poMailto);
		occ.setPrePoMailto(prePoMailto);
		boolean FLAG = custContactorsService.updateCustContactors(occ);
		if(FLAG){
			inputStream = new ByteArrayInputStream("1".getBytes("UTF-8"));
		}else{
			inputStream = new ByteArrayInputStream("0".getBytes("UTF-8"));
		}
		System.out.println("====== Action: updateCustContactors Done ======");
		return "update_done";
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
	public void setPortOfDestination(String portOfDestination) {
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
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
}
