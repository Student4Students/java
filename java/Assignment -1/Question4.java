import java.util.Scanner;

class Question4 {
	
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String w = sc.next();
		w = w.toLowerCase();
		
		int[] arr = new int[256];
		int l;
		
		for(int i=0;i<w.length();i++) {
			l = (int) w.charAt(i);
			for (int j=0;j<256;j++) {
				if (l==j) {
					arr[j] += 1;
				}
			}
		}
		
		for (int i=0;i<256;i++) {
			if (arr[i]!=0) {
				char t = (char) i;
				System.out.println("Occuerence of "+t+" is :"+arr[i]);
			}
		}
	}
}