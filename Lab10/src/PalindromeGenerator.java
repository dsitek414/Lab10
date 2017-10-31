public class PalindromeGenerator
{
	private int largePal = 0;
	private int oneMultiple = 0;
	private int twoMultiple = 0;
	private boolean status = true;
	
	public void generatePalindrome()
	{
		for (int i = 1000; i < 10000; i++)
		{
			for (int j = 1000; j < 10000; j++)
			{
				if(this.checkIfPalindrome(String.valueOf(i * j)))
				{
					largePal = i * j;
					oneMultiple = i;
					twoMultiple = j;
				}
			}
		}
	}
	
	public boolean checkIfPalindrome(String possPal)
	{
		if(possPal.length() == 2 && possPal.charAt(possPal.length()-1) == possPal.charAt(0))
			status = true;
		else if(possPal.length() == 1)
			status = true;
		else if(possPal.charAt(possPal.length()-1) == possPal.charAt(0) && possPal.length() != (1 | 2))
		{
			possPal = possPal.substring(1, possPal.length()-1);
			this.checkIfPalindrome(possPal);
		}
		else if(possPal.charAt(possPal.length()-1) != possPal.charAt(0))
			status = false;
		return status;
	}
	
	public void printPal()
	{
		System.out.println("The lergest palindrome, " + largePal + ", is a product of " + oneMultiple + " and " + twoMultiple);
	}
}