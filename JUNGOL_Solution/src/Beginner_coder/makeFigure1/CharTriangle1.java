package Beginner_coder.makeFigure1;

import java.util.Scanner;

public class CharTriangle1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int n=sc.nextInt();
		char[][] arr=new char[n][n];
		char start='A';
		
		int i=0;
		int j=n-1;
		while(i<n&&j<n) {
			arr[i][j]=start;
			if(i==n-1) {
				i=j+1;
				j=n-1;
			}else {
				i++;
				j--;
			}
			start++;
			if(start>'Z') start='A';
		}
		
		for(int x=0;x<n;x++) {
			for(int y=0;y<n;y++) {
				if(arr[x][y]==0) sb.append("  "); //character 초기화는 0이다. 0일경우 공백을 출력하고 한칸뛰기위함이다.
				else sb.append(arr[x][y]+" ");
			}
			sb.setLength(sb.length()-1);
			sb.append("\n");
		}
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		sc.close();
	}
}
