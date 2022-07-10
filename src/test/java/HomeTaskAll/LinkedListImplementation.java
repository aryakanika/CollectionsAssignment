package HomeTaskAll;

import java.util.LinkedList;

public class LinkedListImplementation {

	public static void main(String[] args) {
		 LinkedList<String> animals = new LinkedList<>();
	        animals.add("Cow");
	        animals.add("Cat");
	        animals.add("Dog");
	        System.out.println("LinkedList: " + animals);

	        System.out.println("Accessing linked list elements:");
	        for(String animal: animals) {
	            System.out.print(animal);
	            System.out.print(", ");
	        }
	    }

}
