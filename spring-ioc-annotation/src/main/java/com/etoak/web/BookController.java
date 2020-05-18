package com.etoak.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.etoak.bean.Book;
import com.etoak.service.BookService;

@Controller
public class BookController {
	@Autowired
	@Qualifier("bookService")
   private BookService bookService;
	
   public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

public Book gitById(String id) {
	   return bookService.gitById(id);
   }
}
