package com.jim.mybatis.model.mapper;

import com.jim.mybatis.model.po.Profile;
import com.jim.mybatis.model.po.ProfileWithBLOBs;

public interface ProfileMapper {
	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table profiles
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table profiles
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	int insert(ProfileWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table profiles
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	int insertSelective(ProfileWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table profiles
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	ProfileWithBLOBs selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table profiles
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	int updateByPrimaryKeySelective(ProfileWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table profiles
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	int updateByPrimaryKeyWithBLOBs(ProfileWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table profiles
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	int updateByPrimaryKey(Profile record);
}