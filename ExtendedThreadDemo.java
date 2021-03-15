// Create a second thread by extending Thread
class ThreadExt extends Thread {
  ThreadExt() {
    // Create a new, second thread
    super("Thread Extended");
    System.out.println("Child thread: " + this);
    
}
  // This is the entry point for the second thread.
  public void run() {
    try {
      for(int i = 111; i > 100; --i) {
        System.out.println("Child Thread: " + i);
        Thread.sleep(500);
      }
    } catch (InterruptedException e) {
      System.out.println("Child interrupted.");
}
    System.out.println("Exiting child thread.");
  }
}
class ExtendedThreadDemo {
  public static void main(String args[]) {
    ThreadExt thread3 = new ThreadExt(); // create a new thread
    ThreadExt thread4 = new ThreadExt();


    //thread3.run();
    thread3.start();  

    thread4.start();

    try {
      for(int i = 0; i < 5; ++i) {
        System.out.println("Main Thread: " + i);
        Thread.sleep(500);
      }
    } catch (InterruptedException e) {
      System.out.println("Main thread interrupted.");
      }
    System.out.println("Main thread exiting.");


  }

}

