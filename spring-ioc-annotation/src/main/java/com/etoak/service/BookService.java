package com.etoak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etoak.bean.Book;
import com.etoak.mapper.BookMapper;

@Service
public class BookService {
	@Autowired
	@Qualifier("bookMapper")
    private BookMapper bookMapper;
	
    public BookMapper getBookMapper() {
		return bookMapper;
	}

	public void setBookMapper(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	public Book gitById(String id) {
    	return bookMapper.gitBook(id);
    }
}
