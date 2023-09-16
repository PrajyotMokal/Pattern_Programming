package com.jsp.PatternPrinting;

public class PatternP5 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int s=1; s<=n-i; s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(i%2);
			}
		System.out.println();
		}
	}
}


//OUTPUT:
//    1
//   000
//  11111
// 0000000
//111111111
