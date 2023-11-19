class FibonacciThread extends Thread {
    
    public void run() {
        int n1 = 0, n2 = 1;
        System.out.print("Fibonacci Series (First 10 terms): ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        System.out.println();
    }
}

class TableThread extends Thread {
   
    public void run() {
        System.out.println("Mathematical Table (Up to 20):");
        for (int i = 1; i <= 20; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }
    }
}

class NameThread extends Thread {
    
    public void run() {
        System.out.println("Displaying my name 15 times:");
        for (int i = 1; i <= 15; i++) {
            System.out.println("Harshal");
        }
    }
}

 class Q3 {
    public static void main(String[] args) {
        FibonacciThread fibonacciThread = new FibonacciThread();
        TableThread tableThread = new TableThread();
        NameThread nameThread = new NameThread();
        fibonacciThread.start();
        tableThread.start();
        nameThread.start();
    }
}