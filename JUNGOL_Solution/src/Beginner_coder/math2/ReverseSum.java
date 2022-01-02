package Beginner_coder.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseSum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n=Integer.parseInt(br.readLine());
			int r=0;
			int sum=0;
			int temp=0;
			if(n==0) break;
			
			 while(n>0) {
				 temp=n%10;
				 sum+=temp;
				 r=(r*10)+temp;
				 n=n/10;
			 }
			
			 System.out.println(r+" "+sum);
		}
	}
}
