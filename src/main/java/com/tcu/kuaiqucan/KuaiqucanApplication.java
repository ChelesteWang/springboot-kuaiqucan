package com.tcu.kuaiqucan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJdbcRepositories
public class KuaiqucanApplication {

	public static void main(String[] args) {
		SpringApplication.run(KuaiqucanApplication.class, args);
	}

}
