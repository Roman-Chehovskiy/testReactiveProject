package com.reactorProject.reactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.reactive.config.EnableWebFlux;

//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 10)
@SpringBootApplication
@EnableWebFlux
public class ReactorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactorApplication.class, args);
	}

}
