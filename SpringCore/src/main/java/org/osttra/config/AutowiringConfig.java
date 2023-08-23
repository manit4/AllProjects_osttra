package org.osttra.config;


import org.osttra.Random1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages = "org.osttra")
public class AutowiringConfig {
	
	@Bean
	public Random1 getRandom1() {
		System.out.println("inside getRandom() of Config class");
		return new Random1();
	}
	
}
