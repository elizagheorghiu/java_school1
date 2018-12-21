import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 
import java.util.Collections; 

public interface Library {
	
	static ArrayList <String> BookList = new ArrayList <String> (); 
	int page=0; 
	
	void addBook(Book book);
	boolean deleteBookByName(String bookName);
	Book findByName(String bookName);
	void printAllBooks();

}
