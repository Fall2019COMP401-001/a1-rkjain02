package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		String[] items = new String[count];
		double[] prices = new double[count];
		for(int i = 0; i<count; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		int customers = scan.nextInt();
		int number[] = new int[count];
		int total[] = new int[count];
		for(int i=0; i<count; i++) {
			number[i]=0;
			total[i]=0;
		}
		for(int j=0; j<customers; j++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int numberOfItems = scan.nextInt();
			for (int k=0; k<numberOfItems; k++) {
				int quantityOfItem = scan.nextInt();
				String item = scan.next();
				total[indexOfItem(items, item)] += quantityOfItem;
				number[indexOfItem(items, item)]++;
			}
		}
		
		for(int i=0; i<count; i++) {
			if(number[i] == 0) {
				System.out.println("No customers bought " + items[i]);
			}
			else {
				System.out.println(number[i] + " customers bought " + total[i] + " " + items[i]);
			}
		}
}
	static int indexOfItem(String[] vals, String s1) {
		int index =0;
		for(int i=0; i<vals.length; i++) {
			if(vals[i].equals(s1)) {
				index= i;
			}
		}
		return index;
	}
	
}
