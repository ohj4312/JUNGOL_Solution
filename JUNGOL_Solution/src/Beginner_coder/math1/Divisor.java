package Beginner_coder.math1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //21억까지 들어올 수 있다.
		List<Integer> list=new ArrayList<Integer>();
		int sq=(int) Math.sqrt(n);
		
		for(int i=1;i<=sq;i++) {
			if(n%i==0) {
				list.add(i);
				if(n/i!=i) list.add(n/i);
			}
			
		}
		
		Collections.sort(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}
