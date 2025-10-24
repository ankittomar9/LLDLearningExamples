# Java Interview Guide

Concise interview topics and short answers / pointers grouped by area.

## Table of Contents
- Core Java
- Spring & Spring Boot
- JPA / Hibernate
- Microservices & Architecture
- Cloud & DevOps Basics (Optum Focus)
- SQL / Database Knowledge
- DSA & Coding (Optum Special Focus)

---

## Core Java (OOPs, Collections, Concurrency Basics)

- Explain difference between HashMap, LinkedHashMap and TreeMap.  
  HashMap: unordered, O(1) average get/put; LinkedHashMap: preserves insertion/access order; TreeMap: sorted by keys, O(log n).

- How do you handle thread safety in Java Collections? (Collections.synchronizedXXX vs Concurrent Collections)  
  Collections.synchronizedXxx wraps with a single lock — good for simple cases. ConcurrentHashMap and other java.util.concurrent classes provide better concurrency with finer-grained locking or lock-free algorithms.

- Explain immutability in Java and how to create immutable classes.  
  Use final class, private final fields, no setters, defensive copies for mutable fields, and constructors that fully initialize state.

- How do you implement Producer–Consumer in Java?  
  Use BlockingQueue (e.g., ArrayBlockingQueue, LinkedBlockingQueue) for simple, robust implementations; alternatives include wait/notify or higher-level concurrency utilities.

- Explain difference between ExecutorService, ForkJoinPool and CompletableFuture.  
  ExecutorService: thread pool and task submission; ForkJoinPool: work-stealing pool optimized for fork/join tasks; CompletableFuture: asynchronous computation composition with callbacks and chaining.

---

## Spring & Spring Boot

- Difference between @Controller, @RestController and @ControllerAdvice.  
  @Controller: MVC controller returning views; @RestController = @Controller + @ResponseBody for REST; @ControllerAdvice: global exception handling / controller-level concerns.

- How do you implement global exception handling in Spring Boot?  
  Use @ControllerAdvice + @ExceptionHandler methods or extend ResponseEntityExceptionHandler.

- How do you configure multiple data sources in a Spring Boot application?  
  Define multiple DataSource beans, use @Primary for default, configure separate EntityManagerFactory and TransactionManager for each persistence unit.

- How to secure REST APIs using JWT or OAuth2 in Spring Boot?  
  JWT: validate token in filter, verify signature and claims. OAuth2: use Spring Security OAuth2 client/resource-server with introspection or JWT validation.

- How do you implement caching in Spring Boot (Redis / Caffeine)?  
  Use Spring Cache abstraction (@EnableCaching, @Cacheable) and provide RedisCacheManager or CaffeineCacheManager implementations.

---

## JPA / Hibernate

- Difference between save(), persist(), and merge().  
  persist(): make transient entity persistent (no return value), must be called in transaction; merge(): copies state and returns managed instance; save() is framework-specific (e.g., Spring Data/JPA repository) that may call persist/merge.

- Explain lazy loading vs eager loading — how to avoid LazyInitializationException.  
  Lazy: associations loaded on access; eager: loaded immediately. To avoid LazyInitializationException, fetch inside transaction, use JOIN FETCH queries, or initialize proxies before session closes (DTO projection, Open Session In View with caution).

- How do you implement batch inserts/updates in Hibernate for large datasets?  
  Use Session batching (hibernate.jdbc.batch_size), flush and clear periodically, use JDBC batch and StatelessSession for fastest throughput.

- Explain @OneToOne, @OneToMany, and @ManyToMany mappings with examples.  
  OneToOne: unique FK or shared PK; OneToMany: parent → list of children with FK on child; ManyToMany: join table mapping between entities.

- What are entity states (transient, persistent, detached, removed) in Hibernate?  
  Transient: new instance not associated with session; Persistent: managed by session; Detached: was persistent but session closed; Removed: scheduled for deletion.

---

## Microservices & Architecture

- Difference between synchronous and asynchronous communication between services.  
  Synchronous: request/response (REST/gRPC) — tight coupling and blocking; Asynchronous: messaging (Kafka/RabbitMQ) — loose coupling, eventual consistency.

