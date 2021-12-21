package Beginner_coder.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String str=br.readLine();
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(n*(str.charAt(i)-'0'));
		}
		System.out.println(n*Integer.parseInt(str));
	}
}
