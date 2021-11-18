package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication()
public class Spring5MongoRecipeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5MongoRecipeAppApplication.class, args);
	}
}
