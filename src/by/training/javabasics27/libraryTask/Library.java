package by.training.javabasics27.libraryTask;

import java.util.ArrayList;

public class Library {

	private static ArrayList<Book> library = new ArrayList<Book>();

	public Library() {}

	public ArrayList<Book> getLibrary() {
		return library;
	}

	public void setLibrary(ArrayList<Book> library) {
		this.library = library;
	}

	public static void addBook(Book book) {
		library.add(book);
	}

	public static boolean removeBook(Book book) {
		return library.remove(book);
	}
	
	public static Book findBookByAuthor(String author) {

		for (Book book : library) {
			if (book.getAuthor().equals(author)) {
				return book;
			}
		}
		return null;
	}

	
	public static void simplePrint(Library library){
		
		ArrayList<Book> printLib = library.getLibrary();		
		System.out.println("Library has books (list view): ");
		
		for(int i=0; i < printLib.size(); i++){			
			Book book = printLib.get(i);			
			System.out.println(book.toString());
		
		}

}
	
	public static void tablePrint(Library library){
		
		ArrayList<Book> printLib = library.getLibrary();		
		System.out.println("Library has books (table view): ");
		
		for(int i=0; i < printLib.size(); i++){			
			Book book = printLib.get(i);			
			System.out.println(book.toStringTable());
		
		}

}
}
