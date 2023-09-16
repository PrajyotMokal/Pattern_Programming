package com.jsp.PatternPrinting;

public class PatternS7 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print((char) (64+j) + " ");
			}
			System.out.println();
		}
	}

}


//OUTPUT:
//A B C D E 
//A B C D E 
//A B C D E 
//A B C D E 
//A B C D E 
