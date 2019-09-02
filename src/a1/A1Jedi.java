package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// read in count of items to process
		int itemCount = scan.nextInt();
		
		/* create a string array to store the item names and then create a double array to store the cost
		 * for each item
		 */
		String[] itemName = new String[itemCount];
		double[] cost = new double[itemCount];
		
		// Read the item name and the cost into the array
		for ( int i = 0; i < itemName.length; i++) {
			itemName[i] = scan.next();
			cost[i] = scan.nextDouble();
		}
		
		// read in count of people to process
		int peopleCount = scan.nextInt();
		
		/* create two string arrays for the first and the last name of the customer, an integer array for
		 * how many people will have bought a certain item and another array for the total number of a certain
		   item.
		*/
		String[] first = new String[peopleCount];
		String[] last = new String[peopleCount];
		int count[] = new int[itemCount];
		int total[] = new int[itemCount];
		
		/* Read first and last name into the array as well as how many items they each bought in total,
		 * what items and and how many of each of those items.
		 */
		for ( int j = 0; j < peopleCount; j++){
			first[j] = scan.next();
			last[j] = scan.next();
			
			// read in count of items under the customer's name
			int itemCountAgain = scan.nextInt();
			
			/* create an array for the quantity of each item for each person,
			 * an array for items a customer bought and an array for prices of each item 
			 */
			int[]quantity = new int[itemCountAgain];

			String boughtItem[] = new String [itemCountAgain];
			double boughtPrice[] = new double [itemCountAgain];
			
			int itemOf[] = new int [itemCount];
			
			//read quantity and the item name into the array
			for ( int a = 0; a < itemCountAgain; a++){
				
				quantity[a] = scan.nextInt();
				boughtItem[a] = scan.next();
				
				/* while reading quantity and the item name, read if the items defined and items that customers
				 * bought are the same in the array
				 */
				for ( int b = 0; b < itemName.length; b++){
					
					// check if a customer bought one of the items above
					if (boughtItem[a].equals(itemName[b])){
						boughtPrice[a] = cost[b];
						itemOf[b]++;
						if (itemOf[b]==1) {
							count[b]++;
						}
						
						// add the quantity of each item 
						total[b] = total[b] + quantity[a];
					}
				}
				
			}
						
		}
		
		//Input is completed, so close scanner
		scan.close();
		
		/*print "No customers..." if the count is zero, and print how many people bought how many of each item
		 * if the count is not zero.
		 */
		for(int i1=0; i1<itemCount; i1++){	
			if(count[i1]==0) {
				System.out.println("No customers bought " + itemName[i1]);

			} else {
			
			System.out.println(count[i1] + " customers bought " + total[i1] + " " + itemName[i1]);

		}

}
}
}




