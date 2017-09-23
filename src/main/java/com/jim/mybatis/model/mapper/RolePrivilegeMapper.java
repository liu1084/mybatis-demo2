package com.jim.mybatis.model.mapper;

import com.jim.mybatis.model.po.RolePrivilege;

public interface RolePrivilegeMapper {
	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table role_privilege
	 *
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	int deleteByPrimaryKey(Long roleId);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table role_privilege
	 *
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	int insert(RolePrivilege record);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table role_privilege
	 *
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	int insertSelective(RolePrivilege record);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table role_privilege
	 *
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	RolePrivilege selectByPrimaryKey(Long roleId);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table role_privilege
	 *
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	int updateByPrimaryKeySelective(RolePrivilege record);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table role_privilege
	 *
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	int updateByPrimaryKey(RolePrivilege record);
}