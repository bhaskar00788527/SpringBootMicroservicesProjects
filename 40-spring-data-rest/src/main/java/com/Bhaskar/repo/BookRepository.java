package com.Bhaskar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Bhaskar.entity.Book;
import java.util.List;


@RepositoryRestResource(path="books")
public interface BookRepository  extends JpaRepository<Book, Integer>{
	public List<Book> findByName(@Param("name") String name);
	//public List<Book> getAllBooks(@Param("price") Book p);
	//public List<Book> findBypriceList(@Param("price")double price);
	//public List<Book> fibdByIdBooks(Book b);
	

}
