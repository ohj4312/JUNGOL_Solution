package Beginner_coder.makeFigure1;

import java.util.Scanner;

public class CharTriangle2 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char c='A';
		char[][] arr=new char[n][n];
		
		if(n<1||n>100) System.out.println("INPUT ERROR");
		else {
			for(int j=n/2;j>=0;j--) {
				for(int i=j;i<n-j;i++) {
					arr[i][j]=c;
					c++;
					if(c>'Z') c='A';
				}
			}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(arr[i][j]!=0) 
						sb.append(arr[i][j]+" ");
				}
				sb.append("\n");
			}
			
			sb.setLength(sb.length()-1);
			System.out.print(sb.toString());
		}
	}
}