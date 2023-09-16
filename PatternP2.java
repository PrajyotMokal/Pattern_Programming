package com.jsp.PatternPrinting;

public class PatternP2 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int s=1; s<=n-i; s++) {
				System.out.print(" ");
			}
			
			int pro=1;
			for(int j=1; j<=i; j++) {
				System.out.print(j);
				if(j<i) {
					System.out.print("*");
				}
				pro=pro*j;
			}
			
			for(int s=1; s<=n-i; s++) {
				System.out.print(" ");
			}
			System.out.print("=" + pro);
		
		System.out.println();
		}
	}
}


//OUTPUT:
//    1    =1
//   1*2   =2
//  1*2*3  =6
// 1*2*3*4 =24
//1*2*3*4*5=120

