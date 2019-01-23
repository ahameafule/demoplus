package ch.noseryoung.demoplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class DemoplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoplusApplication.class, args);
	}

}

