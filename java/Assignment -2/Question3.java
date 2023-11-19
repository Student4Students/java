class Employee
{	
	String name;
	int bsal;
	Employee(String name,int bsal)
	{
		this.name = name;
		this.bsal = bsal;
	}
	
	void printInfo()
	{
		System.out.println("\nName :"+name);
		System.out.println("Basic Salary :"+bsal);
		System.out.println("Designation : Normal Employee");
	}
}

class Manager extends Employee
{
	double hra = bsal*0.2;
	
	Manager(String name,int bsal)
	{
		super(name,bsal);
	}
	
	void printInfo()
	{
		System.out.println("\nName :"+name);
		System.out.println("Basic Salary :"+bsal);
		System.out.println("Designation : Manager");
		System.out.println("House Rent Allowance(HRA) :"+hra);
	}
}

class HOD extends Employee
{

	double hra = bsal*0.2;
	double cea = bsal*0.1;
	
	HOD(String name,int bsal)
	{
		super(name,bsal);
	}
	
	void printInfo()
	{
		System.out.println("\nName :"+name);
		System.out.println("Basic Salary :"+bsal);
		System.out.println("Designation : HOD");
		System.out.println("House Rent Allowance(HRA) :"+hra);
		System.out.println("Child Education Allowance :"+cea);
	}
}

class Question3
{
	public static void main(String args[]) 
	{
		
		Employee e = new Employee("Harshal",20000);
		Manager m = new Manager("Vaibhav",75000);
		HOD h = new HOD("Kunal",100000);
		
		e.printInfo();
		m.printInfo();
		h.printInfo();
	}
}