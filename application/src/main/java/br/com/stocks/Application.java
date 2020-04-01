package br.com.stocks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="br.com.stocks")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
