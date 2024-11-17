package com.example.customerservice;

import com.example.customerservice.entites.Customer;
import com.example.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return   args -> {
         customerRepository.save(Customer.builder()
                 .name("Ereh").email("smohammed@gmail.com")
                 .build());
         customerRepository.save(Customer.builder()
                    .name("Silla").email("smohammed@gmail.com")
                    .build());
         customerRepository.save(Customer.builder()
                    .name("Moka").email("smohammed@gmail.com")
                    .build());
         customerRepository.findAll().forEach(
            c->{
                System.out.println("====================================");
                System.out.println(c.getId());
                System.out.println(c.getName());
                System.out.println(c.getEmail());
                System.out.println("====================================");
         }
         );



        };
    }

}
