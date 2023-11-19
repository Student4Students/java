
class Fibonacci extends Thread
{
	public void run()
	{
		int a = 0;
		int b = 1;
		for(int i=1;i<=10;i++)
		{
			if(i==1)
			{
				System.out.print(0+" ");
			}
			else if(i==2)
			{
				System.out.print(1+" ");
			}
			else
			{
				int temp = a + b;
				a = b;
				b = temp;
				System.out.print(temp+" ");
			}
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


class Table extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("2 x "+i+" = "+i*2);
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

class Display extends Thread
{
	public void run()
	{
		for(int i=1;i<=15;i++)
		{
			System.out.println("Harshal");
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

class Question3
{
	public static void main(String args[])
	{
		Fibonacci fb = new Fibonacci();
		Table tb = new Table();
		Display dp = new Display();
		
		fb.start();
		tb.start();
		dp.start();
	}
}