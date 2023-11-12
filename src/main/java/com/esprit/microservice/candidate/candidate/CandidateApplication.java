package com.esprit.microservice.candidate.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CandidateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandidateApplication.class, args);
    }


    @Autowired
    private CandidateRepository repository;

    @Bean
    ApplicationRunner init(){
        return (args)-> {
            //Save
            repository.save(new Candidat("ONES","Is","ONES@esprit.tn"));
            repository.save(new Candidat("MANAR","Is","MANAR@esprit.tn"));
            repository.save(new Candidat("MERIEM","Is","MERIEM@esprit.tn"));
            //fetch
            repository.findAll().forEach(System.out::println);
        };
    }
}