- How do you implement service discovery and configuration management?  
  Use tools like Eureka/Consul for discovery; Spring Cloud Config or Vault/Consul for centralized configuration and secrets.

- Explain the use of message brokers (Kafka/RabbitMQ) in microservices.  
  Brokers decouple producers and consumers, enable buffering, durability, pub/sub, and event-driven architectures.

- How do you design a fault-tolerant API Gateway?  
  Use rate limiting, retry/backoff, circuit breakers, caching, health checks, and horizontal redundancy.

- Explain circuit breaker and retry patterns in microservices.  
  Circuit breaker prevents cascading failures by opening after failures; retry with exponential backoff handles transient failures — combine with idempotency.

---

## Cloud & DevOps Basics (Optum Focus)

- How do you deploy Spring Boot microservices to cloud platforms (AWS/Azure)?  
  Containerize (Docker) and deploy to ECS/EKS, App Runner, or Azure App Services/AKS; use CI/CD pipelines and infra-as-code.

- Explain CI/CD pipeline steps in your project (Jenkins/GitLab CI).  
  Typical steps: build → unit tests → static analysis → package → integration tests → push image → deploy → smoke tests → promotion.

- How do you secure secrets and environment variables in cloud?  
  Use secret managers (AWS Secrets Manager, AWS Parameter Store, Azure Key Vault) and avoid baking secrets into images or code.

- Explain vertical vs horizontal scaling with real examples.  
  Vertical: increase instance size (bigger VM); Horizontal: add more instances behind a load balancer (preferred for stateless services).

- How do you monitor and trace microservices in production (ELK, Prometheus, Zipkin)?  
  Collect logs (ELK), metrics (Prometheus + Grafana), and distributed traces (Zipkin/Jaeger) to correlate issues across services.

---

## SQL / Database Knowledge

- Write a SQL query to fetch the 3rd highest salary from Employee table.  
  Example: SELECT DISTINCT salary FROM Employee ORDER BY salary DESC LIMIT 1 OFFSET 2; (syntax varies by DB — use ROW_NUMBER() or subquery for portability).

- Difference between INNER JOIN and LEFT JOIN; give a real use case.  
  INNER JOIN returns matching rows; LEFT JOIN returns all left rows with NULLs for no match. Use LEFT JOIN to include entities even when related records are absent.

- How do you implement data partitioning/sharding for large tables?  
  Use horizontal partitioning by key ranges or hash, use DB native partitioning, or implement application-level sharding for scale.

- Explain database indexing and its impact on performance.  
  Indexes speed up reads by reducing scan cost but add write overhead and storage; choose columns used in WHERE, JOIN, ORDER BY selectively.

- How do you handle transactions and isolation levels in healthcare systems?  
  Use appropriate isolation (e.g., READ COMMITTED or REPEATABLE READ), keep transactions short, use optimistic/pessimistic locking and audit trails for compliance.

---

## DSA & Coding (Optum Special Focus)

- Implement a Java program to group patients by insurance plan and count them.  
  Use Java Streams: patients.stream().collect(Collectors.groupingBy(Patient::getPlan, Collectors.counting())).

- Write a Java program to find duplicate records in a large data stream.  
  Use streaming algorithms and probabilistic structures (Bloom filters) or external sorting; for exact results use hashing with external storage when data exceeds memory.

- Implement a REST endpoint to fetch the last 10 activities of a user.  
  Expose GET /users/{id}/activities?limit=10, query ordered by timestamp DESC and limit 10, return DTOs.

- Design a system to send healthcare alerts to millions of users in real time.  
  Use event-driven architecture: produce events to Kafka, use scalable consumer groups, push notifications via specialized services (APNs/FCM/email/SMS providers), and ensure throttling, retry, and compliance.

- Implement a thread-safe cache with expiration policy in Java.  
  Use ConcurrentHashMap + ScheduledExecutorService for cleanup or use Caffeine/Guava Cache which provide efficient eviction and expiration policies.

---

Notes
- This file is a concise reference — expand any section with code samples or diagrams as needed.
- Add example projects under this folder for runnable samples (Producer/Consumer, Spring Boot examples, Hibernate batch insert, etc.).