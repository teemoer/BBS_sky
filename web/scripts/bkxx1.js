$(function(){//页面载入后执行,body内容载入
	$.ajax({
		url:"/zy/bk.do",
		type:"post",
		dataType:"json",
		success:function(result){
			//result是服务器返回的json结果
			if(result.status==0) {//成功
				var bk = result.data;
				var bkxxs = result.data2;

				for(var i=0;i<bk.length;i++){
					var bid = bk[i].bid;
					var uid = bk[i].uid;
					var bname =bk[i].bname;
					var bclass =bk[i].bclass;
					var uname =bk[i].uname;
					//拼一个元素DIV
					var DIVS ='<dl class="">';
					DIVS+='<dt class="J_sidebar_forum_toggle"><a href="http://www.phpwind.net/thread/1">';
					DIVS+=bname;
					DIVS+='</a></dt>';
					DIVS+='<dd role="tabpanel">';
					for(var j=0;j<bkxxs.length;j++){
						var sid = bkxxs[j].sid;
						var bclass1 = bkxxs[j].bclass;
						var sname =bkxxs[j].sname;

						//拼一个元素DIV
						if (bclass==bclass1){


							DIVS+='<p><a class="" href="http://www.phpwind.net/thread/78">'+sname+'</a></p>';



						}



					}
					DIVS+='</dd> </dl>'


					//将sli字符串转成jQuery对象,然后使用data函数藏bookId值
					var $DIV = $(DIVS);

					//将$li元素添加到id=book_list的<ul>中
					$("#bklb").append($DIV);
				}
			}
		},
		error:function(){
			alert("系统错误");
		}
	});

});
