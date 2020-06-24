public class TestBook {
	public static void main(String[] args) {
		Author author6 = new Author("Jeff", "jeff@gmail.com");
		Author author7 = new Author("Charlie", "charlie@gmail.com");
		Book book1 = new Book("Jeff's Book", author6, 20);
		Book book2 = new Book("Charlie's Book", author7, 25, 400);
		System.out.println(book1);
		System.out.println(book2);
	}
}