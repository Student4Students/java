import java.util.TreeSet;

class Question2
{
	public static void main(String args[])
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Harshal");
		ts.add("Vaibhav");
		ts.add("Emad");
		ts.add("Prathmesh");
		ts.add("Kunal");
		
		
		System.out.println("TreeSet of String elements :");
		System.out.println(ts);
		
		
		System.out.println("\nTraversing through TreeSet and printing elements :");
		for(String s:ts)
		{
			System.out.print(s+", ");
		}
		
		
		System.out.println("\n\nInserting following elements in TreeSet :-");
		System.out.println("Harshal, Ayush, Dnyneshwar, Kalpesh, Yogesh");
		ts.add("Harshal");
		ts.add("Ayush");
		ts.add("Dnyneshwar");
		ts.add("Kalpesh");
		ts.add("Yogesh");
		System.out.println("Final TreeSet : "+ts);
		
		
		System.out.println("\nRemoving the specific element from TreeSet :");
		System.out.println("Removed Element : Kalpesh");
		ts.remove("Kalpesh");
		System.out.println("Final TreeSet : "+ts);
	}
}