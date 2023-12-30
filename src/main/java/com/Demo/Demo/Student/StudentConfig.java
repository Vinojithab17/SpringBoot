package com.Demo.Demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return args -> {
           Student Vinojith =  new Student(1L,
                    "Vinojith",
                        "Vinojith@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,18)

                );

            Student ABD =  new Student(
                    "ABD",
                    "ABD@gmail.com",
                    LocalDate.of(2002, Month.JANUARY,18)

            );
                repository.saveAll(List.of(Vinojith,ABD));
        };
    }
}
