package com.jim.mybatis.model.mapper;

import com.jim.mybatis.model.dto.BookDTO;
import com.jim.mybatis.model.po.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by jim on 2017/9/19.
 * This class is ...
 */
@Mapper
public interface BookMapper {

	List<Book> books(int pageStart, int pageSize);

	List<Book> booksByKeywords(@Param("query") String query);

	List<Book> getDownloadTimesTop10();

	Book getBookById(Long bookId);

	void insert(List<BookDTO> bookDTOS);

	int update(Book book);

	void delete(Long bookId);
}
