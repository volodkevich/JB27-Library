package by.training.javabasics27.libraryTask;

public class LibraryRunner {
	
	public static void main(String[] args) {
		
		Library library = new Library();
		
		library.addBook(new Book ("The Suitcase", "S.Dovlatov", 1986, 15.5));
		
		library.addBook(new FictionBook ("Master and Margarita", "M.Bulgakov", 1967, 25.1, "Novel"));
		library.addBook(new AdventureBook ("Les Enfants du capitaine Grant", "Jules Verne", 1868, 25.1, "Novel", "Maritime"));
		library.addBook(new FantasyBook ("Lord of the ring", "J.R.R.Tolkien", 1954, 31.2, "Novel", "Epic"));
		library.addBook(new ScienceFictionBook ("Solaris", "Stanislaw Lem", 1961, 28.6, "Novel", "Space"));
		
		library.addBook(new NonFictionBook ("Learning Java", "Kathy Sierra, Bert Bates", 2018, 32.2, "Education"));
		library.addBook(new BiographyBook ("Churchill: The Power of Words", "Martin Gilbert", 2012, 18.4, "Politicians", false));
		library.addBook(new HistoricalBook ("Забытая Беларусь", "V.Deruginsky", 2016, 12.3, "Belarus", "USSR"));
		library.addBook(new DictionaryBook ("Complete English-Russian dictionary", "V.Muller", 2013, 40.05, "Education", "English"));
		
		Library.simplePrint(library);
		Library.tablePrint(library);
		
		System.out.println("\nSearching by author... The result: \n" + Library.findBookByAuthor("Stanislaw Lem").toStringTable());
		System.out.println("\nSearching by author... The result: \n" + Library.findBookByAuthor("Martin Gilbert").toString());

	}

}
