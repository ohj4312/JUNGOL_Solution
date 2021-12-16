package Beginner_coder.makeFigure1;

import java.util.Scanner;

public class CharSquare2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[][] arr=new char[n][n];
		char start='A';
		
		int j=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) j=0;
			else j=n-1;
			while(j<n&&j>=0) {
				arr[j][i]=start;
				start++;
				if(start>'Z') start='A';
				if(i%2==0) j++;
				else j--;
			}
		}
		
		for(int x=0;x<n;x++) {
			for(int y=0;y<n;y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
	}
}
