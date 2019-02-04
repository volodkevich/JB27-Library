package by.training.javabasics27.libraryTask;

public class DictionaryBook extends NonFictionBook {
	
	private String language;

	public DictionaryBook() {
	}

	public DictionaryBook(String title, String author, int year, double price, String area, String language) {
		super(title, author, year, price, area);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return("Book [title=" + getTitle() + ", author=" + getAuthor() + ", year=" + getYear() + ", price="
				+ getPrice() + ", area=" + getArea() + ", language= " + language + "]");
	}
	
	public String toStringTable() {
		return "| " + getTitle() + " | " + getAuthor() + " | " + getYear() + " | " + getPrice() + " | " + getArea() + " | " + language + " |";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((language == null) ? 0 : language.hashCode());
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
		DictionaryBook other = (DictionaryBook) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		return true;
	}	

}
