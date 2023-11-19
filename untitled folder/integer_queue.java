interface IntegerQueue 
{
	void insert(int n);
	int remove();
}

class Queue implements IntegerQueue
{
	String arr = "";
	
	public void insert(int n) 
	{
		arr = n + arr;
	}
	
	public int remove()
	{	
		int res = Character.getNumericValue(arr.charAt(arr.length()-1));
		arr = arr.substring(0,arr.length()-1);
		return res;
	}
	
	void display()
	{
		System.out.println(arr);
	}
}

class Question1
{
	public static void main (String args[])
	{
		
		Queue q = new Queue();
		
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.display();
		
		int a = q.remove();
		
		System.out.println("Removed Element:"+a);
		q.display();
		
	}
}