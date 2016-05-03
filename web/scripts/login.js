$(function () {//页面载入后执行,body内容载入
    //绑定后绑定按钮事件
    $("#login").click(function () {
        //清空消息

        //获取请求参数
        var name = $("#J_u_login_username").val().trim();
        var password = $("#J_u_login_password").val().trim();
        //检查参数格式

        //发送ajax请求

        $.ajax({
            url: "/user/login.do",
            type: "get",
            data: {"uname": name, "upassword": password},
            dataType: "json",
            success: function (result) {
                alert("123s");
                //result是服务器返回的json结果
                if (result.status == 0) {//成功
                    alert(result.msg);
                    //cookie判断登录状态 0为未登录
                    addCookie("zxcvbnm","1",2);
                }else {
                    alert(result.msg);
                }

            },
            error: function () {
                alert("系统错误");
            }
        });

    });
    
});
