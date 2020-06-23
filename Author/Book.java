public class Book {
	// Private instance variables: title (String), author (Author), price (double), qty (int)
	private String title;
	private Author author;
	private double price;
	private int qty;


	// Write 2 constructors (review method overloading if needed)
	// 1st one has arguments name, author, price
	// 2nd one has arguments name, author, price, qty

	public Book(String title, Author author, double price) {
		title = title;
		author = author;
		price = price;
	}

	public Book(String title, Author author, double price, int qty) {
		title = title;
		author = author;
		price = price;
		qty = qty;
	}

	// Write getters for all the private instance variables

	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	// Write setters for price and quantity  <---- Is this how to do this?
	public Book() {
		price = 0.0;
		qty = 0;
	}

	@Override
    public String toString() {
    	return "Book[title=" + this.title + author.toString() + 
    	" price=" + this.price + ", qty=" + this.qty + "]";

    	// Book[title=_, Author[name=_, email=_], price=_, qty=_]
    }

}