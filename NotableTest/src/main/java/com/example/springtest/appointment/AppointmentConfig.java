package com.example.springtest.appointment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Configuration
public class AppointmentConfig {

    @Bean
    CommandLineRunner commandLineRunnerApp(AppointmentRepository repository) {
        return  args ->
        {
            Date today = new Date();
            Appointment newPatient = new Appointment(
                    "tre",
                    "three",
                    today,
                    "new patient",
                    1L

        );

         repository.saveAll(
                 List.of(newPatient)
         ) ;
        };
    }

}
