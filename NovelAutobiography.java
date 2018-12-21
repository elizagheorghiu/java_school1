import java.util.ArrayList;

public class NovelAutobiography extends Novel {

	public NovelAutobiography(String bookName, int page) {
		super(bookName, page);
		this.bookName = bookName; 
		this.page = page; 
		
			}
		ArrayList<NovelAutobiography>myNovelAutobiography = new ArrayList<NovelAutobiography>();
		NovelAutobiography aNovelAutobiography= new NovelAutobiography ("A1", 210);
		NovelAutobiography bNovelAutobiography= new NovelAutobiography ("A2", 220);
		NovelAutobiography cNovelAutobiography= new NovelAutobiography ("A3", 230);
		NovelAutobiography dNovelAutobiography= new NovelAutobiography ("A4", 240);
		NovelAutobiography eNovelAutobiography= new NovelAutobiography ("A5", 250);
		NovelAutobiography fNovelAutobiography= new NovelAutobiography ("A6", 260);
		NovelAutobiography gNovelAutobiography= new NovelAutobiography ("A7", 270);
		NovelAutobiography hNovelAutobiography= new NovelAutobiography ("A8", 280);
		
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
