package ProblemEuler;

public class Problem2 {
	public static int Solve()
	{
		int first = 1;
		int second = 2;
		int sum = 2;
		int next = 0;
		while (next < 4000000)
		{
			next = first + second;
			if (next % 2 == 0)
			{
				sum += next;
			}
			first = second;
			second = next;
		}
		return sum;
	}
	
	public static int OptimalSolve1()
	{
		int a = 1;
		int b = 1;
		int c = a + b;
		int sum = 0;
		while (c < 4000000)
		{
			sum += c;
			a = c + b;
			b = a + c;
			c = b + a;
		}
		return sum;
	}
	
	public static int OptimalSolve2()
	{
		int a = 0;
		int b = 2;
		int c = 4*b + a;
		int sum = b;
		while (c < 4000000)
		{
			sum += c;
			a = b;
			b = c;
			c = 4 * b + a;
		}
		return sum;
	}

}
