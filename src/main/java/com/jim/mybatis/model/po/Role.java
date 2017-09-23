package com.jim.mybatis.model.po;

import java.util.Date;

public class Role {
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column roles.id
	 *
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	private Long id;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column roles.name
	 *
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column roles.enabled
	 *
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	private Boolean enabled;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column roles.create_user_id
	 *
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	private Long createUserId;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column roles.create_at
	 *
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	private Date createAt;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column roles.update_at
	 *
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	private Date updateAt;

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column roles.id
	 *
	 * @return the value of roles.id
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column roles.id
	 *
	 * @param id the value for roles.id
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column roles.name
	 *
	 * @return the value of roles.name
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column roles.name
	 *
	 * @param name the value for roles.name
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column roles.enabled
	 *
	 * @return the value of roles.enabled
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column roles.enabled
	 *
	 * @param enabled the value for roles.enabled
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column roles.create_user_id
	 *
	 * @return the value of roles.create_user_id
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	public Long getCreateUserId() {
		return createUserId;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column roles.create_user_id
	 *
	 * @param createUserId the value for roles.create_user_id
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column roles.create_at
	 *
	 * @return the value of roles.create_at
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	public Date getCreateAt() {
		return createAt;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column roles.create_at
	 *
	 * @param createAt the value for roles.create_at
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column roles.update_at
	 *
	 * @return the value of roles.update_at
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	public Date getUpdateAt() {
		return updateAt;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column roles.update_at
	 *
	 * @param updateAt the value for roles.update_at
	 * @mbggenerated Thu Sep 21 01:16:58 CST 2017
	 */
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
}