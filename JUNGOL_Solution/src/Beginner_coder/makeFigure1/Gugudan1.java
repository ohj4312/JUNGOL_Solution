package Beginner_coder.makeFigure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Gugudan1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		/* Input Error 후 다시 출력하기 위해 코드 변경
		 * String str=br.readLine(); //s와 e의 범위는 2~9이므로 charAt의 인덱스를 통해서 추출가능, 10이상일 경우
		 * 불가능하다. int i=str.charAt(0)-'0'; int j=str.charAt(2)-'0';
		 */
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int i=Integer.parseInt(st.nextToken());
		int j=Integer.parseInt(st.nextToken());
		
		while(i>9||j>9||i<2||j<2) {
			bw.write("INPUT ERROR!");
			st=new StringTokenizer(br.readLine()," ");
			i=Integer.parseInt(st.nextToken());
			j=Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb=new StringBuilder();
		
		boolean b=i>j?true:false;
		int start=i; //다음줄에서 다시 사용하기 위함
		
		for(int n=1;n<=9;n++) {
			while(b&&i>=j||!b&&i<=j) {
				sb.append(i+" * "+n+" = ");
				sb.append((i*n<10)?" "+i*n:i*n);
				if(i!=j) sb.append("   ");
				i=b?i-1:i+1;
			}
			sb.append("\n");
			i=start;
		}
		
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
	}
}
