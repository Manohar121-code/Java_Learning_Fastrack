package part3.threads;

public class SleepEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException occurred");
			}
		}
		
		System.out.println("Main ended");
	}
}
