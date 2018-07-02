//用户登录时，点击登录，表单进行提交
$(function(){
	alert("aaa");
	//获取cookie中的用户名填写到账号文本框中
	$("#inputName").val(getCookie("loginName"));
	$(".container form").submit(function(){
		alert("aaa");
		return login_from();
	})
})
function login_from(){
	alert("aaa11");
	//获取对应文本框中的内容
	var name=$("#inputName").val();
	var pwd=$("#inputPassword").val();
	var gxchecked=$(".container form input[type=checkbox]").get(0).checked;
	//发送异步请求，将数据发送到controller进行处理
	$.ajax({
		url:basePath+"user/login_for/"+name+"/"+pwd,
		type:"get",
		dataType:"json",
		success:function(result){
			if(result.status==1){
				//如果勾选了记住账号
				if(gxchecked){
					//添加cookie，存储到客户端浏览器中
					addCookie('loginName',name,5);
				}
				//登录成功则跳转到主页
				window.location.href="index.html";
				
			}
		},
	error:function(){
			alert("请求失败");
	}
	});
	return false;
}