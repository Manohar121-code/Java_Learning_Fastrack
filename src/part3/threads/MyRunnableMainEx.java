package part3.threads;

public class MyRunnableMainEx {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Started -> "+ Thread.currentThread().getName());
		
		MyRunnable myRunnable = new MyRunnable();
		Thread t1 = new Thread(myRunnable, "t1");
		t1.start();
		
		t1.join();
		
		MyRunnable myRunnable2 = new MyRunnable();
		Thread t2 = new Thread(myRunnable2, "t2");
		t2.start();
		t2.setPriority(10);
		
		MyRunnable myRunnable3 = new MyRunnable();
		Thread t3 = new Thread(myRunnable3, "t3");
		t3.start();
		t3.setDaemon(true);
		
		System.out.println("Main ended -> "+ Thread.currentThread().getName());
	}
}
