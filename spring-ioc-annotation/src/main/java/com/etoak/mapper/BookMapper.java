package com.etoak.mapper;
import org.springframework.stereotype.Repository;
import com.etoak.bean.Book;
@Repository
public class BookMapper {
	public Book gitBook(String id) {
		return new Book(id,"etoak");
	}
}
