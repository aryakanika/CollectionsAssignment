package HomeTaskAll;

import java.util.LinkedHashMap;

public class LinkedHashMapImplementation {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("LinkedHashMap: " + numbers);

        System.out.println("Key/Value mappings: " + numbers.entrySet());

        System.out.println("Keys: " + numbers.keySet());

        System.out.println("Values: " + numbers.values());
    }

}
