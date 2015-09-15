package com.ssh.model;

/**
 * OmSpecialDiscount entity. @author MyEclipse Persistence Tools
 */

public class OmSpecialDiscount implements java.io.Serializable {

	// Fields

	private Integer sdId;
	private OmCustomersInfo omCustomersInfo;
	private String discountName;
	private String custCode;
	private String amount;
	private String appliedAmount;
	private String balance;
	private String activity;

	// Constructors

	/** default constructor */
	public OmSpecialDiscount() {
	}

	/** minimal constructor */
	public OmSpecialDiscount(String discountName, String amount,
			String appliedAmount, String balance) {
		this.discountName = discountName;
		this.amount = amount;
		this.appliedAmount = appliedAmount;
		this.balance = balance;
	}

	/** full constructor */
	public OmSpecialDiscount(OmCustomersInfo omCustomersInfo,
			String discountName, String custCode, String amount,
			String appliedAmount, String balance, String activity) {
		this.omCustomersInfo = omCustomersInfo;
		this.discountName = discountName;
		this.custCode = custCode;
		this.amount = amount;
		this.appliedAmount = appliedAmount;
		this.balance = balance;
		this.activity = activity;
	}

	// Property accessors

	public Integer getSdId() {
		return this.sdId;
	}

	public void setSdId(Integer sdId) {
		this.sdId = sdId;
	}

	public OmCustomersInfo getOmCustomersInfo() {
		return this.omCustomersInfo;
	}

	public void setOmCustomersInfo(OmCustomersInfo omCustomersInfo) {
		this.omCustomersInfo = omCustomersInfo;
	}

	public String getDiscountName() {
		return this.discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getCustCode() {
		return this.custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAppliedAmount() {
		return this.appliedAmount;
	}

	public void setAppliedAmount(String appliedAmount) {
		this.appliedAmount = appliedAmount;
	}

	public String getBalance() {
		return this.balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getActivity() {
		return this.activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

}