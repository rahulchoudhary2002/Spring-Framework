package jsp.springcore.constructors;

class Pages {

	public void read() {
		System.out.println("book have 200pages");
	}
}

public class Book {
	Pages pages;

	public void use() {
		pages.read();
		System.out.println("student is reading book");
	}

	public Book(Pages pages) {
		super();
		this.pages = pages;
	}

}
