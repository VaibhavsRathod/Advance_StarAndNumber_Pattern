package com.javaAdvanceStar;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*		    1
		   212
		  32123
		 4321234
		543212345           Print this number pattern            */

		
		
		
		
		
		int n = 5; 
		
		for(int i=1; i<=n; i++) {
			
			// for spaces 
			for(int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			// first half number 
			
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			
			// second half number 
			
			for(int j = 2; j<=i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		
	}

}
