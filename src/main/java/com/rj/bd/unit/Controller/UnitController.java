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
 * ����ģ��C��
 * @author ������
 *
 */

@Controller
@RequestMapping("UNIT")
public class UnitController {


	
	@Autowired
	IUnitService service;
	
	
	/**
	 * �������ģ��
	 */
	@RequestMapping("UnitList")
	public String UnitList(){
		System.out.println("����UnitList����");
		return "unit/UnitList";
	}
	
	/**
	 * ��ѯ��������
	 * @throws IOException 
	 */
	
	@RequestMapping("selUnit")
	public void selUnit(HttpServletResponse response) throws IOException{
		
		response.setContentType("application/json;charset=UTF-8");  
		
		System.out.println("�����ѯ��������ģ��");
		List<Unit> list=service.selUnit();
		
		  Map userMap = new HashMap();
		  userMap.put("code",0);
	      userMap.put("msg","lay ui-Table���ݰ����ݿ�");
	      userMap.put("count",list.size());
	      userMap.put("data",list);
		
		ObjectMapper objectMapper = new ObjectMapper();
	    String str = objectMapper.writeValueAsString(userMap);
	    System.out.println(str);
	    response.getWriter().write(str); 
	    
	}
	
	
	
	
	/**
	 * ��ӻ�������
	 */
	@RequestMapping("addUnit")
	public String addUnit(){
		System.out.println("������ӻ��鷽��");
		return null;
		
	}
	
	
	
	/**
	 * ��ת�޸�ҳ��
	 */
	@RequestMapping("UpdaPage")
	public String UpdaPage(){
		System.out.println("������ת�޸�ҳ����");
		return "unit/UnitUpdate";
	}
	
	
	/**
	 * ���޸ĺ����ݼ������ݿ�
	 * @throws IOException 
	 */
	@RequestMapping("UpdaUnit")
	public void UpdaUnit(String uid,String uname,HttpServletResponse response) throws IOException{
		
		
		
		System.out.println("Ҫ�޸��ߵ�id��"+uid);
		System.out.println("Ҫ�޸��ߵ�������"+uname);
		
		service.UpdaUnit(uid,uname);
		
		 response.getWriter().write(1); 
		  
	}
	
	/**
	 * ɾ������
	 * @throws IOException 
	 */
	@RequestMapping("DeleUnit")
	public void DeleUnit(String id,HttpServletResponse response) throws IOException{
		
		service.DeleUnit(id);
		System.out.println("�õ�ɾ������"+id);
		response.getWriter().write(1);
		
		
		
	}
	
	
	
	
	
}
