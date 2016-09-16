
import java.util.Scanner;

public class QB_rating {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Ask user for number of passing attempts
		System.out.print("Enter number of passing attempts:");
		double att = input.nextDouble();
		
		//Ask user for number of completions
		System.out.print("Enter number of completions:");
		double comp = input.nextDouble();
		
		//Ask user for number of passing yards
		System.out.print("Enter number of passing yards:");
		double yds = input.nextDouble();
		
		//Ask user for number of touch-down passes
		System.out.print("Enter number of touch-down passes:");
		double td = input.nextDouble();
		
		//Ask user for number of interceptions
		System.out.print("Enter number of interceptions:");
		double inter = input.nextDouble();
		
		double a = ((comp / att) - .3) * 5;
		double b = ((yds / att) - 3) * .25;
		double c = (td / att) * 20;
		double d = 2.375 - ((inter / att) * 25);
		
		double qb_rating = ((a + b + c + d) / 6) * 100; 
		
		System.out.println("This players quarterback rating is:" + qb_rating);
		
	}
}
