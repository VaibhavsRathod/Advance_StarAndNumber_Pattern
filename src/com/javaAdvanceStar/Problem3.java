package com.javaAdvanceStar;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5   Print this number pattern
		         */
		
		
		
		
		

		int n =5; 
		for (int i = 1; i<=n; i++) {
			
			// spaces 
			for(int j =1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			for(int j=1 ; j<=i; j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}

}
