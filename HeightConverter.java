import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		System.out.println("cm to inches to feet/foot");
		System.out.print("Input cm:");
		Scanner scan = new Scanner(System.in);
		int cm = scan.nextInt();

		
		
		float inc = 2.54f;	
	    double total = cm / inc;	  
	    double ft = total / 12 ; 
	    int in = 1;

		System.out.println(cm + "cm" + " is equivalent to: ");		
		
		DecimalFormat df = new
		DecimalFormat("#.###");
		System.out.print("=");			
		System.out.println(df.format(total)+" inches");


		System.out.print("=");
		System.out.print(df.format(ft));			
		if (total > in ) {		
		System.out.println(" Feet");
		}
		else {
		    System.out.println(" foot");
		
		   scan.close();   
		    
		
		
	}	
	}
}