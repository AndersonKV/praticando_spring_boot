package com.example.demo.studant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student anderson =  new Student(
                    "anderson",
                    "anderson@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5) );

            Student maria =  new Student(
                    "maria",
                    "maria@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5) );

            repository.saveAll(List.of(anderson, maria));
        };
    }


}
