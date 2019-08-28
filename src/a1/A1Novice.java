package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		
		
		
		for(int i =0; i<count; i++) {
			double sum = 0.00;
			String firstName = scan.next();
			String lastName = scan.next();
			int numberOfItems = scan.nextInt();
			for(int j =0; j<numberOfItems; j++) {
				int quantityOfItem = scan.nextInt();
				String nameOfItem = scan.next();
				double priceOfItem = scan.nextDouble();
				sum += quantityOfItem * priceOfItem;
			}
			
			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + sum);
	
		}
	}
}
