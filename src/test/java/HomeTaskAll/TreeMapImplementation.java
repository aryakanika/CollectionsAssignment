package HomeTaskAll;

import java.util.TreeMap;

public class TreeMapImplementation {

	public static void main(String[] args) {
	 TreeMap<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        System.out.println("Key/Value mappings: " + numbers.entrySet());

        System.out.println("Keys: " + numbers.keySet());

        System.out.println("Values: " + numbers.values());
}

}
