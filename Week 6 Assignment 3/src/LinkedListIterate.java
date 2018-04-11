import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jacob Nartey
 * 2. Write a Java program to iterate through all elements in a linked list.
 *
 */
public class LinkedListIterate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> elements = new LinkedList<String>(Arrays.asList("Java", "Developer", "Hello", "World!", "Collections", "LinkedList"));
		System.out.println("Original list");
		System.out.println("-------------");
		System.out.println(elements);
		System.out.println("");
		
		System.out.println("Iterated List");
		System.out.println("-------------");
		elements.forEach((element) -> System.out.println(element));
	}

}
