package com.rj.bd.area.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rj.bd.area.dao.AreaMapper;

/**
 * ����ģ��M�� ʵ����
 * @author ������
 *
 */
@Service
public class AreaService implements IAreaService{

	@Autowired
	private AreaMapper mapper;
	
	
	
	
}
