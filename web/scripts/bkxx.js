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
					var DIVS ='<div class="forum_group"><div class="box_title">';
					DIVS+='<div class="fr">';
					DIVS+='分栏版主：';
					DIVS+='<a class="J_user_card_show" data-username="admin" href="">'+uname+'</a></div>';
					DIVS+='<h2 class="cname"><a href="http://www.phpwind.net/thread/1">'+bname+'</a></h2>';
					DIVS+='</div>';
					DIVS+='<div class="ct">'
					DIVS+='<table width="100%" summary="横排版块排序" ><tr id="bkxx'+bid+'">'
					for(var j=0;j<bkxxs.length;j++){
						var sid = bkxxs[j].sid;
						var bclass1 = bkxxs[j].bclass;
						var sname =bkxxs[j].sname;
						
						//拼一个元素DIV
						if (bclass==bclass1){


							DIVS+='<th class="old">';
							DIVS+='<h3 class="fname"><a href="http://www.phpwind.net/thread/78"><fontcolor ="blue">'+sname+'</font></a></h3>';
							DIVS+='主题：0，回复：0<br>最后回复：'

							DIVS+='<a href="http://www.phpwind.net/read/3708877/e#a" rel="nofollow"><span class="time">04-22 18:36</span></a></th>';

						}



					}
					DIVS+='</tr> </table> </div></div>'
					//将sli字符串转成jQuery对象,然后使用data函数藏bookId值
					var $DIV = $(DIVS);

					//将$li元素添加到id=book_list的<ul>中
					$("#bkxx").append($DIV);
				}
			}
		},
		error:function(){
			alert("系统错误");
		}
	});
	$.ajax({
		url: "/user/loadDate.do",
		type: "get",
		dataType: "json",
		success: function (result) {
			alert("123s");
			//result是服务器返回的json结果
			if (result.status == 0) {//成功
				alert(result.msg);
				alert(result.data.uid);
				$("#weidenglu").hide();
				$("#yidenglu").show();
				
				$("#J_head_user_a").attr("title",result.data.uname);
				
			}else {

				$("#weidenglu").show();
				$("#yidenglu").hide();
				alert(result.msg);
			}

		},
		error: function () {
			alert("系统错误");
		}
	});

});
