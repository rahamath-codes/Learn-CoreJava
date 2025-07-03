package Java_MultiThreading;

/*		
A thread in Java is a lightweight unit of execution.
It allows you to run multiple tasks simultaneously within a single program.
Main thread - The default thread that runs when the program starts
*/

class Book extends Thread{
	public void run() {
		for(int i = 0;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Library extends Thread{
	public void run() {
		for(int i = 6;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadingDemo {
	public static void main(String[] args) { //Main thread - default thread
		Book book = new Book(); //Book - thread
		Library lib = new Library(); // Lib - thread
//		Thread thread1 = new Thread(book);
		book.start();
		lib.start();
	}
}
