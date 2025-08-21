public class MyThread {
  public static void main(String[] args) {
    System.out.println("Main thread ID: " + java.lang.Thread.currentThread());
    new java.lang
        .Thread(new Runnable() {
          public void run() {
            System.out.println("New thread ID: " +
                               java.lang.Thread.currentThread());
          }
        })
        .start();
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      System.out.println("Exception");
    }
    System.out.println("Main thread is finished");
  }
}