package backend.test.coffee_roasting;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Coffee roasting microservice", version = "1.0.0",
		description = "Microservice for managing coffee roasting "))
public class CoffeeRoastingApplication {
	public static void main(String[] args) {
		SpringApplication.run(CoffeeRoastingApplication.class, args);
	}

}
