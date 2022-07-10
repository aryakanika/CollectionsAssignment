package HomeTaskAll;

import java.util.HashMap;

public class HashMapImplementation {

	public static void main(String[] args) {
		HashMap<Integer, String> languages = new HashMap<>();

	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    System.out.println("HashMap: " + languages);

	    System.out.println("Keys: " + languages.keySet());

	    System.out.println("Values: " + languages.values());
	    
	    System.out.println("Key/Value mappings: " + languages.entrySet());
	 
	}

}
