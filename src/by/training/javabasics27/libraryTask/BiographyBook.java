package by.training.javabasics27.libraryTask;

public class BiographyBook extends NonFictionBook {
	
	private boolean isAutobiography;

	public BiographyBook() {
	}

	public BiographyBook(String title, String author, int year, double price, String area, boolean isAutobiography) {
		super(title, author, year, price, area);
		this.isAutobiography = isAutobiography;
	}

	public boolean isAutobiography() {
		return isAutobiography;
	}

	public void setAutobiography(boolean isAutobiography) {
		this.isAutobiography = isAutobiography;
	}

	@Override
	public String toString() {
		return("Book [title=" + getTitle() + ", author=" + getAuthor() + ", year=" + getYear() + ", price="
				+ getPrice() + ", area=" + getArea() + ", it's autobiography= " + isAutobiography + "]");
	}
	
	public String toStringTable() {
		return "| " + getTitle() + " | " + getAuthor() + " | " + getYear() + " | " + getPrice() + " | " + getArea() + " | " + isAutobiography + " |";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (isAutobiography ? 1231 : 1237);
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
		BiographyBook other = (BiographyBook) obj;
		if (isAutobiography != other.isAutobiography)
			return false;
		return true;
	}

}
