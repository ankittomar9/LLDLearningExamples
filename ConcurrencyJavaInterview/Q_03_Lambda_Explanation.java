package ConcurrencyJavaInterview;

public class Q_03_Lambda_Explanation {
    public static void main(String args[]){

        Thread oldWay=new Thread(new Runnable() {
            @Override
            public void run(){
              System.out.println(" Old Way: I had to type a lot of code.");
            }
        });

       Thread newWay = new Thread(() -> {
            System.out.println(" Lambda Way: Short and sweet.");
        });

        oldWay.start();
        newWay.start();

    }
    
}
