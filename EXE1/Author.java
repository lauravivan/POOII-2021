
public class Author {
	private String name;
	private Book[] books;
	
	public Author(String name) {
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
	
	public void showAuthorInformations() {
		System.out.println("\nName of the author: " + this.getName());
		System.out.println("Author's books: ");
		for (int i = 0; i < this.getBooks().length; i++) {
			if (this.getBooks()[i] == null) {
				break;
			}
			System.out.println(this.getBooks()[i].getTitle());
		}
	}
}
