function confirm_cust(btn,custId){
    var url = "http://localhost:8080/omSSH/custInfo-operateCust"
    var args = {"custId":custId};
    var td = $(btn).parents('tr').children('td');   
    $.post(url,args,function(data){
        if(data == "1"){
            alert("确认成功！");
            td.eq(3).text("有效");
        }else{
            alert("确认失败，请重试！")
        }
    }).error(function(){
        alert("通讯有问题，请稍后重试!");
    });  
}
