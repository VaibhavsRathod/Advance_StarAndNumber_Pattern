package com.javaAdvanceStar;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 4;
		
		// Upper Half of Star pattern
		 
		for (int i = 1; i<=n; i++) {
			
			for (int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// Lower half of star patter 
		
		for (int i = n; i>=1; i--) {
			
			for (int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}