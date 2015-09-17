package com.ssh.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.ssh.model.OmCustPriceListConfig;
import com.ssh.model.OmCustomersInfo;
import com.ssh.service.PriceConfigService;


public class PriceConfigAction {
	private int custId;
	private String plcid;
	private String dname;
	private String excel;
	private String act;
	static int pclen;
	static int custid;

	@Autowired
	private PriceConfigService pcService;
	Map session = ActionContext.getContext().getSession();
	
	public String pcShow(){
		List list = new ArrayList();
		session.put("pc", list);
		custid=custId;
		return "success";
	}
	
	public String getPc(){
		List<OmCustPriceListConfig> pc =  pcService.getPc(custId);
		pclen = pc.size();
		custid=custId;
		session.put("pc",pc);
		return "success";
	}
	
	public String updateAdd(){
//		System.out.println(custid);
//		System.out.println(pclen);
//		System.out.println(plcid);
		OmCustPriceListConfig opc = new OmCustPriceListConfig();
		String pcid[] = null;
		if(plcid!=null){
			pcid= plcid.split(",");
		}	
		String name[] = dname.split(",");
		String exc[] = excel.split(",");
		String atv[] = act.split(",");
		OmCustomersInfo oc = pcService.getCustomer(custid);
		opc.setOmCustomersInfo(oc);
		for(int i=0;i<pclen;i++){
			pcService.update(Integer.parseInt(pcid[i].trim()),name[i].trim(),exc[i].trim(),atv[i].trim());
		}
		for(int j=pclen;j<name.length;j++){
			if(!name[j].trim().equals("")||!exc[j].trim().equals("")){
//				System.out.println("--"+name[j]+"--");
//				System.out.println("--"+exc[j]+"--");
				opc.setDisplayName(name[j].trim());
				opc.setPriceListCol(String.valueOf(j+4));
				opc.setExcelCol(exc[j].trim());
				opc.setActivity(atv[j].trim());
				pcService.insert(opc);
			}
			
		}
		
		List<OmCustPriceListConfig> pc =  pcService.getPc(custid);
		pclen = pc.size();
		session.put("pc",pc);
		return "success";
	}

	
	
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getPlcid() {
		return plcid;
	}

	public void setPlcid(String plcid) {
		this.plcid = plcid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getExcel() {
		return excel;
	}

	public void setExcel(String excel) {
		this.excel = excel;
	}

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}
	
	
	
	
	
	
	
	
	
	

}
