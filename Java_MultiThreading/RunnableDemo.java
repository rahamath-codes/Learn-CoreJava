package Java_MultiThreading;
/*Runnable is a functional interface in Java (part of java.lang package) used to create threads.
It defines a single method: 
public interface Runnable {
    void run();
}
*/
//1. Create a class that implements Runnable
class MyTask implements Runnable {
 // 2. Override the run() method — this is the thread logic
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Child Thread: " + i);
         try {
             Thread.sleep(3000); // pause for 500 ms
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted");
         }
     }
 }
}

public class RunnableDemo {
 public static void main(String[] args) {
     // 3. Create the Runnable object
     MyTask task = new MyTask();

     // 4. Wrap it inside a Thread object
     Thread t = new Thread(task);

     // 5. Start the thread (calls run() internally)
     t.start();

     // 6. Main thread runs separately
     for (int i = 1; i <= 5; i++) {
         System.out.println("Main Thread: " + i);
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             System.out.println("Main thread interrupted");
         }
     }
 	}
}
/*
| Term         | Meaning                                                       |
| ------------ | ------------------------------------------------------------- |
| `Runnable`   | Interface that defines `run()` for task logic                 |
| `Thread`     | Class used to execute the `Runnable` in a new thread          |
| `start()`    | Starts a new thread and invokes `run()` in parallel           |
| `sleep(ms)`  | Puts the thread to sleep for a specified time                 |
| `Concurrent` | Threads execute at the same time (but not in any fixed order) |
 */

