package cn.edu.imut.jm.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JmEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmEurekaApplication.class, args);
	}

}
