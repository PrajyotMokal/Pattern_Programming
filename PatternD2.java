package com.jsp.PatternPrinting;

public class PatternD2 {
	public static void main(String[] args) {
		int n=7;
		int st=1;
		int sp=n/2;
		
		for(int i=1; i<=n; i++) {
			for(int s=1; s<=sp; s++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=st; j++) {
				System.out.print(i%2);
			}
			
			if(i<=n/2) {
				sp--;
				st=st+2;
			}else {
				st=st-2;
				sp++;
			}
		System.out.println();	
		}
	}
}


//OUTPUT:
//   1
//  000
// 11111
//0000000
// 11111
//  000
//   1