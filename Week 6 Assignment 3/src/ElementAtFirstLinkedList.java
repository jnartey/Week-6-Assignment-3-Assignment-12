import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 7. Write a Java program to insert the specified element at the front of a linked list. 
 *
 */
public class ElementAtFirstLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String element = "";
		
		Deque<String> elements = new LinkedList<String>(Arrays.asList("Java", "Developer", "Hello", "World!", "Collections", "LinkedList"));
		
		System.out.println("Original list");
		System.out.println("-------------");
		System.out.println(elements);
		System.out.println("");
		
		System.out.println("Enter specified element");
		System.out.print("> ");
		element = input.nextLine();
		System.out.println("");
		
		elements.addFirst(element);
			
		System.out.println("Updated list");
		System.out.println("-------------");
		System.out.println(elements);
		System.out.println("");
		
		System.out.println("Program ended...");
		input.close();
	}

}
