package com.rj.bd.area.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rj.bd.area.service.IAreaService;

/**
 * 区域模块 C层
 * @author 张文龙
 *
 */
@Controller
@RequestMapping("area")
public class AreaController {

	@Autowired
	IAreaService service;
	
	
	
	
}
