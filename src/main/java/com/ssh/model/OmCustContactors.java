package com.ssh.model;

/**
 * OmCustContactors entity. @author MyEclipse Persistence Tools
 */

public class OmCustContactors implements java.io.Serializable {

	// Fields

	private Integer ccId;
	private OmCustomersInfo omCustomersInfo;
	private String mailFrom;
	private String prePoMailto;
	private String poMailto;
	private String ocPiMailto;
	private String invPklistMailto;

	// Constructors

	/** default constructor */
	public OmCustContactors() {
	}

	/** minimal constructor */
	public OmCustContactors(OmCustomersInfo omCustomersInfo) {
		this.omCustomersInfo = omCustomersInfo;
	}

	/** full constructor */
	public OmCustContactors(OmCustomersInfo omCustomersInfo, String mailFrom,
			String prePoMailto, String poMailto, String ocPiMailto,
			String invPklistMailto) {
		this.omCustomersInfo = omCustomersInfo;
		this.mailFrom = mailFrom;
		this.prePoMailto = prePoMailto;
		this.poMailto = poMailto;
		this.ocPiMailto = ocPiMailto;
		this.invPklistMailto = invPklistMailto;
	}

	// Property accessors

	public Integer getCcId() {
		return this.ccId;
	}

	public void setCcId(Integer ccId) {
		this.ccId = ccId;
	}

	public OmCustomersInfo getOmCustomersInfo() {
		return this.omCustomersInfo;
	}

	public void setOmCustomersInfo(OmCustomersInfo omCustomersInfo) {
		this.omCustomersInfo = omCustomersInfo;
	}

	public String getMailFrom() {
		return this.mailFrom;
	}

	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}

	public String getPrePoMailto() {
		return this.prePoMailto;
	}

	public void setPrePoMailto(String prePoMailto) {
		this.prePoMailto = prePoMailto;
	}

	public String getPoMailto() {
		return this.poMailto;
	}

	public void setPoMailto(String poMailto) {
		this.poMailto = poMailto;
	}

	public String getOcPiMailto() {
		return this.ocPiMailto;
	}

	public void setOcPiMailto(String ocPiMailto) {
		this.ocPiMailto = ocPiMailto;
	}

	public String getInvPklistMailto() {
		return this.invPklistMailto;
	}

	public void setInvPklistMailto(String invPklistMailto) {
		this.invPklistMailto = invPklistMailto;
	}

}