package com.pbajait.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookservice")
public class MyController {
	
	List<Book> bookls = new ArrayList<>();
	
	public MyController() {
		
		bookls.add(new Book(101,"C++","Nitesh","Rajput Publication","Computer Programming",1500,240,"G452"));
		bookls.add(new Book(103,"Java","Suresh","NAvoday Publication","Computer Programming",1400,350,"G453"));
		bookls.add(new Book(104,"DSA","Mahesh","Vijay Publication","Computer Programming",1800,500,"G454"));
		bookls.add(new Book(102,"Spring","Rajesh","YAshoda Publication","Computer Programming",1600,340,"G455"));
		
	}
	
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		
		return bookls;
		
	}

	@GetMapping("/books/{id}")
	public Book getDetailsOfBookById(@PathVariable("id") Integer bookId) {
		
		return new Book(bookId, null, null, null, null, null, null, null);
//		return new Book(bookId, name, author, publication, category, price, authorNo);
	}
	
	@PostMapping(value="/books", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String insertNewBookHandler(@RequestBody Book book) {
		
		bookls.add(book);
		
		return book.toString()+" saved successfully ";
	}
	
	@DeleteMapping("/books/{id}")
	public String deleteBookByBookIdHandler(@PathVariable("id") Integer bookId) {
		
		String result=" ";
		for(Book bk: bookls) {
			if(bk.getBookId()==bookId) {
				bookls.remove(bk);
				result = bk.toString()+" deleted successfully";
			}
		}
		
		return result+" & updated list is :"+bookls;
	}
	
	
	
	@PutMapping("/books/{id}")
	public String updateBookByBookIdHandler(@RequestBody Book book,@PathVariable("id") Integer bookId) {
		
		for(Book bk: bookls) {
			if(bk.getBookId()==bookId) {
				bk.setAuthor(book.getAuthor());
				bk.setAuthorNo(book.getAuthorNo());
				bk.setCategory(book.getCategory());
				bk.setName(book.getName());
				bk.setPages(book.getPages());
				bk.setPrice(book.getPrice());
				bk.setPublication(book.getPublication());
			}
		}
		
		return "Updated list is :"+bookls;
	}
	
	
	
}
