package Beginner_coder.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DevisionAndMulti {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int m=Integer.parseInt(br.readLine());
		int t=st.countTokens();
		int r1=0,r2=0;
		int temp=0;
		
		for(int i=0;i<t;i++) {
			temp=Integer.parseInt(st.nextToken());
			if(m%temp==0) r1+=temp;
			if(temp%m==0) r2+=temp;
		}
		
		System.out.println(r1);
		System.out.println(r2);
		
	}
}
