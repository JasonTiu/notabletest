package com.example.springtest.appointment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Configuration
public class AppointmentConfig {

    @Bean
    CommandLineRunner commandLineRunnerApp(AppointmentRepository repository) {
        return  args ->
        {
            LocalDate today = LocalDate.now();
            LocalTime currTime = LocalTime.of(8,15);
            Appointment newPatient = new Appointment(
                    "tre",
                    "three",
                    today,
                    currTime,
                    "new patient",
                    1L

        );

         repository.saveAll(
                 List.of(newPatient)
         ) ;
        };
    }

}
