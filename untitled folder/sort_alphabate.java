import java.util.Scanner;

class Question2 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many strings you want to enter: ");
		int n = sc.nextInt();
		int l = 0;
		
		String[] arr = new String[n]; 
		System.out.println("\nStart Entering:");
		for (int i=0;i<n;i++) {
			arr[i] = sc.next();
		}
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (arr[j-1].compareTo(arr[j])>0) {
					String temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("\nSorted List\n");
		for (int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
