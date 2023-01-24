package com.restapi.java.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.stereotype.Component;

import com.restapi.java.entities.Books;

@Component
public class BookServices {

	private static ArrayList<Books> list = new ArrayList<Books>();

	static {
		list.add(new Books(12,"Java Complete Refernece","sun microsystem"));
		list.add(new Books(7,"Spring Boot","Spring Advance"));
		list.add(new Books(8,"Spring MVC","MVC"));
	}

	//  Get all books ---> GET
	public List<Books> getAllBooks() {
		return list;
	}

	//Get book by id ---> GET 
	public Books getBookById(int id){
		Books bookById= null;
		Response res = new Response();
		for(Books b:list) {
			if(b.getId()==id) {
				bookById = b;
				System.out.println("bookbyid "+bookById);

			}
		}
		return bookById;

	}

	//	Add book ---> POST
	public Books addBooks(Books b) {
		list.add(b);
		System.out.println(list);
		return b;
	}

	//	Delete Book ----> DELETE
	public List<Books> deleteBook(int id) {
		List<Books> lb = new ArrayList<Books>();
		for(Books b1:list) {
			if(b1.getId() == id) {
				list.remove(b1);
				System.out.println("list "+lb);
			}
		}

		return lb;
	}
	
//	Update Book -----> PUT
	public List<Books> updateBook(int id,Books book){
		for(Books b:list) {
			if(b.getId()==id) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
				System.out.println(list);
			}
		}
		return list;
	}

}