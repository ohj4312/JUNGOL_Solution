package Beginner_coder.math1;

import java.util.Scanner;

public class GCDAndLCM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int temp=n>m?m:n;
		int gcd=1;
		
		for(int i=1;i<=temp;i++) {
			if(n%i==0&&m%i==0) gcd=i;
		}
		
		System.out.println(gcd);
		System.out.println(n*m/gcd);
		
		sc.close();
	}
}
