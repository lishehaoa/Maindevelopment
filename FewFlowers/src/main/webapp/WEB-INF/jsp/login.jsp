<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<link rel="shortcut icon" href="static/images/huashao.png">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录页面</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-2.1.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/easyform.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css">
</head>
<body>
<br>
<div class="form-div">
    <form id="reg-form" method="post">
        <table>
            <tr>
                <td>用户号</td>
                <td><input type="text" name="login_username" id="uid" message="请输入11位手机号" maxlength="11">
                </td>
            </tr>
            <tr>
                <td>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码</td>
                <td><input type="password" name="login_password" id="psw1" message="密码必须为6位" maxlength="6"></td>
            </tr>
        </table>
        <div class="input-group">
	        <input type="hidden" id="login_status">
	    </div>
		<div class="buttons">
			<input value="登录" type="submit" style="margin-right:20px; margin-top:20px;" id="addUser">
			<input value="返回首页" type="button" style="margin-right:45px; margin-top:20px;" onclick="fanhui()">
        </div>
        <br class="clear">
    </form>
</div>
<script type="text/javascript">
$(document).ready(function () {
    $('#addUser').click(function () {
        $.ajax({
            type: "post",
            url: "login",
            data: {
            	login_username: $("#uid").val(),
            	login_password: $("#psw1").val(),
            },
            dataType: "JSON",
            async: false,
            beforeSend: function () {
                alert("正在提交");
            },
            success: function (data) {
            	if(data == 1){
            		alert("用户号或密码不能为空");
            	}else if (data == 2) {
                    alert("用户号必须是11位");
                }else if (data == 3) {
                    alert("密码必须是6位");
                }else if (data == 4) {
                    alert("用户不存在");
                }else if (data == 5) {
                    alert("您的账号已冻结，请联系管理员");
                }else if (data == 6) {
                    alert("密码不正确");
                }else{
                    alert("登录成功")
                    window.location.href="toFindFewFlowers";
                }
            },
            error: function () {
                alert("提交失败");
            }
        });
    })
})
$(document).ready(function(){
	$('#reg-form').easyform();
});

function fanhui(){
	window.location.href="tohomepage";
}
</script>
</body>
</html>
