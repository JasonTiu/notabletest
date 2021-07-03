package com.example.springtest.doctor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DoctorConfig {

    @Bean
    CommandLineRunner commandLineRunnerDoc(DoctorRepository repository)
    {
        return args -> {
            Doctor john = new Doctor(

                    "Doe",
                    "John"
            );
            Doctor steve = new Doctor(

                    "Steve",
                    "Irv"
            );

            repository.saveAll(
                    List.of(john, steve)
            );
        };
    }
}
