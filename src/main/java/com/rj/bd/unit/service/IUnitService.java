package com.rj.bd.unit.service;

import java.util.List;

import com.rj.bd.unit.entity.Unit;

/**
 *  ����M��ӿ�
 * @author ������
 *
 */
public interface IUnitService {

	List<Unit> selUnit();

	void UpdaUnit(String uid, String uname);

	void DeleUnit(String id);

}
