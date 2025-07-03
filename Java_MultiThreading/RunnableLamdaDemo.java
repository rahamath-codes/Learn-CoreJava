package Java_MultiThreading;

public class RunnableLamdaDemo {
	public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Lambda Thread: " + i);
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        };
        Thread t = new Thread(task);
        t.start();
    }
}
