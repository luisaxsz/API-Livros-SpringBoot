package LivrosApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "LivrosApi")
public class LivrosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivrosApiApplication.class, args);
	}

}
