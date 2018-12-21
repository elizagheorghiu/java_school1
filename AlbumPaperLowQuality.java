import java.util.ArrayList;

public class AlbumPaperLowQuality extends ArtAlbum {

	public AlbumPaperLowQuality(String bookName, int page) {
		super(bookName, page);
		this.bookName = bookName; 
		this.page = page; 
		
			}
		ArrayList<AlbumPaperLowQuality>myAlbumPaperLowQuality = new ArrayList<AlbumPaperLowQuality>();
		AlbumPaperLowQuality aAlbumPaperLowQuality= new AlbumPaperLowQuality ("PLQ1", 54);
		AlbumPaperLowQuality bAlbumPaperLowQuality= new AlbumPaperLowQuality ("PLQ2", 99);
		AlbumPaperLowQuality cAlbumPaperLowQuality= new AlbumPaperLowQuality ("PLQ3", 88);
		AlbumPaperLowQuality dAlbumPaperLowQuality= new AlbumPaperLowQuality ("PLQ4", 44);
		AlbumPaperLowQuality eAlbumPaperLowQuality= new AlbumPaperLowQuality ("PLQ5", 55);
		AlbumPaperLowQuality fAlbumPaperLowQuality= new AlbumPaperLowQuality ("PLQ6", 66);
		AlbumPaperLowQuality gAlbumPaperLowQuality= new AlbumPaperLowQuality ("PLQ7", 77);
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
