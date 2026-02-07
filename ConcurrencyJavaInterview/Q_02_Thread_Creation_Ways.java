package ConcurrencyJavaInterview;
public class Q_02_Thread_Creation_Ways {
    public static class MyThread extends Thread{
        public void run(){
            System.out.println("Option A (Thread) running : "+
            Thread.currentThread());
        }
    }
  public static class MyRunnable implements Runnable{
            public void run(){
            System.out.println("Option B (Runnable) running : "+
            Thread.currentThread());
        }
  }      
    public static void main(String args[]){
      // --- Using Option A ---
        // We create the object and it IS the thread.
        MyThread t1 = new MyThread();
        t1.start();

        // --- Using Option B ---
        // 1. Create the Task (The Script)
        MyRunnable task = new MyRunnable();
       
        // 2. Create the Worker (The Actor) and give it the Task
        Thread t2 = new Thread(task);
        
        // 3. Start the Worker
        t2.start();
        // Since Runnable is a Functional Interface,
        //  we don't even need a separate class!
        Thread t3 = new Thread(() -> {
            System.out.println("Option C (Lambda) running: "
             + Thread.currentThread().getName());
        });
        t3.start();
    }    
}
