package com.Lauretta.reactive;

import com.Lauretta.reactive.student.Student;
import com.Lauretta.reactive.student.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class ReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			StudentService service
	){
		return args-> {
			for(int i =0; i < 100; i++){
				service.save(
						Student.builder()
								.firstname("Ali " + i)
								.lastname("James " + i)
								.age(i)
								.build()
				).subscribe();
			}
		};
	}

}
