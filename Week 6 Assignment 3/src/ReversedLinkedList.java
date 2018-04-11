import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jacob Nartey
 *
 */
public class ReversedLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> elements = new LinkedList<String>(Arrays.asList("Java", "Developer", "Hello", "World!", "Collections", "LinkedList"));
		
		System.out.println("Original list");
		System.out.println("-------------");
		System.out.println(elements);
		System.out.println("");
		
		System.out.println("Reversed list");
		System.out.println("-------------");
		
		for(int i = elements.size()-1; i >= 0; i--) {
			System.out.println(elements.get(i));
		}

	}

}
