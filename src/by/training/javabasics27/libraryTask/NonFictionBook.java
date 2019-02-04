package by.training.javabasics27.libraryTask;

public class NonFictionBook extends Book {
	
private String area;
	
	public NonFictionBook() { }
	
	public NonFictionBook (String title, String author, int year, double price, String area) {
		super (title, author, year, price);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return("Book [title=" + getTitle() + ", author=" + getAuthor()
		+ ", year=" + getYear() + ", price=" + getPrice() + ", area=" + area + "]");
	}
	
	public String toStringTable() {
		return "| " + getTitle() + " | " + getAuthor() + " | " + getYear() + " | " + getPrice() + " | " + area + " |";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((area == null) ? 0 : area.hashCode());
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
		NonFictionBook other = (NonFictionBook) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		return true;
	}

}
