package com.jsp.PatternPrinting;

public class PatternP7 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int s=1; s<=n-i; s++) {
				System.out.print(" ");
			}
			
			int k=1;
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(k);
				if(j<i) {
					k++;
				}else {
					k--;
				}
			}
		System.out.println();
		}
	}
}


//OUTPUT:
//    1
//   121
//  12321
// 1234321
//123454321
