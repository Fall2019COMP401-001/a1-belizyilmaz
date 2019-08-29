package a1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1Novice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		String [] first= new String[count];
		String [] last= new String[count];
				
		ArrayList<Double> sum = new ArrayList<Double>(count);

		//double sum = 0.0;

		for (int i=0; i<count; i++) {
			
			first[i] = sc.next();
			last[i] = sc.next();
			
			int countItems = sc.nextInt();

			int [] howManyEachItem = new int [countItems];
			String [] item = new String[countItems];
			double[] price = new double [countItems];
			
			double [] total = new double[countItems];
			//double total = 0.0;

			for (int i1=0; i1<item.length; i1++) {
										
				howManyEachItem[i1] = sc.nextInt();
				
				item[i1] = sc.next();
				
				price[i1] = sc.nextDouble();
				
				total[i1] += howManyEachItem[i1] * price[i1];

				
				
				}
			
			sum.add(findSum(total));
		// sum = total;
			
		}

		sc.close();

		for(int i1=0; i1<count; i1++){			
			
			System.out.println(first[i1].charAt(0) + ". "  + last[i1] + ": " + String.format("%.2f", ((double) sum.get(i1))));

		}
	}

	/*private static String[] combineString(String[] first, String[] last) {
		
		int length = first.length + last.length;
        String[] result = new String[length];
        System.arraycopy(first, 0, result, 0, first.length);
        System.arraycopy(last, 0, result, first.length, last.length);
        return result;
		
	}*/
	

	public static double findSum(double[] array) {
	    double total = 0.0;
	    for (int i = 0; i < array.length; i++) {
	        total += array[i];
	    }
	    return total;
	}
	
}

