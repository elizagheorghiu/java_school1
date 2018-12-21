import java.util.ArrayList;

public class NovelScienceFiction extends Novel {

	public NovelScienceFiction(String bookName, int page) {
		super(bookName, page);
	this.bookName = bookName; 
	this.page = page; 
	
		}
	ArrayList<NovelScienceFiction>myNovelScienceFiction = new ArrayList<NovelScienceFiction>();
	NovelScienceFiction aNovelScienceFiction= new NovelScienceFiction ("SF1", 100);
	NovelScienceFiction bNovelScienceFiction= new NovelScienceFiction ("SF2", 101);
	NovelScienceFiction cNovelScienceFiction= new NovelScienceFiction ("SF3", 102);
	NovelScienceFiction dNovelScienceFiction= new NovelScienceFiction ("SF4", 103);
	NovelScienceFiction eNovelScienceFiction= new NovelScienceFiction ("SF5", 104);
	NovelScienceFiction fNovelScienceFiction= new NovelScienceFiction ("SF6", 105);
	NovelScienceFiction gNovelScienceFiction= new NovelScienceFiction ("SF7", 106);
	
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