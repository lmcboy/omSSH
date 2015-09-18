//保存地址信息
function update_address(btn){
	var div = $(btn).parents("form").children("div");
	var custId = div.eq(0).children("input").val();
	var addressLine1 = div.eq(1).children("input").val();
	var addressLine2 = div.eq(2).children("input").val();
	var postcode = div.eq(6).children("input").val();
	var portOfDestination = div.eq(7).children("input").val();
	var shippingMark = div.eq(8).children("input").val();
//	alert("custId="+custId+" ,address1="+addressLine1+" ,address2="+addressLine2
//			+" ,postcode="+postcode+" ,portOfDestination="+portOfDestination
//			+" ,shippingMark="+shippingMark);
	if(portOfDestination.trim()==""){
  		alert("目的港不能为空！");
  		div.eq(7).children("input").focus();
  	}else if(shippingMark.trim()==""){
  		alert("唛头不能为空！");
  		div.eq(8).children("input").focus();
  	}else{
  		var url = "http://localhost:8080/omSSH/custInfo-updateCustAddress";
  		var args = {"custId":custId, "addressLine1":addressLine1, "addressLine2":addressLine2,
  					"postcode":postcode, "portOfDestination":portOfDestination,
  					"shippingMark":shippingMark};
  		$.post(url, args, function(data){
  			if(data == "1"){
  				alert("保存客户地址信息成功！");
  			}else{
  				alert("保存客户地址信息失败，请重试！");
  			}
  		}).error(function(){
  	        alert("通讯有问题，请稍后重试!");
  	    });
  	}	          
}
//保存客户付款信息
function update_pay(btn){
	var div = $(btn).parents("form").children("div");
	var custId = div.eq(0).children("input").val();
	var invoiceGroup = div.eq(1).children("input").val();
	var discountId = div.eq(2).children("input").val();
	var markupName = div.eq(5).children("select").val();
	var paymentTerm = div.eq(6).children("select").val();
	var priceTerm1 = div.eq(7).children("input").val();
	var priceTerm2 = div.eq(8).children("input").val();
//	alert("custId="+custId+" ,invoiceGroup="+invoiceGroup+" ,discountId="+discountId
//			+" ,markupName="+markupName+" ,paymentTerm="+paymentTerm
//			+" ,priceTerm1="+priceTerm1+", priceTerm2="+priceTerm2);
	if(invoiceGroup.trim()==""){
			alert("所属发票组不能为空！");
			div.eq(1).children("input").focus();
	}else{
  		var url = "http://localhost:8080/omSSH/custInfo-updateCustPay";
  		var args = {"custId":custId, "invoiceGroup":invoiceGroup, "discountId":discountId,
  					"markupName":markupName, "paymentTerm":paymentTerm,
  					"priceTerm1":priceTerm1, "priceTerm2":priceTerm2};
  		$.post(url, args, function(data){
  			if(data == "1"){
  				alert("保存客户付款信息成功！");
  			}else{
  				alert("保存客户付款信息失败，请重试！");
  			}
  		}).error(function(){
  	        alert("通讯有问题，请稍后重试!");
  	    });
  	}	          
}
//保存客户联系人信息
function update_contactors(btn){
	var div = $(btn).parents("form").children("div");
	var custId = div.eq(0).children("input").val();
	var mailFrom = div.eq(1).children("input").val();
	var prePoMailto = div.eq(2).children("input").val();
	var poMailto = div.eq(3).children("input").val();
	var ocPiMailto = div.eq(4).children("input").val();
	var invPklistMailto = div.eq(5).children("input").val();
//	alert("ccId="+ccId+" ,mailFrom="+mailFrom+" ,prePoMailto="+prePoMailto
//			+" ,poMailto="+poMailto+" ,ocPiMailto="+ocPiMailto
//			+" ,invPklistMailto="+invPklistMailto);
	
  	var url = "http://localhost:8080/omSSH/custInfo-updateCustContactors";
  	var args = {"custId":custId, "mailFrom":mailFrom, "prePoMailto":prePoMailto,
  				"poMailto":poMailto, "ocPiMailto":ocPiMailto,
  				"invPklistMailto":invPklistMailto};
  	$.post(url, args, function(data){
  		if(data == "1"){
  			alert("保存客户联系人信息成功！");
  		}else{
  			alert("保存客户联系人信息失败，请重试！");
  		}
  	}).error(function(){
  	    alert("通讯有问题，请稍后重试!");
  	});	          
}
