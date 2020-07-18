<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet"  href="<%=request.getContextPath()%>/layui/css/layui.css">  <!--1.引入layui的核心样式文件-->
</head>
<body>
		
	<div class="layui-layout layui-layout-admin">
		
		
		<!-- ======================================顶部导航栏============================================= -->
		<div class="layui-header">
						   <div class="layui-logo">layui 后台布局</div>
						   
				<!--1.水平导航标签（左边）-->
				<ul class="layui-nav layui-layout-left"  >
				  <li class="layui-nav-item layui-this"><a href="">最新活动</a></li>
				  <li class="layui-nav-item "><a href="">产品</a></li>
				  <li class="layui-nav-item"><a href="">大数据</a></li>
				  <li class="layui-nav-item">
				    <a href="javascript:;">解决方案</a>
				    <dl class="layui-nav-child"> <!-- 二级菜单 -->
				      <dd><a href="">移动模块</a></dd>
				      <dd><a href="">后台模版</a></dd>
				      <dd><a href="">电商平台</a></dd>
				    </dl>
				  </li>
				  <li class="layui-nav-item"><a href="">社区</a></li>
				</ul>
				
				
				 <!--
				 导航中的其它元素,除了一般的文字导航，我们还内置了图片和徽章的支持，如：
				 layui-layout-right:将导航栏又看成一个新的布局区域，然后让这些其他元素实现居右边显示
				 -->
				<!--2.水平导航标签(右边)-->
				<ul class="layui-nav layui-layout-right">
				  <li class="layui-nav-item">
				    <a href="">控制台<span class="layui-badge">9</span></a>
				  </li>
				  <li class="layui-nav-item">
				    <a href="">个人中心<span class="layui-badge-dot"></span></a>
				  </li>
				  <li class="layui-nav-item">
				    <a href=""><img src="//t.cn/RCzsdCq" class="layui-nav-img">我</a>
				    <dl class="layui-nav-child">
				      <dd><a href="javascript:;">修改信息</a></dd>
				      <dd><a href="javascript:;">安全管理</a></dd>
				      <dd><a href="javascript:;">退了</a></dd>
				    </dl>
				  </li>
				</ul>
				
		</div>
			
			
			<!-- =======================================垂直菜单================================================= -->
			
			<div class="layui-side layui-bg-black">
				 <div class="layui-side-scroll">  
				 
						<!--3.垂直导航菜单
							此时我们会发现页面好像是可以了，但是仔细一看垂直导航菜单遮挡了部分水平导航菜单（左边），那么改怎么办，这是为什么呢？
							诚然我们用52行的代码是能够实现垂直导航的，但是也整因为这样这样才遮挡了，解决的办法就是要对页面整体布局重新划分一下即可
						-->
						<ul class="layui-nav layui-nav-tree " lay-filter="test">
						<!-- 侧边导航: <ul class="layui-nav layui-nav-tree layui-nav-side"> -->
						  <li class="layui-nav-item">
							<a href="javascript:;">机组</a>
							<dl class="layui-nav-child">
							  <dd><a data-url="<%=request.getContextPath()%>/UNIT/UnitList.do" data-id="11" data-title="机组" href="#" class="site-demo-active" data-type="tabAdd">机组操作</a></dd>
							</dl>
						  </li>
						  <li class="layui-nav-item">
							<a href="javascript:;">区域</a>
							<dl class="layui-nav-child">
							  <dd><a data-url="student/Student_List.html" data-id="12" data-title="区域" href="#" class="site-demo-active" data-type="tabAdd">区域操作</a></dd>
							</dl>
						  </li>
						</ul>
					
				</div>
			</div>
				
				
				
				
				<!-- ==================================嵌入式页面展示============================================= -->
				
				<!--
				   右边的主体内容是用标签选项卡的格式进行显示的，且本例子中是用iframe内嵌页实现内容的填充的
				-->
				       <div class="layui-body ">   <!--自：页面显示身体 -->
							
								<!-- lay-allowClose="true"可以允许关闭 -->
								<div lay-filter="demo" class="layui-tab <layui-tab-card></layui-tab-card>" lay-allowClose="true">
										<ul class="layui-tab-title">
											<li class="layui-this">欢迎</li>
										</ul>
										
										  <div class="layui-tab-content">
											  <div class="layui-tab-item layui-show ">
												  <iframe class='frame' frameborder="no" scrolling="yes" src="userlist.html" width="100%" height="1000"></iframe>
											  </div>
										  </div>
											
								</div>
						</div>
										
										
						 <!-- 底部固定区域 -->
						<div class="layui-footer">
								 
						 © layui.com - 底部固定区域
						</div>
				
				</div>
			
			<script type="text/javascript" src="<%=request.getContextPath()%>/layui/layui.all.js"></script>
			<script>
				
			
			/* 使用 elemente操作 */	
			layui.use('element',function(){
				
					 	 var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
						 var $ = layui.jquery;
						 
						 //触发事件
						  var active = {
						 //在这里给active绑定几项事件，后面可通过active调用这些事件
						  tabAdd: function(url,id,name) {
							
						 //新增一个Tab项 传入三个参数，分别对应其标题，tab页面的地址，还有一个规定的id，是标签中data-id的属性值
										 //关于tabAdd的方法所传入的参数可看layui的开发文档中基础方法部分
						 element.tabAdd('demo', {
						 title: name,
						 content: '<iframe data-frameid="'+id+'" scrolling="no" frameborder="0" src="'+url+'" width="100%" height="500" ></iframe>',
						 id: id //规定好的id
						  })
						 element.render('tab');
						 
									 },
						 tabChange: function(id) {
						 //切换到指定Tab项
						  element.tabChange('demo', id); //根据传入的id传入到指定的tab项
						  },
						 tabDelete: function (id) {
						 element.tabDelete("demo", id);//删除
						  }
									 , tabDeleteAll: function (ids) {//删除所有
						  $.each(ids, function (i,item) {
						 element.tabDelete("demo", item); //ids是一个数组，里面存放了多个id，调用tabDelete方法分别删除
						  })
									 }
								 };
							
							
							
							 
						 //当点击有site-demo-active属性的标签时，即左侧菜单栏中内容 ，触发点击事件
						  $('.site-demo-active').on('click', function() {
						   var dataid = $(this);
						 
						 //这时会判断右侧.layui-tab-title属性下的有lay-id属性的li的数目，即已经打开的tab项数目
						  if ($(".layui-tab-title li[lay-id]").length <= 0) {
						 //如果比零小，则直接打开新的tab项
						  active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"),dataid.attr("data-title"));
									 } else {
						 //否则判断该tab项是否以及存在
						 
						  var isData = false; //初始化一个标志，为false说明未打开该tab项 为true则说明已有
						  $.each($(".layui-tab-title li[lay-id]"), function () {
						 //如果点击左侧菜单栏所传入的id 在右侧tab项中的lay-id属性可以找到，则说明该tab项已经打开
						  if ($(this).attr("lay-id") == dataid.attr("data-id")) {
						 isData = true;
											 }
										 })
						 if (isData == false) {
						 //标志为false 新增一个tab项
						  active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"),dataid.attr("data-title"));
										 }
									 }
						 //最后不管是否新增tab，最后都转到要打开的选项页面上
						  active.tabChange(dataid.attr("data-id"));
								 });
				
			});
				
				
			</script>
		
		
		
		
		
		
		
		
</body>
</html>