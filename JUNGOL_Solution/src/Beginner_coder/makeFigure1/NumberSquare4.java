package Beginner_coder.makeFigure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class NumberSquare4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		switch(m) {
		case 1:
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					sb.append(i+1+" ");
				}
				sb.setLength(sb.length()-1);
				sb.append("\n");
			}
			break;
		case 2:
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i%2==0)sb.append(j+1+" ");
					else sb.append(n-j+" ");
				}
				sb.setLength(sb.length()-1);
				sb.append("\n");
			}
			break;
		case 3:
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					sb.append((i+1)*(j+1)+" ");
				}
				sb.setLength(sb.length()-1);
				sb.append("\n");
			}
			break;
		}
		
		/* for문의 내용을 줄였는데 기존 코드 261ms, 주석 코드 267ms 메모리는 15MB로 동일이다. 반복문을 수행할때마다 switch비교가 일어나서 느린것 같다.
		 * for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					switch(m) {
					case 1:
					sb.append(i+1+" ");
					break;
					case 2:
						if(i%2==0)sb.append(j+1+" ");
						else sb.append(n-j+" ");
						break;
					case 3:
						sb.append((i+1)*(j+1)+" ");
						break;
					}
				}
				sb.setLength(sb.length()-1);
				sb.append("\n");
			}
		 * */
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
