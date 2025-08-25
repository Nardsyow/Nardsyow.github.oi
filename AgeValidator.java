import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	System.out.println("How old are you? ");
	System.out.print("enter your age: ");
		int age = scan.nextInt();
				if (age >= 18) {
		    System.out.println("Legal age, nigga");
		}
		else {
		    System.out.println("f*cking minor");
		    
		    scan.close();
		}
	}
}