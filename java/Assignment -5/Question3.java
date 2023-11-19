import java.util.LinkedList;

class Question3
{
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Harshal");
		ll.add("Vaibhav");
		ll.add("Prathmesh");
		ll.add("Ayush");
		ll.add("Emad");
		
		
		System.out.println("Linked List of String Elements :");
		System.out.println(ll);
		
		
		System.out.println("\nIterating through LinkedList and printing elements :");
		for(String s:ll)
		{
			System.out.print(s+" ");
		}
		
		
		System.out.println("\n\nInserting 'kunal' at index 2 : ");
		ll.add(2,"Kunal");
		System.out.println(ll);
		
		
		System.out.println("\nRemoving element form index 3 :");
		System.out.println("Removed Element :"+ll.remove(3));
		System.out.println(ll);
		
		
	}
}