package com.ssh.model;

import java.util.Date;

/**
 * OmCustPriceList entity. @author MyEclipse Persistence Tools
 */

public class OmCustPriceList implements java.io.Serializable {

	// Fields

	private Integer plId;
	private OmCustomersInfo omCustomersInfo;
	private String type;
	private String plYhItem;
	private Date effectiveDateForm;
	private Date effectiveDateTo;
	private String userDef1;
	private String userDef2;
	private String userDef3;
	private String userDef4;
	private String userDef5;

	// Constructors

	/** default constructor */
	public OmCustPriceList() {
	}

	/** minimal constructor */
	public OmCustPriceList(String type, String plYhItem) {
		this.type = type;
		this.plYhItem = plYhItem;
	}

	/** full constructor */
	public OmCustPriceList(OmCustomersInfo omCustomersInfo, String type,
			String plYhItem, Date effectiveDateForm, Date effectiveDateTo,
			String userDef1, String userDef2, String userDef3, String userDef4,
			String userDef5) {
		this.omCustomersInfo = omCustomersInfo;
		this.type = type;
		this.plYhItem = plYhItem;
		this.effectiveDateForm = effectiveDateForm;
		this.effectiveDateTo = effectiveDateTo;
		this.userDef1 = userDef1;
		this.userDef2 = userDef2;
		this.userDef3 = userDef3;
		this.userDef4 = userDef4;
		this.userDef5 = userDef5;
	}

	// Property accessors

	public Integer getPlId() {
		return this.plId;
	}

	public void setPlId(Integer plId) {
		this.plId = plId;
	}

	public OmCustomersInfo getOmCustomersInfo() {
		return this.omCustomersInfo;
	}

	public void setOmCustomersInfo(OmCustomersInfo omCustomersInfo) {
		this.omCustomersInfo = omCustomersInfo;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlYhItem() {
		return this.plYhItem;
	}

	public void setPlYhItem(String plYhItem) {
		this.plYhItem = plYhItem;
	}

	public Date getEffectiveDateForm() {
		return this.effectiveDateForm;
	}

	public void setEffectiveDateForm(Date effectiveDateForm) {
		this.effectiveDateForm = effectiveDateForm;
	}

	public Date getEffectiveDateTo() {
		return this.effectiveDateTo;
	}

	public void setEffectiveDateTo(Date effectiveDateTo) {
		this.effectiveDateTo = effectiveDateTo;
	}

	public String getUserDef1() {
		return this.userDef1;
	}

	public void setUserDef1(String userDef1) {
		this.userDef1 = userDef1;
	}

	public String getUserDef2() {
		return this.userDef2;
	}

	public void setUserDef2(String userDef2) {
		this.userDef2 = userDef2;
	}

	public String getUserDef3() {
		return this.userDef3;
	}

	public void setUserDef3(String userDef3) {
		this.userDef3 = userDef3;
	}

	public String getUserDef4() {
		return this.userDef4;
	}

	public void setUserDef4(String userDef4) {
		this.userDef4 = userDef4;
	}

	public String getUserDef5() {
		return this.userDef5;
	}

	public void setUserDef5(String userDef5) {
		this.userDef5 = userDef5;
	}

}