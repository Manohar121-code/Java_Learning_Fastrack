package part3.threads;

public class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(i+ " - "+ Thread.currentThread().getName());
		}
	}
}
