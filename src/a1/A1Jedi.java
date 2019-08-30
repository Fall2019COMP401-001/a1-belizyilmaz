package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int itemCount = scan.nextInt();
		String[] itemName = new String[itemCount];
		double[] cost = new double[itemCount];
		
		for ( int i = 0; i < itemName.length; i++) {
			itemName[i] = scan.next();
			cost[i] = scan.nextDouble();
		}
		
		int peopleCount = scan.nextInt();
		String[] first = new String[peopleCount];
		String[] last = new String[peopleCount];
		int count[] = new int[itemCount];
		int total[] = new int[itemCount];
				
		for ( int j = 0; j < peopleCount; j++){
			first[j] = scan.next();
			last[j] = scan.next();
			
			int itemCountAgain = scan.nextInt();
			int[]quantity = new int[itemCountAgain];

			String boughtItem[] = new String [itemCountAgain];
			double boughtPrice[] = new double [itemCountAgain];
			
			int itemOf[] = new int [itemCount];
			
			for ( int a = 0; a < itemCountAgain; a++){
				
				quantity[a] = scan.nextInt();
				boughtItem[a] = scan.next();
				
				for ( int b = 0; b < itemName.length; b++){
					if (boughtItem[a].equals(itemName[b])){
						boughtPrice[a] = cost[b];
						itemOf[b]++;
						if (itemOf[b]==1) {
							count[b]++;
						}
						
						total[b] = total[b] + quantity[a];
					}
				}
				
			}
						
		}
		
		scan.close();
		
		for(int i1=0; i1<itemCount; i1++){	
			if(count[i1]==0) {
				System.out.println("No customers bought " + itemName[i1]);

			} else {
			
			System.out.println(count[i1] + " customers bought " + total[i1] + " " + itemName[i1]);

		}

}
}
}




