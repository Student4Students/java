package NumberSystem;

public class Binary
{
	public void toDecimal(String r)
	{
		int s = 0;
		for(int i=r.length()-1;i>=0;i--)
		{
			s += Character.getNumericValue(r.charAt(i))*(Math.pow(2,r.length()-1-i));
		}
		System.out.println("Binary to Decimal:\n"+s);
	}
	
	public void toOctal(String r) 
	{
		int s = 0;
		for(int i=r.length()-1;i>=0;i--)
		{
			s += Character.getNumericValue(r.charAt(i))*(Math.pow(2,r.length()-1-i));
		}
		String res = "";
		while(s>0)
		{
			int l = s%8;
			s = s/8;
			res = l+res;
		}
		System.out.println("Binary to Octal:\n"+res);
	}
}