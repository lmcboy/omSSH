package com.ssh.model;

/**
 * OmNormalDiscount entity. @author MyEclipse Persistence Tools
 */

public class OmNormalDiscount implements java.io.Serializable {

	// Fields

	private Integer discountId;
	private String discountName;
	private Double discountRate;
	private String discountBase;
	private String type;
	private String baseQty;
	private String activity;

	// Constructors

	/** default constructor */
	public OmNormalDiscount() {
	}

	/** minimal constructor */
	public OmNormalDiscount(Double discountRate, String activity) {
		this.discountRate = discountRate;
		this.activity = activity;
	}

	/** full constructor */
	public OmNormalDiscount(String discountName, Double discountRate,
			String discountBase, String type, String baseQty, String activity) {
		this.discountName = discountName;
		this.discountRate = discountRate;
		this.discountBase = discountBase;
		this.type = type;
		this.baseQty = baseQty;
		this.activity = activity;
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

	public Double getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}

	public String getDiscountBase() {
		return this.discountBase;
	}

	public void setDiscountBase(String discountBase) {
		this.discountBase = discountBase;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBaseQty() {
		return this.baseQty;
	}

	public void setBaseQty(String baseQty) {
		this.baseQty = baseQty;
	}

	public String getActivity() {
		return this.activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

}