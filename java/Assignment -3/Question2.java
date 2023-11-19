import java.util.Arrays;

interface SearchInteger
{
	void linearSearch();
	void binarySearch();
}

class NumberSearch implements SearchInteger
{
	int[] arr;
	int a;
	NumberSearch(int[] arr,int a)
	{
		this.arr = arr;
		this.a = a;
	}
	
	public void linearSearch()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==a)
			{
				System.out.println("\nInside Linear Search");
				System.out.println("Found "+a+" at "+(i+1)+" position.");
				break;
			}
			if (i==arr.length-1 && arr[i]!=a) 
			{
				System.out.println("\nInside Linear Search");
				System.out.println("No data found!!");
			}
		}
	}
	
	public void binarySearch()
	{
		Arrays.sort(arr);
		int l = 0;
		int r = arr.length-1;
		int n = (l+r)/2;
		
		while(l<=r)
		{
			
			if(arr[n]==a)
			{
				System.out.println("\nInside Binary search");
				System.out.print("Found "+a+" at "+(n+1)+" position.");
				break;
			}
			else if(arr[n]>a)
			{
					r = n - 1;
			}
			else	 
			{
				l = n + 1;
			}
		}
		
	}
}

class Question2
{
	public static void main(String args[])
	{
		
		int[] arr = {8,4,2,5,7};
		
		NumberSearch ns = new NumberSearch(arr,5);
		
		ns.linearSearch();
		ns.binarySearch();
	}
}