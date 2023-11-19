class Tollbooth {
	
	int count = 0;
	int payCount = 0;
	int notPayCount = 0;
	int totalTollAmt = 0;
	
	void payingVehicle(Vehicle v)
	{
		payCount++;
		v.amt -= 100;
		totalTollAmt += 100;
		count++;
	}
	
	void notPayVehicle(Vehicle v)
	{
		notPayCount++;
		count++;
	}
	
	void display()
	{
		System.out.println("Total Toll Amount :"+totalTollAmt);
		System.out.println("Total Vehicle Passed :"+count);
		System.out.println("Total Vehicle Paid :"+payCount);
		System.out.println("Total Vehicle Not Paid :"+notPayCount);
	}
}

class Vehicle 
{
	int amt;
	Vehicle(int amt)
	{
		this.amt = amt;
	}
}


class Question2
{
	public static void main (String arg[])
	{
		Tollbooth t = new Tollbooth();
		
		Vehicle v1 = new Vehicle(2000);
		Vehicle v2 = new Vehicle(1000);
		Vehicle v3 = new Vehicle(1500);
		
		t.payingVehicle(v1);
		t.notPayVehicle(v2);
		t.payingVehicle(v1);
		t.payingVehicle(v3);
		t.notPayVehicle(v3);
		
		t.display();
	}
}