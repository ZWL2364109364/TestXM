package com.rj.bd.unit.service;

import java.util.List;

import com.rj.bd.unit.entity.Unit;

/**
 *  机组M层接口
 * @author 张文龙
 *
 */
public interface IUnitService {

	List<Unit> selUnit();

	void UpdaUnit(String uid, String uname);

	void DeleUnit(String id);

}
