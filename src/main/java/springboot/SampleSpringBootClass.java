package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SampleSpringBootClass {

    public static void main(String args[]) {
        SpringApplication.run(SampleSpringBootClass.class, args);

    }

}
