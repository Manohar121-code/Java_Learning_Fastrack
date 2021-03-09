package part3.threads;

public class UserDefinedThreadEx {
	public static void main(String[] args) {
		System.out.println("Main started - "+ Thread.currentThread().getName());
		MyThread thread1 = new MyThread();
		thread1.setName("thread-1");
		thread1.start();
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i+ " - "+ Thread.currentThread().getName());
		}
		
		System.out.println("Main ended - "+ Thread.currentThread().getName());
	}
}
