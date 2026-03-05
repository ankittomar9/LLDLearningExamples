Java Backend Interview Questions (4–5 Years Experience)

Sharing some practical Spring Boot / Java backend interview questions that focus more on real-world decision-making rather than just annotations. Helpful for developers preparing for backend interviews or strengthening fundamentals.

1. Why does a Spring Boot app consume more memory over time?

2. How do you detect bean initialization issues in large applications?

3. What happens if @PostConstruct throws an exception?

4. Why does @Value sometimes fail to inject properties?

5. How does Spring Boot decide the order of auto-configurations?

6. What are the risks of enabling too many Actuator endpoints?

7. Why does your app behave differently after scaling pods?

8. How does Spring Boot handle classpath scanning internally?

9. What causes duplicate bean registration in multi-module projects?

10. Why does your API return correct data but response time fluctuates?

11. How do you control thread usage in Spring Boot applications?

12. What happens when application.yml and [**application.properties**]

both exist?

13. Why do custom exception handlers sometimes not trigger?

14. How do you handle large payloads without killing performance?

15. Why does Hibernate generate unexpected queries?

16. How do you debug a deadlock in Spring?

17. What happens if a BeanFactoryPostProcessor fails?

18. How do you avoid startup failure due to missing configs?

19. Why does Spring Boot retry DB connections on startup?

20. How do you manage feature toggles safely?

21. Why does @Cacheable sometimes not cache?

22. How does Spring Boot isolate environment-specific configs?

23. What causes classloader issues in fat JARs?

24. How do you safely reload configs without restarting?

25. Why does logging behave differently in prod vs local?

26. How do you handle partial failures in dependent services?

27. What is the real impact of using too many interceptors?

28. How do you prevent breaking changes during deployments?

29. Why does @ConfigurationProperties fail silently?

30. What Spring Boot decision has caused you a real production issue?

Accenture Interview Experience Role - Senior Software Engineer

Java / Spring / Hibernate / SQL - Interview Questions List

1. What is a Maven build?

2. What does mvn clean install do?

How do you push code to production ?

3. What is code coverage?

4. What is line coverage?

5. How do you improve code coverage when the build fails?

6. How do you verify a method is called twice in Mockito?

7. In which situations do you use PowerMock?

8. What is the difference between final keyword and final variable?

9. What is Garbage Collection in Java?

10. How do you ensure Garbage Collection is working correctly?

11. How do you debug and fix OutOfMemoryError in Java applications?

12. What are atomic variables in Java?

13. What is the volatile keyword?

14. What is the difference between volatile and synchronized?

15. How do you avoid performance issues caused by synchronization?

16. What is a BlockingQueue?

17. Where do you use BlockingQueue in real applications?

18. What is the difference between HashMap and Hashtable?

19. Why does Hashtable not allow null keys or values?

20. What is load factor in HashMap?

21. What does the default load factor 0.75 mean?

22. What is the difference between UNION and UNION ALL?

23. What is the difference between LEFT JOIN and RIGHT JOIN?

24. When do you use LEFT JOIN?

25. How do you find records in one table that do not have a relationship with another table?

26. How do you handle NULL values and conditional mapping in SQL?

27. How do you map values like A → Apple, B →Banana in SQL?

28. How do you define relationships between tables in Hibernate?

How do you remove duplicates in SQL?

29. What are the types of relationships in

Hibernate?

30. What is the difference between constructor injection and setter injection?

31. What happens if you don't use @Autowired in Spring?

32. How do you perform constructor injection without @Autowired?

33. What changes did you make when migrating from Java 7 to Java 8?

34. What are different ways to ensure thread safety in Java?

36. What is ThreadLocal and where is it used?

37. How do you find the longest substring without repeating characters in Java?

These are REAL Spring Boot interview questions
that test production ownership, not tutorial knowledge:

1. Why does a Spring Boot app start successfully but fail after a few minutes?
2. How can a misconfigured thread pool bring down an entire service?
3. Why do APIs return 5xx errors only under load?
4. What happens when multiple configurations conflict at startup?
5. How can a small change in properties cause a major outage?
6. Why does scaling instances sometimes increase response time?
7. How do you detect blocking calls in a Spring Boot application?
8. Why do scheduled jobs affect API latency?
9. How does improper bean initialization cause runtime failures?
10. Why do applications crash without clear stack traces?
11. How do you handle partial failures inside a request flow?
12. Why do retries amplify failures instead of solving them?
13. How do you ensure graceful shutdown without data loss?
14. What causes silent database connection exhaustion?
15. Why does caching improve performance initially but degrade later?
16. How do you debug issues that appear only in production?
17. What happens when async tasks overwhelm the system?
18. Why do apps behave differently in Docker vs local?
19. How do configuration changes break running services?
20. What Spring Boot decision once caused a serious production issue?