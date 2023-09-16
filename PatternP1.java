package com.jsp.PatternPrinting;

public class PatternP1 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int s=1; s<=n-i; s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j);
				if(j<i) {
					System.out.print("*");
				}
			}
		System.out.println();
		}
	}
}


//OUTPUT:
//    1
//   1*2
//  1*2*3
// 1*2*3*4
//1*2*3*4*5
