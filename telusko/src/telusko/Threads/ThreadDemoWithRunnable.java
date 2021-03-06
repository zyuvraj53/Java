package telusko.Threads;

public class ThreadDemoWithRunnable {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hey");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
				}
			}
		}, "Hi Thread");
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Ciao");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
				}
			}
		}, "Hello Thread");
		
		System.out.println("The name of the thread is "+ t1.getName()); 
		System.out.println("The name of the other thread is "+ t2.getName()); 
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority()); 
		System.out.println(t2.getPriority()); 

		t1.start();
		try {Thread.sleep(10);} catch (Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive()); 
		
		System.out.println("Bye"); 
		
	}
}