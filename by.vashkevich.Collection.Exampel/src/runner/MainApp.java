package runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainApp {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.size();
		list.add("a");
		list.add("b");
		list.add("y");
		list.add("t");
		//list.set(1, "x");
	//	list.add(new Object());
		list.add(new String("q"));
	//	list.add(new Integer(3));
	//	list.add(new RuntimeException());
	//	list.add(new IllegalArgumentException());
	//	list.add(new Exception());
	//	list.add(new Integer(3));
	//	list.add(new NumberFormatException());
		list.remove(0);
		 
		
		
		

		for (String s : list) {
			System.out.println(s);
			
			
			
			
		
			// System.out.println(obj);
			//if (obj instanceof RuntimeException) {
			//	String str = (String) obj;
			//	int lenght = str.length();
			
			} 
		Iterator it = list.iterator();
		
		if (it.hasNext()){
		//	System.out.println(it.next());
		}
		do { System.out.println(it.next());
		}while(it.hasNext());
		
	 
		
		
//			if (obj.getClass().equals(String.class)) {
//				String str = (String) obj;
//				int point = str.codePointAt(0);
//				System.out.println(point);
//				System.out.println(obj.getClass());
//				System.out.println(String.class);
			

		
	}
	

