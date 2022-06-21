package classprograms;

public class Book {
	String writer;
	String title;
	int pageCount;

	Book() {

	}

	public Book(String author, String name, int pages) {
		writer = author;
		title = name;
		pageCount = pages;
	}

	String getAuthor() {
		return writer;
	}

	String getName() {
		return title;
	}

	int getPages() {
		return pageCount;
	}
}
