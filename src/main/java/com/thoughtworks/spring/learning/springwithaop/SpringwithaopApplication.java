package com.thoughtworks.spring.learning.springwithaop;

import com.thoughtworks.spring.learning.springwithaop.Entitys.Customer;
import com.thoughtworks.spring.learning.springwithaop.Repositorys.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringwithaopApplication {
    private static final Logger log = LoggerFactory.getLogger(SpringwithaopApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringwithaopApplication.class, args);
    }

}
