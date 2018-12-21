import java.util.ArrayList;

public class NovelAction extends Novel {

	public NovelAction(String bookName, int page) {
		super(bookName, page);
		// TODO Auto-generated constructor stub
		this.bookName = bookName; 
		this.page = page; 
		
			}
		ArrayList<NovelAction>myNovelAction = new ArrayList<NovelAction>();
		NovelAction aNovelAction= new NovelAction ("AC1", 400);
		NovelAction bNovelAction= new NovelAction ("AC2", 500);
		NovelAction cNovelAction= new NovelAction ("AC3", 600);;
		NovelAction dNovelAction= new NovelAction ("AC4", 7300);
		
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
		
