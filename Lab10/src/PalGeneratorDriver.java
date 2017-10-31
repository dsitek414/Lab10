public class PalGeneratorDriver
{
	public static void main(String[] args)
	{
		PalindromeGenerator palGen = new PalindromeGenerator();
		
		palGen.generatePalindrome();
		palGen.printPal();
		// the largest paldindromic number as a product of two 4-digit numbers is 99000099
		// it is a product of 9999 and 9901
	}
}