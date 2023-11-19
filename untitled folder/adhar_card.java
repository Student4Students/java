import java.util.Scanner;

class InvalidAgeException extends Exception
{
	InvalidAgeException()
	{
		super("Invalid Age Exception!!!");
	}
}

class Question4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter Adhaar Card no. :");
		String an = sc.next();
		
		System.out.print("\nEnter Name :");
		String name = sc.next();
		
		sc.nextLine();
		System.out.println("\nEnter Address :");
		String ad = sc.nextLine();
		
		System.out.print("\nEnter Age :");
		int age = sc.nextInt();
		try
		{
			if(age>=18) 
			{
				System.out.println("\nSuccessful Registration!!!!");
			}
			else 
			{
				throw new InvalidAgeException();
			}
		}
		catch(InvalidAgeException ae)
		{
			ae.printStackTrace();
		}
	}
}