import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 5. Write a Java program to insert the specified element at the specified position in the linked list.
 *
 */
public class InsertAtLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int response = 0;
		String element = "";
		
		List<String> elements = new LinkedList<String>(Arrays.asList("Java", "Developer", "Hello", "World!", "Collections", "LinkedList"));
		
		System.out.println("Original list");
		System.out.println("-------------");
		System.out.println(elements);
		System.out.println("");
		
		System.out.println("Enter specified element");
		System.out.print("> ");
		element = input.nextLine();
		System.out.println("Enter specified position index to insert");
		System.out.print("> ");
		response = input.nextInt();
		System.out.println("");
		
		if(response > elements.size() || response < 1) {
			System.out.println("Specified position out of range!");
		}else {
			elements.add(response - 1, element);
			System.out.println("Updated list");
			System.out.println("-------------");
			System.out.println(elements);
		}
		
		input.close();
	}

}
