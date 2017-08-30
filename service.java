package Bookstore.Bookstore;
import java.util.HashMap;



public class service {
	
	int i =1;
	HashMap<Integer, book> m1 = new HashMap<Integer, book>();

	
	public void addToMap(book thing){
		m1.put(i, thing);
		System.out.println(i);

		i++;
		System.out.println("you have added " +thing.name);
	}
	public void removeFromMap(int n){
		System.out.println("you have removed " + m1.get(n).name);
		m1.remove(n);
	}
	public void showAllBooks(){
		System.out.println("Your books are: ");
		for (int k=1; k<m1.size()+2; k++){
			try{
			System.out.println(m1.get(k).name);
		}catch (Exception e) {
			e.fillInStackTrace();
		}
			}
		
	}
	
//	m1.put(0, new1);
//	m1.put(1, new2);
//	m1.put(2, new3);
//	m1.put(3, new4);
//	m1.put(4, new5);
	
	
}
