package HomeTaskAll;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImplementation {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("TreeSet using Iterator: ");

        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
