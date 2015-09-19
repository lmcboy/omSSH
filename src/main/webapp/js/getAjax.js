function getOne(){
	var discount_name = $("#u245_input").val();
	var type =$("#u248_input").val();	
	$.ajax({
		url:'/omSSH/discount-findOne',
		dataType:'json',
		data:"discount_name="+discount_name+"&type="+type,
		success:function(data){
			var html ='<table class="table table-striped table-bordered table-hover"><thead><tr><td>序号</td><td>折扣名称</td><td>折扣类型</td><td>折扣基准</td><td>基准数量（片）</td><td>折扣率</td><td>有效</td><td>操作</td></tr></thead><tbody>';
			$.each(data,function(entryIndex,entry){
				html +='<tr><td>'+entry.discount_id+'</td>'+'<td>'+entry.discount_name+'</td>'+'<td>'+entry.type+'</td>'+'<td>'+entry.discount_base+'</td>'+'<td>'+entry.base_qty+'</td>'+'<td>'+entry.discount_rate+'</td>'+'<td>'+entry.activity+'</td>'+'<td><a href="discount-getOne?discount_id='+entry.discount_id+'">编制</a></td></tr>';
			});
			html+='</tbody></table>';
			$("#u142").html(html);
			return false;
		}
			
	});
}
function getJson(){
	var discount_name = $("#u257_input").val();
	var cust_code =$("#u262_input").val();	
	$.ajax({
		url:'/omSSH/special-specialFindByOne',
		dataType:'json',
		data:"discount_name="+discount_name+"&cust_code="+cust_code,
		success:function(data){
			var html ='<table class="table table-striped table-bordered table-hover"><thead><tr><td>序号</td><td>折扣名称</td><td>客户代码</td><td>折扣金额</td><td>已用金额</td><td>折扣余额</td><td>有效</td><td>操作</td><td>记录</td></tr></thead><tbody>';
			$.each(data,function(entryIndex,entry){
				html +='<tr><td>'+entry.sd_id+'</td>'+'<td>'+entry.discount_name+'</td>'+'<td>'+entry.cust_code+'</td>'+'<td>'+entry.amount+'</td>'+'<td>'+entry.applied_amount+'</td>'+'<td>'+entry.balance+'</td>'+'<td>'+entry.activity+'</td>'+'<td><a href="special-specialFindById?discount_id='+entry.sd_id+'">编制</a></td><td><a href="appliedRecord-findByName?discount_name='+entry.discount_name+'">查看</a></td></tr>';
			});
			html+='</tbody></table>';
			$("#u142").html(html);
			return false;
		}
			
	});
}
