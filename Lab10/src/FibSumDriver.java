public class FibSumDriver
{
	
	
	public static void main(String[] args)
	{
		long currNum = 0, oddSum = 0; 
		int termCount = 0;
		FibonacciSum fibSum = new FibonacciSum();
		
		while (currNum < 2000000000 && currNum >= 0)
		{
			currNum =  fibSum.genFibNumbers(termCount);
			++termCount;
			if (currNum % 2 != 0 && currNum >= 0)
			{
				oddSum += currNum;
			}
		}
		
		System.out.println("The sum of all odd Fibonacci terms less than 2 billion is " + oddSum);
		// The sum of all odd Fibonacci terms less than 2 billion is 3321919439
	}
}