package com.jsp.PatternPrinting;

public class PatternT15 {
	public static void main(String[] args) {
		int n =5;
		for(int i=1; i<=n; i++) {
			for(int s=1; s<i; s++) {
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
		System.out.println();
		}
	}

}


//OUTPUT:
//*****
// ****
//  ***
//   **
//    *
