package com.rj.bd.unit.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rj.bd.unit.entity.Unit;
import com.rj.bd.unit.service.IUnitService;

/**
 * 机组模块C层
 * @author 张文龙
 *
 */

@Controller
@RequestMapping("UNIT")
public class UnitController {


	
	@Autowired
	IUnitService service;
	
	
	/**
	 * 进入机组模块
	 */
	@RequestMapping("UnitList")
	public String UnitList(){
		System.out.println("进入UnitList方法");
		return "unit/UnitList";
	}
	
	/**
	 * 查询机组数据
	 * @throws IOException 
	 */
	
	@RequestMapping("selUnit")
	public void selUnit(HttpServletResponse response) throws IOException{
		
		response.setContentType("application/json;charset=UTF-8");  
		
		System.out.println("进入查询机组数据模块");
		List<Unit> list=service.selUnit();
		
		  Map userMap = new HashMap();
		  userMap.put("code",0);
	      userMap.put("msg","lay ui-Table数据绑定数据库");
	      userMap.put("count",list.size());
	      userMap.put("data",list);
		
		ObjectMapper objectMapper = new ObjectMapper();
	    String str = objectMapper.writeValueAsString(userMap);
	    System.out.println(str);
	    response.getWriter().write(str); 
	    
	}
	
	
	
	
	/**
	 * 添加机组数据
	 */
	@RequestMapping("addUnit")
	public String addUnit(){
		System.out.println("进入添加机组方法");
		return null;
		
	}
	
	
	
	/**
	 * 跳转修改页面
	 */
	@RequestMapping("UpdaPage")
	public String UpdaPage(){
		System.out.println("进入跳转修改页方法");
		return "unit/UnitUpdate";
	}
	
	
	/**
	 * 将修改后数据加入数据库
	 * @throws IOException 
	 */
	@RequestMapping("UpdaUnit")
	public void UpdaUnit(String uid,String uname,HttpServletResponse response) throws IOException{
		
		
		
		System.out.println("要修改者的id是"+uid);
		System.out.println("要修改者的姓名是"+uname);
		
		service.UpdaUnit(uid,uname);
		
		 response.getWriter().write(1); 
		  
	}
	
	/**
	 * 删除数据
	 * @throws IOException 
	 */
	@RequestMapping("DeleUnit")
	public void DeleUnit(String id,HttpServletResponse response) throws IOException{
		
		service.DeleUnit(id);
		System.out.println("拿到删除数据"+id);
		response.getWriter().write(1);
		
		
		
	}
	
	
	
	
	
}
