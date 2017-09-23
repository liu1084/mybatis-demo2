package com.jim.mybatis.model.bo;

import com.jim.mybatis.model.po.Book;
import com.jim.mybatis.model.po.Comment;
import com.jim.mybatis.model.po.Link;

/**
 * Created by jim on 2017/9/24.
 * This class is ...
 */
public class BookBO extends Book {
	private Link[] links;
	private Comment[] comments;
	private int downloadTimes;

	public Link[] getLink() {
		return links;
	}

	public void setLink(Link[] links) {
		this.links = links;
	}

	public Comment[] getComment() {
		return comments;
	}

	public void setComment(Comment[] comments) {
		this.comments = comments;
	}

	public int getDownloadTimes() {
		return downloadTimes;
	}

	public void setDownloadTimes(int downloadTimes) {
		this.downloadTimes = downloadTimes;
	}
}
