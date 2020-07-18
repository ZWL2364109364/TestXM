<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>修改机组操作</h3>

	<form action="">
		
		<input type="hidden" id="uid" >
		
		<table>
			<tr>
				<td>机组名称</td>
				<td><input type="text" id="uname"></td>
			</tr>
			
			<tr>
				<td><button type="button" onclick="tiJiao()">提交</button></td>
			</tr>
			
		</table>
		
	</form>
	
	
	<script type="text/javascript" src="<%=request.getContextPath()%>/jQuery/jquery-1.4.4.js"></script>
	
	<script type="text/javascript">
	
	
	
	
	
		function tiJiao() {
			
			var uid=$("#uid").val();
			var uname=$("#uname").val();
			
			alert(uid);
			alert(uname);
			
			
			$.ajax({
				url:"<%=request.getContextPath()%>/UNIT/UpdaUnit.do",
				type:"post",
				data:{uid:uid,uname:uname},
				
			    success: function(data){
			        console.log(data);

			        
			        window.parent.location.reload();//刷新父页面
		            parent.layer.close(index);//关闭弹出层
			        
			        //var index = parent.layer.getFrameIndex(window.name);
			        //setTimeout(function(){parent.layer.close(index)}, 1000);  
			        
			    }
				
			});
			
		}
		
	</script>

</body>
</html>