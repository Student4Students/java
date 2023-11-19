import NumberSystem.Decimal;
import NumberSystem.Binary;

class Question3 
{
	public static void main (String arg[])
	{
		
		Decimal d = new Decimal();
		Binary b = new Binary();
		
		d.toBinary(37);
		d.toOctal(37);
		
		b.toDecimal("100101");
		b.toOctal("101110");
	}
}
