import java.util.Scanner;

class Question3 {
	
	public static int myfunc(int a,int b) {
		if (b==0) {
			return a;
		} else {
			return myfunc(b,a%b);
		}
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		
		int gcd = myfunc(a,b);
		System.out.println("GCD is :"+gcd);
		System.out.println("LCM is :"+(a*b)/gcd);
	}
}