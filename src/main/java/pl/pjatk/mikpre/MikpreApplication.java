package pl.pjatk.mikpre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:ApplicationContext.xml")

public class MikpreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MikpreApplication.class, args);
	}

}
