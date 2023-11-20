package com.ipd.studentserviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalancerAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceConsumerApplication.class, args);
	}

}
