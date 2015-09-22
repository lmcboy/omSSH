package com.ssh.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.ssh.model.OmCustPriceList;
import com.ssh.model.OmCustomersInfo;
import com.ssh.service.PriceService;

public class PriceAction {
	private String code;
	private File priceEXCEL;
	static int custId;
	private String plYhItem;
	private String effectiveDateForm;
	private String effectiveDateTo;
	private String userDef1;
	private String userDef2;
	private String userDef3;
	private String userDef4;
	private String userDef5;

	@Autowired
	private PriceService priceService;
	Map session = ActionContext.getContext().getSession();

	public String getHead(){
		if(custId==0){
		custId =priceService.getCustid(code); }
		//		System.out.println(custId+"-------");
		List head_col =priceService.getHead(custId);
		String[] head =new String[head_col.size()/2];
		int[] plc =new int[head_col.size()/2];
		String splc;
		for (int i = 0; i < (head_col.size()/2); i++) {
			head[i]=(String) head_col.get(i);
			plc[i]=(Integer) head_col.get(head_col.size()/2+i);
			//			System.out.println(plc[i]+"-----------");
		}
		session.put("head", head);
		List data = new ArrayList();
		for (int j = 0; j < head.length; j++) {
			String[] sdata=priceService.getDataByName(priceService.getDname(plc[j]), custId);
			for (int k = 0; k < sdata.length; k++) {
				data.add(sdata[k]);
			}
		}

		session.put("data", data);
		String[] addhead = priceService.getDnameBy(custId);
		session.put("addhead", addhead);
		return "success2";
	}
	
	public String addPrice(){
		OmCustPriceList opl = new OmCustPriceList();
		opl.setPlYhItem(plYhItem);
		try {
			opl.setEffectiveDateForm(new SimpleDateFormat("yyyyMMdd").parse(effectiveDateForm));
			opl.setEffectiveDateTo(new SimpleDateFormat("yyyyMMdd").parse(effectiveDateTo));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		opl.setUserDef1(userDef1);
		opl.setUserDef2(userDef2);
		opl.setUserDef3(userDef3);
		opl.setUserDef4(userDef4);
		opl.setUserDef5(userDef5);
		OmCustomersInfo cus = priceService.getCustomer(custId);
		opl.setOmCustomersInfo(cus);
		opl.setType("STD");
		priceService.add(opl);
		return getHead();
	}

	public String outExcel(){
		String[] head = (String[]) session.get("head");
		List data = (List) session.get("data");
		// 第一步，创建一个webbook，对应一个Excel文件
		HSSFWorkbook wb = new HSSFWorkbook();
		// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
		HSSFSheet sheet = wb.createSheet("price");
		// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
		HSSFRow row = sheet.createRow((int) 0);
		// 第四步，创建单元格，并设置值表头 设置表头居中
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
		HSSFCell cell = row.createCell((short) 0);
		cell.setCellValue(head[0]);
		cell.setCellStyle(style);
		for (int i = 1; i < head.length; i++) {
			cell = row.createCell((short) i);
			cell.setCellValue(head[i]);
			cell.setCellStyle(style);
		}

		String d;
		if(head!=null){ 
			for(int j=0;j<(data.size()/head.length);j++){
				row = sheet.createRow((int) j + 1);
				for(int k=0;k<head.length;k++){
					d=(String) data.get(j+k*(data.size()/head.length));
					row.createCell((short) k).setCellValue(d);
				}
			}
		}

		try {
			FileOutputStream outExc = new FileOutputStream("E:/Price.xls");
			wb.write(outExc);
			outExc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success2";
	}

	public String inExcel(){
		try {
			FileInputStream fIn=new FileInputStream(priceEXCEL);
			HSSFWorkbook readWorkBook= new HSSFWorkbook(fIn);
			HSSFSheet readSheet= readWorkBook.getSheet("price"); 
			//			HSSFRow readRow =readSheet.getRow(0);  
			//			HSSFCell readCell = readRow.getCell((short)0);
			//			System.out.println("第一个单元是：" + readCell.getStringCellValue()); 

			int rowcount = readSheet.getLastRowNum();
			for(int i=1;i<=rowcount;i++){
				HSSFRow readRow =readSheet.getRow(i);
				int cellcount = readRow.getLastCellNum();
				for(int j=0;j<cellcount;j++){
					readRow.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
					System.out.print(readRow.getCell(j).getStringCellValue()+" ");
				}
				System.out.println("");
			}


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success2";
	}





	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	public File getPriceEXCEL() {
		return priceEXCEL;
	}

	public void setPriceEXCEL(File priceEXCEL) {
		this.priceEXCEL = priceEXCEL;
	}
	public String getPlYhItem() {
		return plYhItem;
	}
	public void setPlYhItem(String plYhItem) {
		this.plYhItem = plYhItem;
	}
	public String getEffectiveDateForm() {
		return effectiveDateForm;
	}
	public void setEffectiveDateForm(String effectiveDateForm) {
		this.effectiveDateForm = effectiveDateForm;
	}
	public String getEffectiveDateTo() {
		return effectiveDateTo;
	}
	public void setEffectiveDateTo(String effectiveDateTo) {
		this.effectiveDateTo = effectiveDateTo;
	}
	public String getUserDef1() {
		return userDef1;
	}
	public void setUserDef1(String userDef1) {
		this.userDef1 = userDef1;
	}
	public String getUserDef2() {
		return userDef2;
	}
	public void setUserDef2(String userDef2) {
		this.userDef2 = userDef2;
	}
	public String getUserDef3() {
		return userDef3;
	}
	public void setUserDef3(String userDef3) {
		this.userDef3 = userDef3;
	}
	public String getUserDef4() {
		return userDef4;
	}
	public void setUserDef4(String userDef4) {
		this.userDef4 = userDef4;
	}
	public String getUserDef5() {
		return userDef5;
	}
	public void setUserDef5(String userDef5) {
		this.userDef5 = userDef5;
	}
	
	





}
