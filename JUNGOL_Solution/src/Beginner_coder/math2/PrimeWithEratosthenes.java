package Beginner_coder.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PrimeWithEratosthenes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		int min=0,sum=0;
		boolean[] ck=new boolean[m-n+1];	
		boolean no=false;
		
		if(n==1) ck[0]=true; //1일경우 예외
		for(int i=n;i<=m;i++) {
			for(int j=2;j<=Math.sqrt(m);j++) {
				if(i%j==0&&i!=j) ck[i-n]=true;
			}
		}
		
		
		for(int i=0;i<ck.length;i++) {
			if(!ck[i]) {
				sum=sum+n+i;
				if(!no) {
					no=true;
					min=n+i;
				}
			}
		}
		
		if(!no) System.out.println(-1); //없을경우 -1 출력
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
