package telusko.Threads;

public class ThreadDemoWithRunnableShort {

  public static void main(String[] args) {
		
    Thread t1 = new Thread(()->{for(int i=0; i<5; i++) {System.out.println("Hey");try{Thread.sleep(500);}catch(InterruptedException e){}}});
	Thread t2 = new Thread(()->{for(int i=0; i<5; i++){System.out.println("Ciao");try{Thread.sleep(500);}catch(InterruptedException e){}}});
		
	t1.start();
	try {Thread.sleep(10);} catch(Exception e) {}
	t2.start();
  }}