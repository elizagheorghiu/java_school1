import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryApp extends Book {
	public LibraryApp(String bookName, int page) {
		super(bookName, page);
		// TODO Auto-generated constructor stub
	}

	private static Scanner in; 
	int page; 
	List<Book>bookList = new ArrayList<>();
	String bookName;
	
	public static void main (String args[]) {
		
		in = new Scanner(System.in);
	}
	
		private static void transaction(){
			
		int choice;
		
		System.out.println("Type in 1 to Add book");
		System.out.println("Type in 2 to  Delete book");
		System.out.println("Type in 3 to Find book");
		System.out.println("Type in 4 to View all books");
		
		choice = in.nextInt();
		
		switch(choice){
        case 1:
            String bookName;
            System.out.println("Please enter book name"); 
            bookName = in.toString();
            int page;
            System.out.println("Please enter number of pages"); 
            page = in.nextInt();
            int type;
            System.out.println("Please type 1 if the book is a Novel or type 2 if the book is an Art Album");
            type = in.nextInt();
            	if (type == 1) { 
                 		int noveltype;
            		System.out.println("Please choose 1 if Novel type is Action, 2 for Autobiography, 3 for History, 4 for SF");
            		noveltype = in.nextInt();
            			switch (noveltype) {
            			case 1:
            			public void addNovelAction(Book book) {          			       			
            			}
            			break;
            			case 2:
            			public void addNovelAutobiography(Book book) {
			          	 			}
            			break;
            			case 3:
            				public void addNovelHistory(Book book) {
			          		           			}	
            			break;
            			case 4:
            				public void addNovelScienceFiction(Book book) {
			          		            			}
            			break;
            			}
            			else  {
            				int papertype;
                    		System.out.println("Please choose 1 if paper type is Glossy, 2 for Low Quality, 3 for Matt");
                    		papertype = in.nextInt();
                    			switch (papertype) {
                    			case 1:
                    			public void addAlbumPaperGlossy(Book book) {
                    			          			
                    			}
                    			break;
                    			case 2:
                    			public void addAlbumPaperLowQuality(Book book) {
        			          			
                        			}
                    			break;
                    			case 3:
                    				public void addAlbumPaperMatt(Book book) {
        			          			
                        			}	
                    			break;
                    		   			}
            			
            	}

}
            	break;
        case 2:
        	String bookName1;
            System.out.println("Please enter book name you want to delete"); 
            bookName1 = in.toString();
            public boolean deleteBookByName(String bookName) {
    			
    			return false;}
            break;
        case 3:
        	public Book findByName(String bookName) {
        		   		   		return null;
        	}
        	break;
        case 4:
        	public void printAllBooks() {
        	}
            break;
		}

		

