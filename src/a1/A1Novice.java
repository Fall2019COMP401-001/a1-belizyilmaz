package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		String [] firstLast = new String[count];
		
		for (int i=0; i<firstLast.length; i++) {
			firstLast[i] = sc.next();
			
			int countItems = sc.nextInt();
			int [] howManyEachItem = new int [countItems];
			String [] item = new String[countItems];
			Double[] price = new Double [countItems];
			
			
			for (int i1=0; i1<item.length; i1++) {
				
				howManyEachItem[i1] = sc.nextInt();
				
				item[i1] = sc.next();
				
				price[i1] = sc.nextDouble();

				}
			
		}

		sc.close();
		
		for(String s:firstLast){

			 System.out.println(s + ": ");
			 //+ String.format("%.2f", ((double) sum)));
			 
		   }
		
	}

	}

