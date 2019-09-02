package a1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1Novice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// After scanner is created, type in the code how many customers there are. 
		
		int count = sc.nextInt();
		String [] first= new String[count];
		String [] last= new String[count];
				
		ArrayList<Double> sum = new ArrayList<Double>(count);
		
		// Type first and last name. Then type how many items they each bought.
		
		for (int i=0; i<count; i++) {
			
			first[i] = sc.next();
			last[i] = sc.next();
			
			int countItems = sc.nextInt();

			int [] howManyEachItem = new int [countItems];
			String [] item = new String[countItems];
			double[] price = new double [countItems];
			
			double [] total = new double[countItems];

			/* Define how many of each item there are, the items' names, the price of each item and 
			 * calculate the total price for each item. When as many items are in the input as defined,
			 * the code will repeat for each person.
			 */
			
			for (int i1=0; i1<item.length; i1++) {
										
				howManyEachItem[i1] = sc.nextInt();
				
				item[i1] = sc.next();
				
				price[i1] = sc.nextDouble();
				
				total[i1] += howManyEachItem[i1] * price[i1];
				
				}
			
			// Uses the findSum function to add the price array for each customer
			
			sum.add(findSum(total));
			
		}

		sc.close();

		// The output will print the first and last name of the customer and how much they spent in total

		for(int i1=0; i1<count; i1++){			
			
			System.out.println(first[i1].charAt(0) + ". "  + last[i1] + ": " + String.format("%.2f", ((double) sum.get(i1))));

		}
	}
	
// Takes the sum of an array

	public static double findSum(double[] array) {
	    double total = 0.0;
	    for (int i = 0; i < array.length; i++) {
	        total += array[i];
	    }
	    return total;
	}
	
}

