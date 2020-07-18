package com.rj.bd.unit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rj.bd.unit.dao.UnitMapper;
import com.rj.bd.unit.entity.Unit;

/**
 * 机组M层接口实现类
 * @author 张文龙
 *
 */

@Service
public class UnitServiceImpl implements IUnitService{

	@Autowired
 	private UnitMapper mapper;
	
	/**
	 * 查询所有机组数据
	 */
	public List<Unit> selUnit() {
		List<Unit> list=mapper.selUnit();
		return list;
	}

	/**
	 * 修改机组数据
	 */
	public void UpdaUnit(String uid, String uname) {
		
		mapper.UpdaUnit(uid,uname);
		
	}

	/**
	 * 删除数据
	 */
	public void DeleUnit(String id) {
		mapper.DeleUnit(id);
	}

	
	
}
