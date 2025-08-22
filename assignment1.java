# java
package oops;
import java.util.*;
public class Main {

		
		    static class Book {
		        String title, author;
		        Book(String t,String a){ title=t; author=a; }
		        public String toString(){ return title+" by "+author; }
		    }

		    public static void main(String[] args) {
		        ArrayList<Book> books=new ArrayList<>();
		        books.add(new Book("Java","James"));
		        books.add(new Book("DSA","Mark"));

		        try {
		            System.out.println("Found: "+search(books,"Java"));
		            System.out.println("Found: "+search(books,"Python"));
		        } catch(Exception e){ 
		            System.out.println(e.getMessage()); 
		        }
		    }

		    static Book search(ArrayList<Book> books,String t) throws Exception {
		        for(Book b:books) if(b.title.equalsIgnoreCase(t)) return b;
		        throw new Exception("Book '"+t+"' not found");
		    }
		
}
