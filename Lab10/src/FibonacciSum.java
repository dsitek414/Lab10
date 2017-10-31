public class FibonacciSum
{

	
	public int genFibNumbers(long termNum)
	{
		if (termNum == 0)
			return 0;
		else if (termNum == 1)
			return 1;
		else
			return genFibNumbers(termNum - 1) + genFibNumbers(termNum - 2);
	}
	
}