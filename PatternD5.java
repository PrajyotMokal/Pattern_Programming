package com.jsp.PatternPrinting;

public class PatternD5 {
	public static void main(String[] args) {
		int n=7;
		int st=1;
		int sp=n/2;
				
		for(int i=1; i<=n; i++) {
			for(int s=1; s<=sp; s++) {
				System.out.print(" ");
			}
			
			int k=st/2+1;
			for(int j=1; j<=st; j++) {
				System.out.print(k);
				if(j<=st/2){
					k--;
				}else {
					k++;
				}
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
//  212
// 32123
//4321234
// 32123
//  212
//   1