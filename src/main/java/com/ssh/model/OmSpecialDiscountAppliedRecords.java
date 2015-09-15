package com.ssh.model;

import java.util.Date;

/**
 * OmSpecialDiscountAppliedRecords entity. @author MyEclipse Persistence Tools
 */

public class OmSpecialDiscountAppliedRecords implements java.io.Serializable {

	// Fields

	private Integer sdarId;
	private OmCustomersInfo omCustomersInfo;
	private String discountName;
	private String adnIdentifyNum;
	private String appliedAmount;
	private Date appliedDate;
	private Integer cancel;
	private String cancelDate;
	private String custCode;

	// Constructors

	/** default constructor */
	public OmSpecialDiscountAppliedRecords() {
	}

	/** minimal constructor */
	public OmSpecialDiscountAppliedRecords(OmCustomersInfo omCustomersInfo,
			String discountName, String adnIdentifyNum, String appliedAmount,
			Date appliedDate) {
		this.omCustomersInfo = omCustomersInfo;
		this.discountName = discountName;
		this.adnIdentifyNum = adnIdentifyNum;
		this.appliedAmount = appliedAmount;
		this.appliedDate = appliedDate;
	}

	/** full constructor */
	public OmSpecialDiscountAppliedRecords(OmCustomersInfo omCustomersInfo,
			String discountName, String adnIdentifyNum, String appliedAmount,
			Date appliedDate, Integer cancel, String cancelDate, String custCode) {
		this.omCustomersInfo = omCustomersInfo;
		this.discountName = discountName;
		this.adnIdentifyNum = adnIdentifyNum;
		this.appliedAmount = appliedAmount;
		this.appliedDate = appliedDate;
		this.cancel = cancel;
		this.cancelDate = cancelDate;
		this.custCode = custCode;
	}

	// Property accessors

	public Integer getSdarId() {
		return this.sdarId;
	}

	public void setSdarId(Integer sdarId) {
		this.sdarId = sdarId;
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

	public String getAdnIdentifyNum() {
		return this.adnIdentifyNum;
	}

	public void setAdnIdentifyNum(String adnIdentifyNum) {
		this.adnIdentifyNum = adnIdentifyNum;
	}

	public String getAppliedAmount() {
		return this.appliedAmount;
	}

	public void setAppliedAmount(String appliedAmount) {
		this.appliedAmount = appliedAmount;
	}

	public Date getAppliedDate() {
		return this.appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public Integer getCancel() {
		return this.cancel;
	}

	public void setCancel(Integer cancel) {
		this.cancel = cancel;
	}

	public String getCancelDate() {
		return this.cancelDate;
	}

	public void setCancelDate(String cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getCustCode() {
		return this.custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

}