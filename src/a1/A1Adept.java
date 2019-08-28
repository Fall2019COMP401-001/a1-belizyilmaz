package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();

		String[] item = new String[count];
		double[] price = new double[count];
		
		for ( int i = 0; i < item.length; i++){
			
			item[i] = scan.next();
			price[i] = scan.nextDouble();
		
		}
		
		int people = scan.nextInt();
		double sum = 0.0;
		double big = Integer.MIN_VALUE;
		double small = Integer.MAX_VALUE;
		String biggestName = "";
		String smallestName = "";
		
		for ( int j = 0; j < people; j++){
			
			String first = new String(scan.next());
			String last = new String(scan.next());
			int howManyItems = scan.nextInt();
			double total = 0.0;
		
			for ( int a = 0; a < howManyItems; a++){
		
				int quantity = scan.nextInt();
				String itemName = scan.next();
				int index = 0;
		
				for ( int b = 0; b < item.length; b++){
				
					if ( item[b].equals(itemName)){
			
						index = b;
						}
				}
				
				total += quantity * price[index];
			}
			
			sum += total;
			
			if (total > big){
			
				big = total;
				biggestName = first + " " + last;
			}
			
			if (total < small){
			
				small = total;
				smallestName = first + " " + last;
			}
			
		
		
		}
		
		scan.close();
		
		double average = sum / (double)people;
		
		System.out.println("Biggest: " + biggestName + " " + "(" + String.format("%.2f", (double) big) + ")");
		System.out.println("Smallest: " + smallestName + " " + "(" + String.format("%.2f", (double) small) + ")");
		System.out.println("Average: " + String.format("%.2f", (double) average));

	}
	
}



