package services;


import java.util.List;

import entities.Books;
import exceptions.NullUserFound;

public interface BookService {
	
	public Books registerBooks(Books book) throws NullUserFound;
	
	public List<Books> getAllBookss();
	
	public Books getBooksById(Integer pid) throws NullUserFound;
	
	public Books updateBooks(Books book) throws NullUserFound;
	
	public String deleteBooks(Books book) throws NullUserFound;
}