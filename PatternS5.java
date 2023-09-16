package com.jsp.PatternPrinting;

public class PatternS5 {
	public static void main(String[] args) {
		int n=5; int k=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(k%2);
				k++;
			}
			System.out.println();
		}
	}

}


//OUTPUT:
//10101
//01010
//10101
//01010
//10101
