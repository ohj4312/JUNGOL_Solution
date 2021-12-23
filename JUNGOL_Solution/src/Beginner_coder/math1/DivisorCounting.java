package Beginner_coder.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DivisorCounting {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		int cnt=0,result=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) cnt++;
			if(cnt==c) {
				result=i;
				break;
			}
		}
		
		System.out.println(result);
	}
}
