package by.training.javabasics27.libraryTask;

public class HistoricalBook extends NonFictionBook {
	
	private String period;

	public HistoricalBook() {
	}

	public HistoricalBook(String title, String author, int year, double price, String area, String period) {
		super(title, author, year, price, area);
		this.period = period;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	@Override
	public String toString() {
		return("Book [title=" + getTitle() + ", author=" + getAuthor() + ", year=" + getYear() + ", price="
				+ getPrice() + ", area=" + getArea() + ", period= " + period + "]");
	}
	
	public String toStringTable() {
		return "| " + getTitle() + " | " + getAuthor() + " | " + getYear() + " | " + getPrice() + " | " + getArea() + " | " + period + " |";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((period == null) ? 0 : period.hashCode());
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
		HistoricalBook other = (HistoricalBook) obj;
		if (period == null) {
			if (other.period != null)
				return false;
		} else if (!period.equals(other.period))
			return false;
		return true;
	}

}
