package com.example.gmf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
@SpringBootApplication
@EntityScan(basePackages = {"com.example.gmf.menu.entity", "com.example.gmf.user"})
@EnableJpaRepositories(basePackages = {"com.example.gmf.menu.dao", "com.example.gmf.user"})
@ComponentScan("com.example.gmf.menu.entity")
*/
@SpringBootApplication
/*
 * @EnableJpaRepositories(basePackages = {"com.example.gmf.menu.dao",
 * "com.example.gmf.user"})
 * 
 * @ComponentScan (basePackages = { "com.example.gmf.*" })
 * 
 * @EntityScan(basePackages = {"com.example.gmf.menu.entity",
 * "com.example.gmf.user"})
 */

public class GmfApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmfApplication.class, args);
	}

}
