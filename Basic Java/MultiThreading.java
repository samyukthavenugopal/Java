package BasicJava;

// MutiThreading is used to two run two or more threads simultaneously
// pros - it improves the processor speed, efficiency and performance and UI response
// cons - unexpected results, deadlocks may happen and sometimes performance its affected 


class Book extends Thread{ //we need extend thread where ever we want to use it.
	// this class cannot inherit or extend any other class since multiInheritance is not possible.
	// to achieve this we use interface *Runnable*
	public void run() { // there can we any number of methods in this class but to execute the thread we must provide the run() method
		for(int i=1;i<=5;i++) {
			System.out.println(i*5);
			try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();} 
			// delays the execution, prints the statement after 3 seconds
		}
	}
}

class Num implements Runnable{ // Runnable only has run() method so we give the method name as run
	synchronized public void run() { // prints in an synchronized order
		for(int i=1;i<=5;i++) {
			System.out.println(i*10);
			try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();} 
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) { // main is also a thread

	Book b=new Book(); // this object behaves as thread as this class is extended to thread.
//	Num n=new Num();
	// since we are running with a single thread main only if the updateDb methods gets completed the print method is invoked.
	// so here we can use multiThreading which parallelly executes both the method.
	
	Runnable n = new Num();
	Thread t = new Thread(n);
	
	b.start(); // this runs as a separate thread..invoking this method will look for run method within the book class
//	n.start(); // this shows error because theRunnable interface has only run() method.
	// to sort this problem we create an object for Threat class and pass the num object
	
	t.setName("Thread 2"); // setting name for thread
	System.out.println(t.getName());
	t.start();
	 
//	Runnable n = new Runnable() { // we can also give Num class as anonymous class and include lambda to simplify the syntax
//		public void run() {
//			for(int i=0;i<5;i++) {
//				System.out.println(i);
//				try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();} 
//			}
//		}
//	};
	
	if (b.isAlive()) { // to check if the thread is still running or not.
		System.out.println("Running");
	}
	
	try { // prints only after the thread is executed.
		b.join();
		} catch (InterruptedException e) {e.printStackTrace();	}
	
	System.out.println("Program over"); // this statement is executed before the book method is complete because it runs in a separate thread.
	// to overcome this we use join() method to the threaded object.
	
	}

}
