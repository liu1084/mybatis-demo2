package com.jim.mybatis.controller;

import com.jim.mybatis.model.dto.BookDTO;
import com.jim.mybatis.model.entities.Book;
import com.jim.mybatis.model.generators.BookDTO2Book;
import com.jim.mybatis.model.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jim on 2017/9/18.
 * 根据服务器的返回结果生成统一的API
 */
@Controller
@RequestMapping(value = "/api/book")
public class BookController {

	@Autowired
	private BookMapper bookMapper;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Book> books() {
		return bookMapper.books();
	}

	@RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
	@ResponseBody
	public Book getBookById(@PathVariable("bookId") Long bookId) {
		return bookMapper.getBookById(bookId);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public void insert(@Validated @RequestBody final List<BookDTO> bookDTOs, Errors errors) {
		bookMapper.insert(bookDTOs);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void update(@Validated @RequestBody final BookDTO bookDTO, Errors errors) {
		Book book = BookDTO2Book.g1(bookDTO);
		bookMapper.update(book);
	}

	@RequestMapping(value = "/{bookId}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("bookId") Long bookId) {
		bookMapper.delete(bookId);
	}
}
