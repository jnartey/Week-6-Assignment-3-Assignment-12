import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 6. Write a Java program to insert elements into the linked list at the first and last position.
 *
 */
public class FirstLastLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int response = 1;
		String element = "";
		
		Deque<String> elements = new LinkedList<String>(Arrays.asList("Java", "Developer", "Hello", "World!", "Collections", "LinkedList"));
		
		System.out.println("Original list");
		System.out.println("-------------");
		System.out.println(elements);
		System.out.println("");
		
		while(true) {
			System.out.println("Enter specified element or 'q' or 'Q' to quit");
			System.out.print("> ");
			element = input.nextLine();
			System.out.println("");
			
			if(element.equals("q") || element.equals("Q")) {
				break;
			}
			
			System.out.println("1.Insert at first position\n"
					+ "2.Insert at last position");
			System.out.println("Use 1 or 2 to select specified position to insert element at");
			System.out.print("> ");
			response = input.nextInt();
			System.out.println("");
			input.nextLine();
			
			switch(response) {
			case 1:
				elements.addFirst(element);
				break;
			case 2:
				elements.addLast(element);
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
			
			System.out.println("Updated list");
			System.out.println("-------------");
			System.out.println(elements);
			System.out.println("");
		}
		
		
		System.out.println("Program ended...");
		input.close();
	}

}
