class Employee 
{
	int eno;
	String ename;
	int bsal;
	String desg;
	
	Employee(int eno,String ename,int bsal,String desg)
	{
		this.eno = eno;
		this.ename = ename;
		this.bsal = bsal;
		this.desg = desg;
	}
	
	Employee(Employee e) 
	{
		this.eno = e.eno;
		this.ename = e.ename;
		this.bsal = e.bsal;
		this.desg = e.desg;
	}
	
	void calculate()
	{
		System.out.println("Dearness Allowance(DA) : "+(bsal*0.45));
		System.out.println("House Rent Allowance(HRA) : "+(bsal*0.5));
		System.out.println("Proident Fund(PF) : "+(bsal*0.12));
		System.out.println("Income Tax(IT) : "+(bsal*0.1));
	}
	
	void printInfo()
	{
		System.out.println("\nEmp_no :"+eno);
		System.out.println("Emp_name :"+ename);
		System.out.println("Basic_Salary :"+bsal);
		System.out.println("Designation :"+desg);
	}
	
}


class Question1 {

		public static void main (String arg[])
		{
			Employee e1 = new Employee(1,"Harshal",80000,"Software Developer");
			Employee e2 = new Employee(2,"Ayush",95000,"Project Manager");
			
			e1.printInfo();
			e1.calculate();
			
			e2.printInfo();
			e2.calculate();
			
		}
}