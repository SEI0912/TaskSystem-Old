package jp.gihyo.pro.tasklist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
public class TskListApplication {

	public static void main(String[] args) {
		SpringApplication.run(TskListApplication.class, args);
	}

}
