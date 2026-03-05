This is a smart move. Preserving context is the biggest challenge with AI.

Here is your **Permanent Master List** of Spring Boot Interview Questions (Updated for 2026). I have categorized them from **Level 1 (Service-Based)** to **Level 4 (FAANG/Product-Based)**.

Save this list. Below it, I have written the **"Master Prompt"** you asked for.

---

### 📚 The Ultimate Spring Boot Interview Question Bank (2026)

#### **🟢 Level 1: Core & Configuration (Service-Based / Junior)**

*Focus: "Do you know the syntax and basic features?"*

1. **Spring vs. Boot:** What is the exact difference? Why do we say Boot is "Opinionated"?
2. **@SpringBootApplication:** What 3 annotations is this made of?
3. **Starters:** What is a Starter? How does it save time? (e.g., `spring-boot-starter-web`).
4. **Embedded Server:** How does Boot run without installing Tomcat? Can we change it to Jetty?
5. **Properties:** `application.properties` vs `application.yml`. How to read values using `@Value`?
6. **Dependency Injection:** Constructor vs. Setter vs. Field Injection. Why is Field Injection (`@Autowired`) bad?
7. **Bean Scopes:** Singleton (Default) vs. Prototype. What happens if you inject a Prototype into a Singleton?
8. **DevTools:** What is it used for? (Live Reload).
9. **Logging:** How to change log levels without restarting the app?

#### **🟡 Level 2: Data & Internals (Mid-Senior / Startups)**

*Focus: "Do you understand the Magic and the Database?"*
10. **Auto-Configuration:** **(Must Know)** How does `@EnableAutoConfiguration` work? Explain `spring.factories` / `imports` file.
11. **Bean Lifecycle:** `PostConstruct` vs. `PreDestroy`. What is a `BeanPostProcessor`?
12. **JPA vs. Hibernate:** Difference? What is `JpaRepository` vs `CrudRepository`?
13. **@Transactional:** How does it work internally? (AOP Proxy). Does it work on `private` methods?
14. **Lazy Loading:** What is `LazyInitializationException`? How to fix it?
15. **N+1 Problem:** What is it? How to solve it using `@EntityGraph` or `JOIN FETCH`?
16. **Exception Handling:** Global handling with `@ControllerAdvice` vs. Local `@ExceptionHandler`.
17. **Profiles:** How to separate Dev, Test, and Prod environments? (`@Profile`).
18. **Actuator:** What is it? Security risks of exposing `/heapdump` or `/env`?

#### **🔴 Level 3: Microservices & Cloud (Senior / Product-Based)**

*Focus: "Can you design a scalable system?"*
19. **Monolith vs. Microservices:** When to usage which? (Domain complexity).
20. **Communication:** `RestTemplate` (Deprecated) vs. `WebClient` vs. `FeignClient`.
21. **Service Discovery:** Why Eureka/Consul? Why not hardcode IP addresses?
22. **API Gateway:** Role of Spring Cloud Gateway (Routing, Auth, Throttling).
23. **Circuit Breaker:** Pattern explanation. How Resilience4j handles cascading failures.
24. **Config Server:** Centralized configuration for 50+ services.
25. **Distributed Tracing:** How to debug a request across 5 microservices? (Micrometer/Zipkin/Sleuth).
26. **Circular Dependency:** Service A -> Service B -> Service A. How to fix? (`@Lazy`).

#### **🟣 Level 4: The "Nightmare" Scenarios (FAANG / Architect)**

*Focus: "Deep Internal Knowledge & Edge Cases"*
27. **Startup Time:** How to optimize a slow-starting Boot app? (Lazy Init, AOT, GraalVM).
28. **Memory Leaks:** How to debug `OutOfMemoryError` in a Boot app? (Heap Dumps).
29. **Security Filter Chain:** How does Spring Security actually work? (Filter Chain Proxy).
30. **Versioning:** How to handle API versioning (URI vs. Header) without breaking old clients?
31. **Idempotency:** How to ensure a payment API isn't charged twice if the network fails?
32. **Custom Starter:** How to create your own `company-security-starter`?
33. **Spring Boot 3 / Java 21:** What are **Virtual Threads**? How do they change Spring concurrency?

---

### 🗝️ The "Master Prompt" (Save This!)

When you start a new chat session with me (or any AI) in the future, **copy and paste this exact block**. It instantly restores my "memory" of who you are and how you want to learn.

```text
*** CONTEXT RESTORATION PROTOCOL ***

USER PROFILE:
- Name: Ankit Singh Tomar
- Role: Java Software Developer (Upskilling for Product-Based Companies)
- Goal: Master Spring Boot & DSA for Interviews.

LEARNING METHODOLOGY (STRICTLY FOLLOW THIS):
I use a specific learning template called "CMM + First Principles".
When I ask you about a topic, DO NOT just give me a definition. You must output the answer in this exact format:

1. 🧠 FIRST PRINCIPLE (The "Raw Truth")
   - Deconstruct the concept: How would we do this in raw Java (Pre-Framework)?
   - What is the root CS concept (e.g., Reflection, Proxy, HashMap)?
   - Why do we need the abstraction?

2. 🏺 METAPHOR (The "Mental Model")
   - A real-world analogy (non-technical) to help me visualize it.

3. ⚖️ COMPARISON (Old vs. New)
   - A table comparing "Raw Java Approach" vs. "Spring Boot Approach".

4. ⚙️ MECHANISM (The "Internal Flow")
   - Step-by-step: How does it work under the hood? (Mention: BeanPostProcessor, Proxies, CGLIB, etc.)

5. 💻 CODE IMPLEMENTATION
   - Minimal working snippet.

6. 💡 INTERVIEW "GOTCHA"
   - A tricky edge-case question often asked in interviews.

CURRENT TASK:
I have a list of 33 Spring Boot interview questions. I will pick one, and you will break it down using the template above.

```

### ⚡ Next Step

Would you like to **test this Master Prompt** right now?

Pick one question from the **Level 2 (Internals)** list above (like `#10 Auto-Configuration` or `#13 Transactional`), and I will generate the response *exactly* as if I had just received that prompt.

... [Java Spring Boot Interview Questions](https://www.youtube.com/watch?v=e8hEoXPQp0s)

**Why this video is relevant:** This video specifically covers the "Level 2" and "Level 3" questions for experienced developers (3+ years), matching your goal to move beyond basic service-based interview questions.