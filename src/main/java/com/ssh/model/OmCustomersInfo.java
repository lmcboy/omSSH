package com.ssh.model;

import java.util.HashSet;
import java.util.Set;

/**
 * OmCustomersInfo entity. @author MyEclipse Persistence Tools
 */

public class OmCustomersInfo implements java.io.Serializable {

	// Fields

	private Integer custId;
	private OmCustDiscount omCustDiscount;
	private String customerName;
	private String customerCode;
	private String addressLine1;
	private String addressLine2;
	private String postcode;
	private String portOfDestination;
	private String shippingMark;
	private String status;
	private String invoiceGroup;
	private String paymentTerm;
	private String priceTerm1;
	private String priceTerm2;
	private String markupName;
	private Set omSpecialDiscounts = new HashSet(0);
	private Set omCustContactorses = new HashSet(0);
	private Set omSpecialDiscountAppliedRecordses = new HashSet(0);
	private Set omCustPriceListConfigs = new HashSet(0);
	private Set omCustPriceLists = new HashSet(0);

	// Constructors

	/** default constructor */
	public OmCustomersInfo() {
	}

	/** minimal constructor */
	public OmCustomersInfo(String customerName, String customerCode,
			String portOfDestination, String shippingMark, String status,
			String paymentTerm, String markupName) {
		this.customerName = customerName;
		this.customerCode = customerCode;
		this.portOfDestination = portOfDestination;
		this.shippingMark = shippingMark;
		this.status = status;
		this.paymentTerm = paymentTerm;
		this.markupName = markupName;
	}

	/** full constructor */
	public OmCustomersInfo(OmCustDiscount omCustDiscount, String customerName,
			String customerCode, String addressLine1, String addressLine2,
			String postcode, String portOfDestination, String shippingMark,
			String status, String invoiceGroup, String paymentTerm,
			String priceTerm1, String priceTerm2, String markupName,
			Set omSpecialDiscounts, Set omCustContactorses,
			Set omSpecialDiscountAppliedRecordses, Set omCustPriceListConfigs,
			Set omCustPriceLists) {
		this.omCustDiscount = omCustDiscount;
		this.customerName = customerName;
		this.customerCode = customerCode;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.postcode = postcode;
		this.portOfDestination = portOfDestination;
		this.shippingMark = shippingMark;
		this.status = status;
		this.invoiceGroup = invoiceGroup;
		this.paymentTerm = paymentTerm;
		this.priceTerm1 = priceTerm1;
		this.priceTerm2 = priceTerm2;
		this.markupName = markupName;
		this.omSpecialDiscounts = omSpecialDiscounts;
		this.omCustContactorses = omCustContactorses;
		this.omSpecialDiscountAppliedRecordses = omSpecialDiscountAppliedRecordses;
		this.omCustPriceListConfigs = omCustPriceListConfigs;
		this.omCustPriceLists = omCustPriceLists;
	}

	// Property accessors

	public Integer getCustId() {
		return this.custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public OmCustDiscount getOmCustDiscount() {
		return this.omCustDiscount;
	}

	public void setOmCustDiscount(OmCustDiscount omCustDiscount) {
		this.omCustDiscount = omCustDiscount;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPortOfDestination() {
		return this.portOfDestination;
	}

	public void setPortOfDestination(String portOfDestination) {
		this.portOfDestination = portOfDestination;
	}

	public String getShippingMark() {
		return this.shippingMark;
	}

	public void setShippingMark(String shippingMark) {
		this.shippingMark = shippingMark;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInvoiceGroup() {
		return this.invoiceGroup;
	}

	public void setInvoiceGroup(String invoiceGroup) {
		this.invoiceGroup = invoiceGroup;
	}

	public String getPaymentTerm() {
		return this.paymentTerm;
	}

	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}

	public String getPriceTerm1() {
		return this.priceTerm1;
	}

	public void setPriceTerm1(String priceTerm1) {
		this.priceTerm1 = priceTerm1;
	}

	public String getPriceTerm2() {
		return this.priceTerm2;
	}

	public void setPriceTerm2(String priceTerm2) {
		this.priceTerm2 = priceTerm2;
	}

	public String getMarkupName() {
		return this.markupName;
	}

	public void setMarkupName(String markupName) {
		this.markupName = markupName;
	}

	public Set getOmSpecialDiscounts() {
		return this.omSpecialDiscounts;
	}

	public void setOmSpecialDiscounts(Set omSpecialDiscounts) {
		this.omSpecialDiscounts = omSpecialDiscounts;
	}

	public Set getOmCustContactorses() {
		return this.omCustContactorses;
	}

	public void setOmCustContactorses(Set omCustContactorses) {
		this.omCustContactorses = omCustContactorses;
	}

	public Set getOmSpecialDiscountAppliedRecordses() {
		return this.omSpecialDiscountAppliedRecordses;
	}

	public void setOmSpecialDiscountAppliedRecordses(
			Set omSpecialDiscountAppliedRecordses) {
		this.omSpecialDiscountAppliedRecordses = omSpecialDiscountAppliedRecordses;
	}

	public Set getOmCustPriceListConfigs() {
		return this.omCustPriceListConfigs;
	}

	public void setOmCustPriceListConfigs(Set omCustPriceListConfigs) {
		this.omCustPriceListConfigs = omCustPriceListConfigs;
	}

	public Set getOmCustPriceLists() {
		return this.omCustPriceLists;
	}

	public void setOmCustPriceLists(Set omCustPriceLists) {
		this.omCustPriceLists = omCustPriceLists;
	}

}