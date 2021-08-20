
public class Chapter {
	private int number;
	private Book book;
	
	public Chapter(int number, Book book) {
		setNumber(number);
		setBook(book);
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	public Book getBook() {
		return this.book;
	}
}
