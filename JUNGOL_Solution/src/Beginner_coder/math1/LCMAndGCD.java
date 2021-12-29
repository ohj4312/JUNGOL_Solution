package Beginner_coder.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LCMAndGCD {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] arr=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int gcd=arr[0],lcm=arr[0],temp=1;
		for(int i=1;i<n;i++) {
			gcd=getGcd(gcd,arr[i]);
			lcm=lcm/getGcd(lcm,arr[i])*arr[i]; //lcm 수정으로 해결!
		}
		
		System.out.println(gcd);
		System.out.println(lcm);
	}

	private static int getGcd(int i, int j) {
		int t=i>j?j:i;
		int result=0;
		for(int x=1;x<=t;x++) {
			if(i%x==0&&j%x==0) result=x;
		}
		return result;
	}
}
