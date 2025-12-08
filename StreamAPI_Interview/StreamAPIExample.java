package StreamAPI_Interview;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String args[]){

        List<String> words=Arrays.asList("Hello","world","java","stream","api");
        
            List<String> processedWords=words.stream()
            .filter(word->!word.equals("stream"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());
            
        System.out.println("Original List: " + words);
        System.out.println("Processed List: " + processedWords);
    }
    
}


/*
The Java 8 Stream API provides a powerful, functional approach to processing sequences of elements.
 It allows you to express complex data processing logic in a concise, readable, and often highly performant way.

 Source	The starting point of the stream.	list.stream(), Arrays.stream(array), Stream.of(...)

 Intermediate Operations	
 Operations that transform a stream into another stream. 
 You can chain multiple intermediate operations.	filter(), map(), sorted(), distinct(), limit()

 Terminal Operation	The operation that starts the processing, produces a final result (or a side-effect), and consumes the stream.	collect(), forEach(), count(), reduce(), anyMatch()

 Key Concepts
A. Lazy Evaluation
Intermediate operations are lazy. They are not executed immediately when called. They only build the pipeline description. 
The actual data processing (the iteration over the source) only happens when the terminal operation is invoked. This allows Java to perform optimizations.

B. Internal Iteration
Streams handle the iteration over the elements internally, unlike Collections, which require external iteration (e.g., using a for loop or an Iterator). 
This internal management is key to enabling parallel processing.

C. Possibility of Parallelism
You can easily convert a sequential stream to a parallel stream using parallelStream() (on a Collection) or parallel() (on a stream). 
This allows the Java runtime to process large datasets concurrently across multiple CPU cores with minimal code change.

D. Functional Interfaces
Stream operations rely heavily on functional interfaces (like Predicate, Function, Consumer) and lambda expressions (or method references), 
which are the other major components of Java 8. For example:
filter() accepts a Predicate.
map() accepts a Function.


 */