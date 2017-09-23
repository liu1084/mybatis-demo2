package com.jim.mybatis.model.po;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by jim on 2017/9/24.
 * This class is ...
 */
public class Base implements Serializable, Comparable<Object> {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date createAt;
	private Date updateAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	@Override
	public int compareTo(Object o) {
		if (this == o) return 0;
		return -1;
	}
}
