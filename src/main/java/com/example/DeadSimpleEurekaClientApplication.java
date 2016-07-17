package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class DeadSimpleEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeadSimpleEurekaClientApplication.class, args);
	}
}

@RestController
class SimpleRestController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello.";
    }
}