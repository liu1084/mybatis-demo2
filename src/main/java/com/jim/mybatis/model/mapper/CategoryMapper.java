package com.jim.mybatis.model.mapper;

import com.jim.mybatis.model.po.Category;

public interface CategoryMapper {
	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table categories
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table categories
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	int insert(Category record);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table categories
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	int insertSelective(Category record);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table categories
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	Category selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table categories
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	int updateByPrimaryKeySelective(Category record);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table categories
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	int updateByPrimaryKey(Category record);
}