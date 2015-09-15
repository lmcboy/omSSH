package com.ssh.model;

/**
 * OmCustPriceListConfig entity. @author MyEclipse Persistence Tools
 */

public class OmCustPriceListConfig implements java.io.Serializable {

	// Fields

	private Integer plcId;
	private OmCustomersInfo omCustomersInfo;
	private String displayName;
	private String priceListCol;
	private String excelCol;
	private String activity;

	// Constructors

	/** default constructor */
	public OmCustPriceListConfig() {
	}

	/** minimal constructor */
	public OmCustPriceListConfig(OmCustomersInfo omCustomersInfo) {
		this.omCustomersInfo = omCustomersInfo;
	}

	/** full constructor */
	public OmCustPriceListConfig(OmCustomersInfo omCustomersInfo,
			String displayName, String priceListCol, String excelCol,
			String activity) {
		this.omCustomersInfo = omCustomersInfo;
		this.displayName = displayName;
		this.priceListCol = priceListCol;
		this.excelCol = excelCol;
		this.activity = activity;
	}

	// Property accessors

	public Integer getPlcId() {
		return this.plcId;
	}

	public void setPlcId(Integer plcId) {
		this.plcId = plcId;
	}

	public OmCustomersInfo getOmCustomersInfo() {
		return this.omCustomersInfo;
	}

	public void setOmCustomersInfo(OmCustomersInfo omCustomersInfo) {
		this.omCustomersInfo = omCustomersInfo;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getPriceListCol() {
		return this.priceListCol;
	}

	public void setPriceListCol(String priceListCol) {
		this.priceListCol = priceListCol;
	}

	public String getExcelCol() {
		return this.excelCol;
	}

	public void setExcelCol(String excelCol) {
		this.excelCol = excelCol;
	}

	public String getActivity() {
		return this.activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

}