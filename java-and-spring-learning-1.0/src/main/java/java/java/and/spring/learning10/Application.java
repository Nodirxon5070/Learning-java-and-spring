package java.java.and.spring.learning10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		byte byteVar = 42;
		short shortVar = byteVar;
		int intVar = shortVar;
		long longVar = intVar;
		float floatVar = longVar;
		double doubleVar = floatVar;

		System.out.println(byteVar);
	}

}
