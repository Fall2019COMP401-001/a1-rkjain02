package a1;

import java.util.Scanner;

public class A1Adept {

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
		double allSums[] = new double[customers];
		String firstName[] = new String[customers];
		String lastName[] = new String[customers];
		for(int j=0; j<customers; j++) {
			double sum = 0;
			firstName[j] = scan.next();
			lastName[j] = scan.next();
			int numberOfItems = scan.nextInt();
			for (int k=0; k<numberOfItems; k++) {
				int quantityOfItem = scan.nextInt();
				double costOfItem =0;
				String item = scan.next();
				for(int i =0; i<count; i++) {
					if(item.equals(items[i])) {
						costOfItem = prices[i];
					}
				}
				sum += quantityOfItem * costOfItem;
				
			}
			allSums[j] = sum;
		}
		int indexOfMin=0;
		int indexOfMax=0;
		double totalSum =0;
		double average =0;
		for(int i=0; i<allSums.length; i++) {
			if(allSums[i] == findValueMin(allSums)) {
				indexOfMin =i;
			}
			if(allSums[i] == findValueMax(allSums)) {
				indexOfMax =i;
			}
			totalSum += allSums[i];
			average = totalSum/allSums.length;
		}
		System.out.println("Biggest: " + firstName[indexOfMax] + " " + lastName[indexOfMax] + " (" + String.format("%.2f", allSums[indexOfMax]) + ")");
		System.out.println("Smallest: " + firstName[indexOfMin] + " " + lastName[indexOfMin] + " (" + String.format("%.2f", allSums[indexOfMin]) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
	}
	
static double findValueMin(double[] vals) {
		double cur_min = vals[0];
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		return cur_min;
	}

	
	
static double findValueMax(double[] vals) {
		double cur_max = vals[0];
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		return cur_max;
	}
}

