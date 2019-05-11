import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Pls enter your name: ");
		String name = scan.next();

		System.out.println("Welcome " + name);
	}

}