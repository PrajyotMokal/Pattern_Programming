package com.jsp.PatternPrinting;

public class PatternP8 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int s=1; s<=n-i; s++) {
				System.out.print(" ");
			}
			
			int k=i;
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(k);
				if(j<i) {
					k--;
				}else {
					k++;
				}
			}
		System.out.println();
		}
	}
}


//OUTPUT:
//    1
//   212
//  32123
// 4321234
//543212345
