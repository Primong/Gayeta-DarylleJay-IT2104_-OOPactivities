import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Getting the Greater Value\n");
		System.out.print("Enter first character: ");
		char firstChar = scanner.next().charAt(0);

		System.out.print("Enter second character: ");
		char secondChar = scanner.next().charAt(0);

		char greaterChar = (char) Math.max(firstChar, secondChar);

        System.out.print("---------------------------------\n");
		System.out.println("The Character with greater value is: " + greaterChar);
        System.out.print("---------------------------------\n");
         System.out.print("Showing the ASCII Codes\n");
		System.out.println("f: " + (int) firstChar);
		System.out.println("a: " + (int) secondChar);

		scanner.close();
	}
}
