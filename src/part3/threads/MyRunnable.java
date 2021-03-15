package part3.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("MyRunnable  run() started -> "+ Thread.currentThread().getName());
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+ " -> "+ Thread.currentThread().getName());
		}
		
		System.out.println("MyRunnable run() ended -> " + Thread.currentThread().getName());
	}

}
