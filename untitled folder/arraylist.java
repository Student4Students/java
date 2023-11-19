import java.util.ArrayList;

class Question1
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		
		for(int i=0;i<=5;i++)
		{
			al.add(i);
		}
		
		System.out.println("ArrayList of Integer Numbers :");
		System.out.println(al);
		
		
		al.add(2,48);
		System.out.println("\nAdded the element 48 at index 2 :");
		System.out.println(al);
		
		//Removed the element from index 4
		int r = al.remove(4);
		System.out.println("\nRemoved the element from index 4 :");
		System.out.println("Removed element : "+r);
		System.out.println(al);
		
		
		ArrayList<Integer> rev = new ArrayList<Integer>();
		for(int i=al.size()-1;i>=0;i--)
		{
			rev.add(al.get(i));
		}
		al.clear();
		al.addAll(rev);
		System.out.println("\nReversed the elements in ArrayList :");
		System.out.println(al);
		
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=0;j<al.size()-i-1;j++)
			{
				if(al.get(j)>al.get(j+1))
				{
					int t = al.get(j);
					al.set(j,al.get(j+1));
					al.set(j+1,t);
				}
			}
		}
		System.out.println("\nSorted the elements in ArrayList");
		System.out.println(al);
		
	}
}