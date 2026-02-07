public class Thread_revision {
    public static void main(String args[]){

        ImplementThread im=new ImplementThread();
        
        Thread t=new Thread(im);
            t.start();
    }

    public static class ImplementThread implements Runnable{
        public void run(){
            print();
        }

        public void print(){
     System.out.println("Hello from Implement Thread thread "+Thread.currentThread().getName());
            
        }
    }
    
}
