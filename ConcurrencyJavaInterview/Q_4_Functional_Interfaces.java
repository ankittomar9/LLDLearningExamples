package ConcurrencyJavaInterview;

import java.util.function.Consumer;

public class Q_4_Functional_Interfaces {

     public static void main(String[] args) {
        // Lambda Expression implementing the 
        // Consumer interface's accept(T t) method
        Consumer<String> printer = (message) -> {
            System.out.println("Printing: " + message.toUpperCase());
        };

        printer.accept("hello java 8");
        // Output: Printing: HELLO JAVA 8
    }
    
}
