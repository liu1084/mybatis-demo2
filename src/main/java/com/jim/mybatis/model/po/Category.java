package com.jim.mybatis.model.po;

import java.util.Date;

public class Category {
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column categories.id
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private Long id;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column categories.name
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column categories.create_at
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private Date createAt;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column categories.update_at
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private Date updateAt;

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column categories.id
	 *
	 * @return the value of categories.id
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column categories.id
	 *
	 * @param id the value for categories.id
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column categories.name
	 *
	 * @return the value of categories.name
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column categories.name
	 *
	 * @param name the value for categories.name
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column categories.create_at
	 *
	 * @return the value of categories.create_at
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public Date getCreateAt() {
		return createAt;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column categories.create_at
	 *
	 * @param createAt the value for categories.create_at
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column categories.update_at
	 *
	 * @return the value of categories.update_at
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public Date getUpdateAt() {
		return updateAt;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column categories.update_at
	 *
	 * @param updateAt the value for categories.update_at
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
}