package com.rj.bd.unit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rj.bd.unit.dao.UnitMapper;
import com.rj.bd.unit.entity.Unit;

/**
 * ����M��ӿ�ʵ����
 * @author ������
 *
 */

@Service
public class UnitServiceImpl implements IUnitService{

	@Autowired
 	private UnitMapper mapper;
	
	/**
	 * ��ѯ���л�������
	 */
	public List<Unit> selUnit() {
		List<Unit> list=mapper.selUnit();
		return list;
	}

	/**
	 * �޸Ļ�������
	 */
	public void UpdaUnit(String uid, String uname) {
		
		mapper.UpdaUnit(uid,uname);
		
	}

	/**
	 * ɾ������
	 */
	public void DeleUnit(String id) {
		mapper.DeleUnit(id);
	}

	
	
}
