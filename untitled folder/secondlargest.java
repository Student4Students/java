import java.util.Scanner;

class Question1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		System.out.println("Enter the 10 numbers:");
		for (int i=0;i<10;i++) {
			num[i] = sc.nextInt();
		}
		
		for (int i=0;i<10;i++) {
			for (int j=1;j<10-i;j++) {
				if (num[j-1]>num[j]) {
					int temp = num[j-1];
					num[j-1] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("Second Smallest no. is : "+num[1]);
		System.out.println("Second Largest no. is : "+num[8]);
	}
}
