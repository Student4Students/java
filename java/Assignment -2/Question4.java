class Publication
{
	String title;
	int price;
	
	void putTitle(String title)
	{
		this.title = title;
	}
	
	String getTitle()
	{
		return title;
	}
	
	void putPrice(int price)
	{
		this.price = price;
	}
	
	int getPrice()
	{
		return price;
	}
}

class Book extends Publication
{
	int pgCnt;
	
	void putPageCount(int pgCnt)
	{
		this.pgCnt = pgCnt;
	}
	
	int getPageCount()
	{
		return pgCnt;
	}
}

class Tape extends Publication
{
	float pt;
	
	void putPlayTime(float pt)
	{
		this.pt = pt;
	}
	
	float getPlayTime()
	{
		return pt;
	}
}

class Question4
{
	public static void main (String arg[])
	{
		Book b = new Book();
		Tape t = new Tape();
		
		b.putTitle("Programming with Java");
		b.putPrice(200);
		b.putPageCount(1000);
		
		t.putTitle("The complete reference");
		t.putPrice(450);
		t.putPlayTime(234);
		
		System.out.println("\nTitle :"+b.getTitle());
		System.out.println("Price :"+b.getPrice());
		System.out.println("Page Count :"+b.getPageCount());
		
		System.out.println("\nTitle :"+t.getTitle());
		System.out.println("Price :"+t.getPrice());
		System.out.println("PlayTime (min) :"+t.getPlayTime());
		
	}
}