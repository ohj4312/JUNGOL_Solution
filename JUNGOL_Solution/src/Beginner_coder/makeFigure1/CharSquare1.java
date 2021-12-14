package Beginner_coder.makeFigure1;

import java.util.Scanner;

public class CharSquare1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int n=sc.nextInt();
		
		//배열을 이용하지 않는 경우		
		/*
		 * char start=(char) ('A'+(n*n%('Z'-'A'+1))-1 ); //앞에서부터 채우려고
		 * System.out.println((int)'A'); System.out.println('Z'-'A'); for(int
		 * i=0;i<n;i++) { for(int j=0;j<n;j++) { sb.append(start+" "); start=(char)
		 * (start-n); if(start<'A') { System.out.println((int)start); start=(char)
		 * ('Z'-(start+n-'A'+1)); System.out.println((int)start+" : "+start); } }
		 * sb.setLength(sb.length()-1); sb.append("\n"); start=(char) (start+(n*n) -1);
		 * if(start<'A') start=(char) ('Z'-(start+n-'A')-1); }
		 */
		
		//배열을 이용하는 경우(531ms,18MB)
		
		  char[][] arr=new char[n][n]; 
		  char start='A'; 
		  
		  for(int i=n-1;i>=0;i--) {
			  for(int j=n-1;j>=0;j--) { 
				  arr[j][i]=start; 
				  start++; 
				  if(start>'Z') start='A';
			  } 
		  }
		  
		  //531ms
		  for(int i=0;i<n;i++) { 
			  for(int j=0;j<n;j++) { 
				  sb.append(arr[i][j]+" ");
			  }
			  sb.setLength(sb.length()-1);
			  sb.append("\n"); 
		  }
		  
		  //488ms
		  for(int i=0;i<n;i++) { 
			  for(int j=0;j<n;j++) { 
				  System.out.print(arr[i][j]+" ");
			  }
			  System.out.println(" "); 
		  }
		 
		//System.out.println(sb.toString());
		sc.close();
		
	}
}
