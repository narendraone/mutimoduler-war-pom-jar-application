package com.ptb.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ptb.*"})
@EntityScan(basePackages = {"com.ptb.*"})
@EnableJpaRepositories(basePackages = {"com.ptb.*"})
public class ProtekApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(ProtekApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProtekApplication.class, args);
	}

}
