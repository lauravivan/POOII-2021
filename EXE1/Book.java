
public class Book {
	private String title;
	private String ISBN;
	private Library library;
	private Author author;
	private Chapter[] chapters;
	
	public Book(String title, String ISBN, Author author) {
		setTitle(title);
		setISBN(ISBN);
		setAuthor(author);
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getISBN() {
		return this.ISBN;
	}
	
	public void setLibrary(Library library) {
		this.library = library;
	}
	
	public Library getLibrary() {
		return this.library;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	public void setChapters(Chapter[] chapters) {
		this.chapters = chapters;
	}
	
	public Chapter[] getChapters() {
		return this.chapters;
	}
	
}

