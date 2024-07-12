package com.javaAdvanceStar;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*		*        *
		**      **
		***    ***
		****  ****
		**********
		**********
		****  ****
		***    ***
		**      **
		*        *      Print this Star Pattern  */

		
		
		
		
		
		
		

		int n = 5; 
		 
		// upper half of star
		
		for (int i = 1 ; i<=n ;i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			
			// spaces 
			
			int spaces =2 *(n-i);
			
			for(int j = 1; j<= spaces; j++) {
				System.out.print(" ");
			}
			
			for(int j =  1; j<=i; j++) {
				System.out.print("*");
			}
					
				System.out.println();	
		}
		
		//Lower of Star
		
		
		for (int i = n ; i>=1 ;i--) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			
			// spaces 
			
			int spaces =2 *(n-i);
			
			for(int j = 1; j<= spaces; j++) {
				System.out.print(" ");
			}
			
			for(int j =  1; j<=i; j++) {
				System.out.print("*");
			}
					
				System.out.println();	
		}
		
	}

}
