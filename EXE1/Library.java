
public class Library {
	private String name;
	private Book[] books;
	
	public Library(String name) {
		setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	public Book[] getBooks() {
		return this.books;
	}
	
	public void showLibraryInformations() {
		System.out.println("\nName of the library: " + this.getName());
		System.out.println("Available books: ");
		for (int i = 0; i < this.getBooks().length; i++) {
			if (this.getBooks()[i] == null) {
				break;
			}
			System.out.println(this.getBooks()[i].getTitle()
					+ " written by " + this.getBooks()[i].getAuthor().getName()
					+ ", ISBN: " + this.getBooks()[i].getISBN());
		}
	}
}
