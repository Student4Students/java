
class ReverseAlphas implements Runnable
{
	char[] arr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	public void run()
	{
		for(int i=0;i<15;i++)
		{
			System.out.print(arr[arr.length-1-i]+" ");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}

class PrimeNums implements Runnable
{
	public void run()
	{
		int count=0;
		int pn = 2;
		while(count!=15)
		{
			for(int i=2;i<pn;i++)
			{
				if(pn%i==0)
				{
					i=2;
					pn++;
				}
			}
			System.out.print(pn+" ");
			pn++;
			count++;
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}

class FirstAlphas implements Runnable
{
	char[] arr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	public void run()
	{
		for(int i=0;i<15;i++)
		{
			System.out.print(arr[i]+" ");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}

class Question4
{
	public static void main(String args[])
	{
		ReverseAlphas ra = new ReverseAlphas();
		PrimeNums pn = new PrimeNums();
		FirstAlphas fa = new FirstAlphas();
		
		Thread t1 = new Thread(ra);
		Thread t2 = new Thread(pn);
		Thread t3 = new Thread(fa);
		
		t1.start();
		t2.start();
		t3.start();
	}
}