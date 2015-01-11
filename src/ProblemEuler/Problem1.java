package ProblemEuler;

public class Problem1 {
	
	public static int Solve()
	{
		int sum = 0;
		for (int i = 0; i < 1000; i++)
		{
			if (i % 5 == 0 || i % 3 == 0)
			{
				sum += i;
			}
		}
		return sum;
	}
	
	public static int OptimalSolve()
	{
		return SumDivisibleBy(1000, 3) + SumDivisibleBy(1000, 5) - SumDivisibleBy(1000, 15) - 1000;
	}
	
	private static int SumDivisibleBy(int target, int n)
	{
		int d = target / n;
		return n * (d * (d + 1)) / 2;
	}

}
