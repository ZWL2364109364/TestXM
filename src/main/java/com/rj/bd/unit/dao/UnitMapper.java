package com.rj.bd.unit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.rj.bd.unit.entity.Unit;

/**
 * Unit模块持久层
 * @author 张文龙
 *
 */


@Repository("UnitMapper")
public interface UnitMapper {

	/**
	 * 1. 查询所有机组数据
	 * @return
	 */
	@Select("select * from unit")
	List<Unit> selUnit();

	
	/**
	 * 2. 修改指定
	 * @param uid
	 * @param uname
	 */
	@Update("update unit set UNIT_NAME=#{uname} where UNIT_ID=#{uid}")
	void UpdaUnit(@Param("uid")String uid, @Param("uname")String uname);


	/**
	 * 3.删除指定数据
	 * @param id
	 */
	@Delete("delete from unit where UNIT_ID=#{id}")
	void DeleUnit(@Param("id")String id);

	
	
	
}
