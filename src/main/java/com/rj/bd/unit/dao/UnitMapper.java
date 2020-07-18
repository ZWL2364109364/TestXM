package com.rj.bd.unit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.rj.bd.unit.entity.Unit;

/**
 * Unitģ��־ò�
 * @author ������
 *
 */


@Repository("UnitMapper")
public interface UnitMapper {

	/**
	 * 1. ��ѯ���л�������
	 * @return
	 */
	@Select("select * from unit")
	List<Unit> selUnit();

	
	/**
	 * 2. �޸�ָ��
	 * @param uid
	 * @param uname
	 */
	@Update("update unit set UNIT_NAME=#{uname} where UNIT_ID=#{uid}")
	void UpdaUnit(@Param("uid")String uid, @Param("uname")String uname);


	/**
	 * 3.ɾ��ָ������
	 * @param id
	 */
	@Delete("delete from unit where UNIT_ID=#{id}")
	void DeleUnit(@Param("id")String id);

	
	
	
}
