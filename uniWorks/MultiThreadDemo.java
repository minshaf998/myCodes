// Create multiple threads.
class NewThread4 implements Runnable {
  String name; // name of thread
  Thread t;

    public NewThread4(String threadName) {
        name = threadName;
        t = new Thread(this, name); 
        System.out.println("New thread3: " + t); 
        t.start(); // Start the thread
    }
        // This is the entry point for thread. 
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000); 
            }
        } 
        catch (InterruptedException e) { 
            System.out.println(name + "Interrupted");
        }

        System.out.println(name + " exiting.");
    }
}


class MultiThreadDemo {
    public static void main(String args[]) {
        new NewThread4("One"); // start threads
        new NewThread4("Two");
        new NewThread4("Three");
        try {
        // wait for other threads to end 
             Thread.sleep(1); //put in sleep for 7 seconds
            } 
        catch (InterruptedException e) { 
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting."); 
    }
}
