package com.ssh.model;

import java.util.HashSet;
import java.util.Set;

/**
 * OmCustDiscount entity. @author MyEclipse Persistence Tools
 */

public class OmCustDiscount implements java.io.Serializable {

	// Fields

	private Integer discountId;
	private String discountName;
	private String type;
	private String default_;
	private String criterion;
	private String active;
	private String discountRate;
	private String baseQty;
	private Set omCustomersInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public OmCustDiscount() {
	}

	/** minimal constructor */
	public OmCustDiscount(String discountName, String type) {
		this.discountName = discountName;
		this.type = type;
	}

	/** full constructor */
	public OmCustDiscount(String discountName, String type, String default_,
			String criterion, String active, String discountRate,
			String baseQty, Set omCustomersInfos) {
		this.discountName = discountName;
		this.type = type;
		this.default_ = default_;
		this.criterion = criterion;
		this.active = active;
		this.discountRate = discountRate;
		this.baseQty = baseQty;
		this.omCustomersInfos = omCustomersInfos;
	}

	// Property accessors

	public Integer getDiscountId() {
		return this.discountId;
	}

	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	public String getDiscountName() {
		return this.discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDefault_() {
		return this.default_;
	}

	public void setDefault_(String default_) {
		this.default_ = default_;
	}

	public String getCriterion() {
		return this.criterion;
	}

	public void setCriterion(String criterion) {
		this.criterion = criterion;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}

	public String getBaseQty() {
		return this.baseQty;
	}

	public void setBaseQty(String baseQty) {
		this.baseQty = baseQty;
	}

	public Set getOmCustomersInfos() {
		return this.omCustomersInfos;
	}

	public void setOmCustomersInfos(Set omCustomersInfos) {
		this.omCustomersInfos = omCustomersInfos;
	}

}