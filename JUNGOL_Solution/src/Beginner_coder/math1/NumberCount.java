package Beginner_coder.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberCount {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
		int y=Integer.parseInt(br.readLine());
		int z=Integer.parseInt(br.readLine());
		String n=new String(x*y*z+"");
		int[] num=new int[10];
		
		int j=n.length();
		while(j-->0) {
			num[n.charAt(j)-'0']++;
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
}
