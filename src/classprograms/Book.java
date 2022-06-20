package classprograms;

public class Book {
	String writer;
	String title;
	int pageCount;
	
	Book(){
		
	}
	
	public Book(String author,String name,int pages) {
		writer=author;
		title=name;
		pageCount=pages;
	}
	String getAuthor() {
		String narrator=writer;
		return narrator;
	}
	String getName() {
		String bookName=title;
		return bookName;
	}
	int getPages() {
		int pagenum=pageCount;
		return pagenum;
	}
}
