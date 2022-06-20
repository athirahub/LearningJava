package classprograms;

public class BookInfo {

	public static void main(String[] args) {
		Book harryPotter=new Book("Rowling","ChamberOfSecrets",1000);
		
		harryPotter.getAuthor();
		System.out.println("The author of the book HarryPotter is:"+harryPotter.getAuthor());
		
		harryPotter.getName();
		System.out.println("The title name of book HarryPotter is:"+harryPotter.getName());
		
		harryPotter.getPages();
		System.out.println("The number of pages in book HarryPotter is:"+harryPotter.getPages());
		

	}

}
