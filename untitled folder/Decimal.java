package NumberSystem;

public class Decimal
{
	public void toBinary(int n)
	{
		String res = "";
		while(n>0)
		{
			int l = n%2;
			n = n/2;
			res = l + res;
		}
		System.out.println("Decimal to Binary:\n"+res);
	}
	
	public void toOctal(int n)
	{
		String res = "";
		while(n>0)
		{
			int l = n%8;
			n = n/8;
			res = l+res;
		}
		System.out.println("Decimal to Octal:\n"+res);
	}
}