package com.rj.bd.unit.entity;

import java.util.List;

import com.rj.bd.area.entity.Area;

/**
 * 机组实体类
 * @author 张文龙
 *
 */
public class Unit {

	private int UNIT_ID;
	private String UNIT_NAME;
	private List<Area> list;
	
	
	
	public int getUNIT_ID() {
		return UNIT_ID;
	}
	public void setUNIT_ID(int uNIT_ID) {
		UNIT_ID = uNIT_ID;
	}
	public String getUNIT_NAME() {
		return UNIT_NAME;
	}
	public void setUNIT_NAME(String uNIT_NAME) {
		UNIT_NAME = uNIT_NAME;
	}
	
	
	
	@Override
	public String toString() {
		return "Unit [UNIT_ID=" + UNIT_ID + ", UNIT_NAME=" + UNIT_NAME + "]";
	}
	
	
	
	
	
}
