package com.emc.jpacontact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.emc.jpacontact")
@EnableJpaRepositories(basePackages = "com.emc.jpacontact")
@EntityScan(basePackages = "com.emc.jpacontact")
public class JpacontactApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpacontactApplication.class, args);
	}

}
