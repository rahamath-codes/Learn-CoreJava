package Java_MultiThreading;
/*
The synchronized keyword in Java is used to control access to critical sections of code when multiple threads are involved.
It ensures that only one thread at a time can access the synchronized block or method 
— preventing race conditions and data inconsistency.

Why we use Synchronized?
	When multiple threads access shared data, they can cause unexpected behavior if not controlled.
	synchronized helps in ensuring thread safety.
*/

class Table{
	public synchronized void prinTable(int n) { //Once a thread execution is fully completed then only it allows next thread
		for(int i = 1 ; i <= 5; i++) {
			System.out.println(i*n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SynchronizedDemo {
	 public static void main(String[] args) throws InterruptedException {
	       
		 	Table t = new Table();
		 	
	        Thread t1 = new Thread() {
	        	public void run() {
	        		t.prinTable(4);
	        	}
	        };

	        Thread t2 = new Thread() {
	        	public void run() {
	        		t.prinTable(9);
	        	}
	        };

	        t1.start();
	        t2.start();
	    }
}

/*
| Feature         | Description                                      |
| --------------- | ------------------------------------------------ |
| `synchronized`  | Prevents simultaneous access by multiple threads |
| Use with method | Locks the entire method                          |
| Use with block  | Locks only critical section                      |
| Lock object     | Every object has an internal lock (monitor)      |
| Problem solved  | Race conditions, inconsistent data               |
*/