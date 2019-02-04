package by.training.javabasics27.libraryTask;

public class FictionBook extends Book {

	private String genre;
	
	public FictionBook() { }
	
	public FictionBook (String title, String author, int year, double price, String genre) {
		super (title, author, year, price);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	

	@Override
	public String toString() {
		return "Book [title=" + getTitle() + ", author=" + getAuthor() 
		+ ", year=" + getYear() + ", price=" + getPrice() + ", genre=" + genre + "]";
	}
	
	public String toStringTable() {
		return "| " + getTitle() + " | " + getAuthor() + " | " + getYear() + " | " + getPrice() + " | " + genre + " |";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FictionBook other = (FictionBook) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		return true;
	}
	
}
