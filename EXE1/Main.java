
public class Main {

	public static void main(String[] args) {
		Author dosto = new Author("Fyodor Dostoevsky");
		
		Book[] dostoBooks = new Book[40];
		dostoBooks[0] = new Book("Crime and Punishment", "978-85-7326-646-7", dosto);
		dostoBooks[1] = new Book("White Nights", "978-02-4125-208-6", dosto);
		dostoBooks[2] = new Book("The Eternal Husband", "978-18-4749-656-0", dosto);
		
		dosto.setBooks(dostoBooks);

		Chapter[] crimeAndPuniChapters = new Chapter[39];
		crimeAndPuniChapters[0] = new Chapter(1, dostoBooks[0]);
		crimeAndPuniChapters[1] = new Chapter(2, dostoBooks[0]);
		crimeAndPuniChapters[2] = new Chapter(3, dostoBooks[0]);
		
		dostoBooks[0].setChapters(crimeAndPuniChapters);
		
		dosto.showAuthorInformations();
		
		
		Author doyle = new Author("Arthur Conan Doyle");
	
		Book[] doyleBooks = new Book[10];
		doyleBooks[0] = new Book("The Adventures of Sherlock Holmes", "978-04-8647-491-5", doyle);
		doyleBooks[1] = new Book("The Valley of Fear", "978-14-2093-167-9", doyle);
		
		doyle.setBooks(doyleBooks);
		
		
		Library myLibrary = new Library("Laura's library");
		
		Book[] myLibraryBooks = new Book[1000];
		myLibraryBooks[0] = doyleBooks[1];
		myLibraryBooks[1] = dostoBooks[0];
		myLibraryBooks[2] = dostoBooks[2];
		
		myLibrary.setBooks(myLibraryBooks);
		myLibrary.showLibraryInformations();

	}
}
