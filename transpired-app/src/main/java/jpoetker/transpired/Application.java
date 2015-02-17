package jpoetker.transpired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Boot application entry point and primary Java {@code @Configuration} class.
 * 
 * @author jpoetker
 *
 */
@Configuration
@ComponentScan(basePackages="jpoetker.transpired")
@EnableAutoConfiguration
public class Application {
	
	public static void main(String... args) {
		SpringApplication.run(Application.class, args);
	}
}