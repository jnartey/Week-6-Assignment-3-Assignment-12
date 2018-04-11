import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 1. Write a Java program to append the specified element to the end of a linked list. 
 */
public class LinkedListAppend {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String response = "";
		List<String> elements = new LinkedList<String>(Arrays.asList("Java", "Developer", "Hello", "World!"));
		
		System.out.println("Original list");
		System.out.println("-------------");
		System.out.println(elements);
		
		while(true) {
			System.out.println("Enter a letter or word to append to oringal list or q or Q to quit program");
			System.out.print("> ");
			response = input.nextLine();
			elements.add(response);
			
			if(response.equals("q") || response.equals("Q")) {
				break;
			}
			System.out.println("");
			System.out.println("Updated list with appended element at the end of the list");
			System.out.println("-------------");
			System.out.println(elements);
			System.out.println("");
			
			
		}
		
		System.out.println("Program ended...");
		input.close();
	}

}
