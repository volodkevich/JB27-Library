package by.training.javabasics27.libraryTask;

public class FantasyBook extends FictionBook {
	
	private String subsection;

	public FantasyBook() {
	}

	public FantasyBook(String title, String author, int year, double price, String genre, String subsection) {
		super(title, author, year, price, genre);
		this.subsection = subsection;
	}

	public String getSubsection() {
		return subsection;
	}

	public void setSubsection(String subsection) {
		this.subsection = subsection;
	}

	@Override
	public String toString() {
		return("Book [title=" + getTitle() + ", author=" + getAuthor() + ", year=" + getYear() + ", price="
				+ getPrice() + ", genre=" + getGenre() + ", subsection= " + subsection + "]");
	}
	
	public String toStringTable() {
		return "| " + getTitle() + " | " + getAuthor() + " | " + getYear() + " | " + getPrice() + " | " + getGenre() + " | " + subsection + " |";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((subsection == null) ? 0 : subsection.hashCode());
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
		FantasyBook other = (FantasyBook) obj;
		if (subsection == null) {
			if (other.subsection != null)
				return false;
		} else if (!subsection.equals(other.subsection))
			return false;
		return true;
	}

}
