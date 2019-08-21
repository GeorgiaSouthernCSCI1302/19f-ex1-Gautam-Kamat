package assignment;
import java.util.Scanner;

public class FirstClassInGit {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//add a statement to display your name in the console
		System.out.println("Gautam");
		//Then commit your changes
		
		Scanner nsa = new Scanner(System.in);

		String x = nsa.nextLine();
		
		System.out.println("Type in your last name");
		
		System.out.println("Gautam" + x);
	}

}
