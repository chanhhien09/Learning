package ProblemEuler;

import java.lang.Math;

public class Problem3 {
	public static long Solve()
	{
		long target = 600851475143l;
		if (isPrime(target))
			return target;
		
		long sqrtTarget = (long) Math.sqrt(target);
		long max = 0;
		
		for (long i = 1; i <= sqrtTarget; i++)
		{
			if (target % i == 0)
			{
				long result = (isPrime(target / i) ? (target / i) : 
						(isPrime(i) ? i : 0));
				
				if (result > max)
					max = result;
			}
				
		}
		return max;
	}
	
	public static long OptimalSolve()
	{
		long target = 600851475143l;
		long lastFactor = 0;
		
		if (target % 2 == 0)
		{
			lastFactor = 2;
			target = target / 2;
			while (target % 2 == 0)
				target = target / 2;
		}
		else
		{
			lastFactor = 1;
		}
		
		long factor = 3;
		long maxFactor = (long) Math.sqrt(target);
		
		while (target > 1 && factor < maxFactor)
		{
			if (target % factor == 0)
			{
				lastFactor = factor;
				target = target / factor;
				while (target % factor == 0)
					target = target / factor;
				maxFactor = (long) Math.sqrt(target);
			}
			factor += 2;
		}
		if (target == 1)
			return lastFactor;
		else
			return target;
		
	}
	
	private static boolean isPrime(long n)
	{
		if (n % 2 == 0 && n != 2)
			return false;
		
		int sqrtn = (int) Math.sqrt(n);
		
		for (int i = 3; i <= sqrtn; i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
