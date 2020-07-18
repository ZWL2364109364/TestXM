<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

	<link type="text/css" rel="stylesheet" href="<%=request.getContextPath() %>/layui/css/layui.css" />

</head>
<body>
	
	
	<button type="button" class="layui-btn"  onclick="addUnit()">
		  <i class="layui-icon">&#xe608;</i> 添加
	</button>

		
		
		
		<table id="demo" lay-filter="test"></table>
		
			<script type="text/html" id="barDemo">
		   		<a class="layui-btn layui-btn-primary layui-btn-mini" lay-event="detail" id="find">查看</a>
				<a class="layui-btn layui-btn-mini" lay-event="edit" id="edit" >编辑</a>
				<a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="del" id="del" >删除</a> 
			</script>
		
		
	<script type="text/javascript" src="<%=request.getContextPath()%>/layui/layui.all.js"></script>
		
		
		
	<script type="text/javascript">
		
			layui.use(['table','jquery','layer','form'],function(){
				 var $=layui.$;
				 var table = layui.table;
				 var layer=layui.layer;
				 

				 /*弹出添加框*/
				 function addUnit() {
					 
					console.log("执行");
				 }
				 
				  
				  
				  /* 弹出修改窗 */
				  function edi(mun){
					  layer.open({
							type: 2,
							title:"修改机组",
							content:['<%=request.getContextPath()%>/UNIT/UpdaPage.do','no'],
							area:['600px', '400px'],
							
							
							success:function(layero, index){
							var body = layer.getChildFrame('body', index);  
							var iframeWin = window[layero.find('iframe')[0]['name']]; //得到iframe页的窗口对象
							
							//var formAdd = iframeWin.layui.form;
							
							 body.find('#uname').val(mun.unit_NAME);					//通过id选择器 找到子页面的存放name值的输入框
							 body.find('#uid').val(mun.unit_ID);  							//将要修改者的id写入
							 
							
							 
							}
					  });
					  
				  }
				  
				  
				  /* 删除 */
				  function ajx(da){
					  alert(da);
					  $.ajax(
					  	{
					  		 url:"<%=request.getContextPath()%>/UNIT/DeleUnit.do",
					  		  data:{'id':da},
					  		  type:"Post",
					  		  success:function(data){
													 //window.location.href="Student_List.html";
					  		                          // console.log(data);
					  		                          //   layer.msg(data.msg);
					  		                            location.reload(); //删除成功后再刷新
					  		                        }
					  	}
					  );
				  }
				  
				  
				  //渲染tabe
				  table.render({
					  
					 elem: '#demo'
				    ,height: 312
				    ,url: '<%=request.getContextPath()%>/UNIT/selUnit.do' //数据接口
				    ,page: false //开启分页
				    ,method:'post'
				    ,cols: [[ //表头
				       {field: 'unit_ID',title: '机组id', align:'center', sort: true, fixed: 'left'}
				      ,{field: 'unit_NAME', title: '机组名称', align:'center'},
				      ,{fixed:'right', title: '操作', align:'center',toolbar:'#barDemo'} 
				    ]]
					
				  });
				  
				  
				  table.on('tool(test)',function(obj){
					    alert("执行");
						var data = obj.data;
						if(obj.event === 'detail'){
							 layer.msg('ID：'+ data.unit_ID + ' 的查看操作');
						}else if(obj.event === 'edit'){
							 edi(data);
						}else if(obj.event==='del'){
							 layer.confirm('真的删除行么', function(index){
								  //向服务端发送删除指令
								  ajx(data.unit_ID);
								  layer.close(index);
				                    // obj.del(); //删除对应行（tr）的DOM结构
				                });
						}
				  });
				
			});
			
			
		</script>
		
		
	
	
	
	
</body>
</html>