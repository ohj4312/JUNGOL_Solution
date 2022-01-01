package DataStructure;

import java.util.Scanner;

public class StackExample {

	static final int MAX_N = 100;

	static int top;
	static int stack[] = new int[MAX_N];

	static void init()
	{
		top = 0;
	}

	static void init(int value)
	{
		top = 0;
		stack[top++]=value;
	}
	
	static boolean isEmpty()
	{
		return (top == 0);
	}

	static boolean isFull()
	{
		return (top == MAX_N);
	}

	static boolean push(int value)
	{
		if (isFull())
		{
			System.out.println("stack overflow!");
			return false;
		}
		stack[top] = value;
		top++;

		return true;
	}

	static Integer stackPop()
	{
		if (top == 0) 
		{
			System.out.println("stack is empty!");
			return null;
		}

		top--;		
		Integer value = new Integer(stack[top]);

		return value;
	}

	public static void main(String arg[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();

			init();
			for (int i = 0; i < N; i++) 
			{
				int value = sc.nextInt();
				push(value);
			}

			System.out.print("#" + test_case + " ");

			while (!isEmpty())
			{
				Integer value = stackPop();
				if (value != null)
				{
					System.out.print(value.intValue() + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

