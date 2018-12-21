import java.util.ArrayList;

public class NovelHistory extends Novel {

	public NovelHistory(String bookName, int page) {
		super(bookName, page);
		// TODO Auto-generated constructor stub
		this.bookName = bookName; 
		this.page = page; 
		
			}
		ArrayList<NovelHistory>myNovelHistory = new ArrayList<NovelHistory>();
		NovelHistory aNovelHistory= new NovelHistory ("H1", 300);
		NovelHistory bNovelHistory= new NovelHistory ("H1", 350);
		NovelHistory cNovelHistory= new NovelHistory ("H1", 400);
		NovelHistory dNovelHistory= new NovelHistory ("H1", 450);
		
				
		@Override
		public void addBook(Book book) {
			
			
		}

		@Override
		public boolean deleteBookByName(String bookName) {
			
			return false;
		}

		@Override
		public Book findByName(String bookName) {
			
			return null;
		}

		@Override
		public void printAllBooks() {
}
}