# Spring Boot Concepts Guide

## Controller Annotations and Exception Handling

### Q: What's the difference between @Controller, @RestController and @ControllerAdvice?

**@Controller**
- Traditional MVC controller
- Returns view names by default
- Needs @ResponseBody for returning data directly

```java
@Controller
public class UserController {
    @GetMapping("/users")
    @ResponseBody
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
```

**@RestController**
- Combination of @Controller and @ResponseBody
- Specialized for RESTful web services
- Every method returns data directly

```java
@RestController
public class UserRestController {
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
```

**@ControllerAdvice**
- Global exception handling
- Applies to all controllers
- Can handle cross-cutting concerns

```java
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleUserNotFound(UserNotFoundException ex) {
        return new ResponseEntity<>(new ErrorResponse(ex.getMessage()), HttpStatus.NOT_FOUND);
    }
}
```

### Q: How do you implement global exception handling in Spring Boot?

Global exception handling is implemented using @ControllerAdvice and @ExceptionHandler annotations.

```java
@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGenericException(Exception ex) {
        ErrorResponse error = new ErrorResponse(
            "Internal Server Error",
            ex.getMessage(),
            HttpStatus.INTERNAL_SERVER_ERROR.value()
        );
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFound(ResourceNotFoundException ex) {
        ErrorResponse error = new ErrorResponse(
            "Resource Not Found",
            ex.getMessage(),
            HttpStatus.NOT_FOUND.value()
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
```

### Q: How do you configure multiple data sources in Spring Boot?

You can configure multiple data sources using separate configuration classes:

```java
@Configuration
public class DataSourceConfig {
    
    @Primary
    @Bean(name = "primaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.secondary")
    public DataSource secondaryDataSource() {
        return DataSourceBuilder.create().build();
    }
}
```

application.properties:
```properties
# Primary DataSource
spring.datasource.primary.url=jdbc:mysql://localhost:3306/db1
spring.datasource.primary.username=user1
spring.datasource.primary.password=pass1

# Secondary DataSource
spring.datasource.secondary.url=jdbc:mysql://localhost:3306/db2
spring.datasource.secondary.username=user2
spring.datasource.secondary.password=pass2
```

### Q: How to secure REST APIs using JWT or OAuth2 in Spring Boot?

**JWT Implementation:**

```java
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests()
            .antMatchers("/auth/**").permitAll()
            .anyRequest().authenticated()
            .and()
            .addFilterBefore(new JWTAuthenticationFilter(), 
                           UsernamePasswordAuthenticationFilter.class);
    }
}

@Component
public class JWTUtil {
    private String secret = "your-secret-key";
    
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }
}
```

**OAuth2 Implementation:**

```java
@Configuration
@EnableWebSecurity
public class OAuth2SecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.oauth2Login()
            .and()
            .authorizeRequests()
            .antMatchers("/", "/login**").permitAll()
            .anyRequest().authenticated();
    }
}
```

### Q: How do you implement caching in Spring Boot (Redis / Caffeine)?

**Redis Caching:**

```java
@Configuration
@EnableCaching
public class RedisCacheConfig {
    
    @Bean
    public RedisCacheManager cacheManager(RedisConnectionFactory factory) {
        RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
            .entryTtl(Duration.ofMinutes(10));
            
        return RedisCacheManager.builder(factory)
            .cacheDefaults(config)
            .build();
    }
}

@Service
public class UserService {
    
    @Cacheable(value = "users", key = "#id")
    public User getUserById(Long id) {
        // Method implementation
    }

    @CachePut(value = "users", key = "#user.id")
    public User updateUser(User user) {
        // Method implementation
    }

    @CacheEvict(value = "users", key = "#id")
    public void deleteUser(Long id) {
        // Method implementation
    }
}
```

**Caffeine Caching:**

```java
@Configuration
@EnableCaching
public class CaffeineConfig {
    
    @Bean
    public CacheManager cacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        cacheManager.setCaffeine(Caffeine.newBuilder()
            .expireAfterWrite(60, TimeUnit.MINUTES)
            .maximumSize(100));
        return cacheManager;
    }
}
```

Common application.properties for caching:
```properties
# Redis Configuration
spring.redis.host=localhost
spring.redis.port=6379

# Caffeine Configuration
spring.cache.cache-names=users
spring.cache.caffeine.spec=maximumSize=500,expireAfterAccess=600s
```
