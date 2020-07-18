package com.rj.bd.area.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rj.bd.area.dao.AreaMapper;

/**
 * 区域模块M层 实现类
 * @author 张文龙
 *
 */
@Service
public class AreaService implements IAreaService{

	@Autowired
	private AreaMapper mapper;
	
	
	
	
}
