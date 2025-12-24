package ConcurrencyJavaInterview;

public class Q_01_Process_vs_Thread {
    public static void main(String args[]){
      
    System.out.println("Process ID: "+ProcessHandle.current().pid());    
     System.out.println("Main Thread Name: "+Thread.currentThread().getName());    

     Thread worker= new Thread(()->{
       System.out.println("Worker Thread Name: " + Thread.currentThread().getName());
            System.out.println("Worker is sharing the same Process ID: " + ProcessHandle.current().pid());
     });

        worker.start();
    }
    
}
