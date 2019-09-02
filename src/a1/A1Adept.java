package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//read in count of items
		int count = scan.nextInt();

		String[] item = new String[count];
		double[] cost = new double[count];
		
		// read item and cost into the array
		for ( int i = 0; i < item.length; i++) {
			item[i] = scan.next();
			cost[i] = scan.nextDouble();
		}
		
		//read in count of people
		int peopleCount = scan.nextInt(); 
		 
		double sum = 0.0;
		
		// use helper functions to define the minimum and maximum value  
		double big = Integer.MIN_VALUE;
		double small = Integer.MAX_VALUE;
		
		//create two strings for the output to print
		String biggestName = "";
		String smallestName = "";
		
		// read first and last name into the array, then read the count of items they each bought in count of
		// people
		
		for ( int j = 0; j < peopleCount; j++){
			String first = new String(scan.next());
			String last = new String(scan.next());
			int numItems = scan.nextInt();
			double total = 0.0;
		
			// read the quantity of each item and the item name into the array in count of items 
			for ( int a = 0; a < numItems; a++){
				int quantity = scan.nextInt();
				String itemOf = scan.next();
				int index = 0;
				
				// check if the items the customers bought match the items in the first input 
				for ( int b = 0; b < item.length; b++){
					if ( item[b].equals(itemOf)){
						index = b;
					}
				}
				
				// calculate the total cost for each customer
				total += quantity * cost[index];
		
			}
			
			// calculate the total cost
			sum += total;
			
			/* state that if the total cost for a customer has the highest value, then the string biggestName
			 * is the first and last name of that customer.
			 * and if the total cost for a customer has the lowest value, then the string smallestName 
			 * is the first and last name of that customer
			 */
			if (total > big){
				big = total;
				biggestName = first + " " + last;
			}
			
			if (total < small){
				small = total;
				smallestName = first + " " + last;
			}
		}
		
		//Inpute complete, close scanner
		scan.close();
		
		//calculate the average 
		double average = sum / (double)peopleCount;
		
		//print out 
		System.out.println("Biggest: " + biggestName + " (" + String.format("%.2f", (double) big) + ")");
		System.out.println("Smallest: " + smallestName + " (" + String.format("%.2f", (double) small) + ")");
		System.out.println("Average: " + String.format("%.2f", (double) average));

}
}



