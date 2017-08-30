package Bookstore.Bookstore;


public class lead {
	static service x = new service();
	public static void main(String[] args) {
		
		book new1 = new book("Othello"); x.addToMap(new1);
		book new2 = new book("Peter Pan"); x.addToMap(new2);
		book new3 = new book("Eragon"); x.addToMap(new3);
		book new4 = new book("The Left Hand of God"); x.addToMap(new4);
		book new5 = new book("Shrek"); x.addToMap(new5);
		
		x.removeFromMap(1);
		x.showAllBooks();
	}

//	public void newBook(String name){
//		x.addToMap(book(name));
//	}
	
}
