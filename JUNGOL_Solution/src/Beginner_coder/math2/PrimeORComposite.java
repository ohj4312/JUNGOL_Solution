package Beginner_coder.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeORComposite {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		String so="prime number";
		String hap="composite number";
		String one="number one";
		
		int t=st.countTokens();
		int temp=0,sqrt=0;
		boolean ck=true;
		for(int i=0;i<t;i++) {
			temp=Integer.parseInt(st.nextToken());
			if(temp==1) {
				System.out.println(one);
				continue;
			}
			
			sqrt=(int) Math.sqrt(temp);
			for(int j=2;j<=sqrt;j++) {
				if(temp%j==0) {
					System.out.println(hap);
					ck=false;
					break;
				}
			}
			
			if(ck) System.out.println(so);
			ck=true;
			
		}
		
	}
}
