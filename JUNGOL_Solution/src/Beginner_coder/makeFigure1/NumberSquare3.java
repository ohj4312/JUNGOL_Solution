package Beginner_coder.makeFigure1;

import java.util.Scanner;

public class NumberSquare3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		StringBuilder sb=new StringBuilder();
		int num=1;
		
		for(int i=0;i<n;i++) {
			num=i+1;
			for(int j=0;j<n;j++) {
				sb.append(num+" ");
				num=num+n;
			}
			sb.setLength(sb.length()-1);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		sc.close();
	}
}
