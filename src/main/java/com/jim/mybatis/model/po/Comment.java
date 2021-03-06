package com.jim.mybatis.model.po;

import java.util.Date;

public class Comment {
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column comments.id
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private Long id;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column comments.parent_id
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private Long parentId;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column comments.title
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private String title;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column comments.user_id
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private Long userId;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column comments.status
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private String status;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column comments.rating
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private Boolean rating;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column comments.book_id
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private Long bookId;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column comments.ip_address
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private String ipAddress;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column comments.email
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private String email;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column comments.create_at
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private Date createAt;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column comments.update_at
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private Date updateAt;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column comments.content
	 *
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column comments.id
	 *
	 * @return the value of comments.id
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column comments.id
	 *
	 * @param id the value for comments.id
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column comments.parent_id
	 *
	 * @return the value of comments.parent_id
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public Long getParentId() {
		return parentId;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column comments.parent_id
	 *
	 * @param parentId the value for comments.parent_id
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column comments.title
	 *
	 * @return the value of comments.title
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column comments.title
	 *
	 * @param title the value for comments.title
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column comments.user_id
	 *
	 * @return the value of comments.user_id
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column comments.user_id
	 *
	 * @param userId the value for comments.user_id
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column comments.status
	 *
	 * @return the value of comments.status
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column comments.status
	 *
	 * @param status the value for comments.status
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column comments.rating
	 *
	 * @return the value of comments.rating
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public Boolean getRating() {
		return rating;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column comments.rating
	 *
	 * @param rating the value for comments.rating
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setRating(Boolean rating) {
		this.rating = rating;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column comments.book_id
	 *
	 * @return the value of comments.book_id
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public Long getBookId() {
		return bookId;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column comments.book_id
	 *
	 * @param bookId the value for comments.book_id
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column comments.ip_address
	 *
	 * @return the value of comments.ip_address
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column comments.ip_address
	 *
	 * @param ipAddress the value for comments.ip_address
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress == null ? null : ipAddress.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column comments.email
	 *
	 * @return the value of comments.email
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column comments.email
	 *
	 * @param email the value for comments.email
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column comments.create_at
	 *
	 * @return the value of comments.create_at
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public Date getCreateAt() {
		return createAt;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column comments.create_at
	 *
	 * @param createAt the value for comments.create_at
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column comments.update_at
	 *
	 * @return the value of comments.update_at
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public Date getUpdateAt() {
		return updateAt;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column comments.update_at
	 *
	 * @param updateAt the value for comments.update_at
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column comments.content
	 *
	 * @return the value of comments.content
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column comments.content
	 *
	 * @param content the value for comments.content
	 * @mbggenerated Sun Sep 24 01:38:32 CST 2017
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}
}