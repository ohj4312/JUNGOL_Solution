package Beginner_coder.makeFigure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class NumberSquare2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		//배열을 이용해보자.
		//int[][] arr=new int[n][m];
		
		int num=1,j;
		for(int i=0;i<n;i++) {
			j=0;
			while(j++<m) {
				sb.append(num+" ");
				if(j==m) break;
				if(i%2==0) {
					num++;
				}else {
					num--;
				}
			}
			num=num+m;
			sb.setLength(sb.length()-1);
			sb.append("\n");
		}
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
	}
}
