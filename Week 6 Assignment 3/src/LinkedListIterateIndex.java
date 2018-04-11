import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
 *
 */
public class LinkedListIterateIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int response = 0;
		
		List<String> elements = new LinkedList<String>(Arrays.asList("Java", "Developer", "Hello", "World!", "Collections", "LinkedList"));
		
		System.out.println("Original list");
		System.out.println("-------------");
		System.out.println(elements);
		
		System.out.println("Enter specified position index to start from");
		System.out.print("> ");
		response = input.nextInt();
		System.out.println("");
		if(response > elements.size() || response < 1) {
			System.out.println("Specified position out of range!");
		}else {
			System.out.println("Iterated list from a specified position " + response);
			System.out.println("-------------");
			for(int i = response - 1; i < elements.size(); i++) {
				System.out.println(elements.get(i));
			}
		}
		
		input.close();
		
	}

}
