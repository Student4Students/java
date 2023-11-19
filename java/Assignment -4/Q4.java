public class Q4{
public static void main(String[] args) {
Thread task1Thread = new Thread(new LastAlphabetsTask());
Thread task2Thread = new Thread(new PrimeNumbersTask());
Thread task3Thread = new Thread(new FirstAlphabetsTask());
try {
task1Thread.start();
task1Thread.join();
task2Thread.start();
task2Thread.join();
task3Thread.start();
task3Thread.join();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
class LastAlphabetsTask implements Runnable {
@Override
public void run() {
for (char c = 'Z'; c >= 'O'; c--) {
System.out.print(c + " ");
}
System.out.println();
}
}
class PrimeNumbersTask implements Runnable {
@Override
public void run() {
int count = 0;
int num = 2;
while (count < 10) {
boolean isPrime = true;
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0) {
isPrime = false;
break;
}
}
if (isPrime) {
System.out.print(num + " ");
count++;
}
num++;
}
System.out.println();
}
}
class FirstAlphabetsTask implements Runnable {
@Override
public void run() {
for (char c = 'A'; c <= 'O'; c++) {
System.out.print(c + " ");
}
System.out.println();
}
}