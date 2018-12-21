import java.util.ArrayList;

public class AlbumPaperGlossy extends ArtAlbum {

	public AlbumPaperGlossy(String bookName, int page) {
		super(bookName, page);
		this.bookName = bookName; 
		this.page = page; 
		
			}
		ArrayList<AlbumPaperGlossy>myAlbumPaperGlossy = new ArrayList<AlbumPaperGlossy>();
		AlbumPaperGlossy aAlbumPaperGlossy= new AlbumPaperGlossy ("PPG1", 40);
		AlbumPaperGlossy bAlbumPaperGlossy= new AlbumPaperGlossy ("PPG2", 28);
		AlbumPaperGlossy cAlbumPaperGlossy= new AlbumPaperGlossy ("PPG3", 32);
		AlbumPaperGlossy dAlbumPaperGlossy= new AlbumPaperGlossy ("PPG4", 54);
		AlbumPaperGlossy eAlbumPaperGlossy= new AlbumPaperGlossy ("PPG5", 54);
		AlbumPaperGlossy fAlbumPaperGlossy= new AlbumPaperGlossy ("PPG6", 49);
		
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
