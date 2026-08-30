package com.rideflow.rideflowentityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RideflowEntityServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RideflowEntityServiceApplication.class, args);
    }

}
