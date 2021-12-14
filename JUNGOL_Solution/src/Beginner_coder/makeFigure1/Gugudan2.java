package Beginner_coder.makeFigure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Gugudan2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		
		String str=br.readLine();
		
		int s=str.charAt(0)-'0';
		int e=str.charAt(2)-'0';
		boolean b=s>e?true:false;
		

		
		while(b&&s>=e||!b&&s<=e) {
			for(int i=1;i<=9;i++) {
				sb.append(s+" * "+i+" = ");
				if(i*s<10) sb.append(" ");
				sb.append(s*i);
				
				if(i%3==0) sb.append("\n");
				else sb.append("   ");
			}
			if(s!=e) sb.append("\n");
			if(b) s--;
			else s++;
			
		}
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
	}
}
