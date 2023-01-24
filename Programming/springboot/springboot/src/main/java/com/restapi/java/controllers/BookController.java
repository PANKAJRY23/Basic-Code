package com.restapi.java.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.java.entities.Books;
import com.restapi.java.services.BookServices;


@RestController
public class BookController {
	
	@Autowired
	private BookServices bookService;
	
//	Get all books handler
	@GetMapping("/books")
	public ResponseEntity<List<Books>> allBooks() {
		List<Books> list = this.bookService.getAllBooks();
		if(list.size()==0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
//	Get particular book handler
	@GetMapping("/getbook/{id}")
	public ResponseEntity<Books> bookById(@PathVariable("id") int id) {
		Books book= this.bookService.getBookById(id);
		if(book==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}else {
			return ResponseEntity.of(Optional.of(book));
		}
		
	}
	
//	Create new Book handler
	@PostMapping("/books")
	public Books addBooks(@RequestBody Books book) {
		Books b = this.bookService.addBooks(book);
		return b;
	}
	
//	Delete book handler
	@DeleteMapping("/deletebooks/{id}")
	public List<Books> deleteBook(@PathVariable("id") int id) {
		return this.bookService.deleteBook(id);
		
	}
	
// Update Book Handler
	@PutMapping("/updatebook/{id}")
	public List<Books> updateBook(@PathVariable("id") int id,@RequestBody Books book){
		return this.bookService.updateBook(id,book);
	}
	
}