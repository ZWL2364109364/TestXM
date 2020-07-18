package com.rj.bd.area.entity;

import com.rj.bd.unit.entity.Unit;

public class Area {

	private int AREA_ID;
	private String AREA_NAME;
	private Unit unit;
	
	
	
	public int getAREA_ID() {
		return AREA_ID;
	}
	public void setAREA_ID(int aREA_ID) {
		AREA_ID = aREA_ID;
	}
	public String getAREA_NAME() {
		return AREA_NAME;
	}
	public void setAREA_NAME(String aREA_NAME) {
		AREA_NAME = aREA_NAME;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
	
	@Override
	public String toString() {
		return "Area [AREA_ID=" + AREA_ID + ", AREA_NAME=" + AREA_NAME + ", unit=" + unit + "]";
	}
	
	
	
	
	
}
