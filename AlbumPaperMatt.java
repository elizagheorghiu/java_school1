import java.util.ArrayList;

public class AlbumPaperMatt extends ArtAlbum {

	public AlbumPaperMatt(String bookName, int page) {
		super(bookName, page);
		// TODO Auto-generated constructor stub
		this.bookName = bookName; 
		this.page = page; 
		
			}
		ArrayList<AlbumPaperMatt>myAlbumPaperMatt = new ArrayList<AlbumPaperMatt>();
		AlbumPaperMatt aAlbumPaperMatt= new AlbumPaperMatt ("PPM1", 40);
		AlbumPaperMatt bAlbumPaperMatt= new AlbumPaperMatt ("PPM2", 50);
		AlbumPaperMatt cAlbumPaperMatt= new AlbumPaperMatt ("PPM3", 80);
		AlbumPaperMatt dAlbumPaperMatt= new AlbumPaperMatt ("PPM4", 70);
		AlbumPaperMatt eAlbumPaperMatt= new AlbumPaperMatt ("PPM5", 60);
		
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
