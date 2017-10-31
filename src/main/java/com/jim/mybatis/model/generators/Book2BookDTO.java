package com.jim.mybatis.model.generators;

import com.jim.mybatis.model.dto.BookDTO;
import com.jim.mybatis.model.po.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jim on 2017/9/24.
 * This class is ...
 */
public class Book2BookDTO {
	public static List<BookDTO> g1(List<Book> books) {
		List<BookDTO> bookDTOS = new ArrayList<>();
		for (Book book : books) {
			BookDTO bookDTO = new BookDTO();
		}
		return bookDTOS;
	}
}
