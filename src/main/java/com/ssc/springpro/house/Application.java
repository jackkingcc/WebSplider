package com.ssc.springpro.house;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	private Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(HouseInfRepository repository){
		return (args) ->{
			repository.save(new HouseInf("xixi","14-01",12301));			
			repository.save(new HouseInf("万科","15-101",32301));	
			
			logger.info("Finding all houses");
			for(HouseInf inf:repository.findAll()){
				logger.info(inf.toString());
			}
		};
		
	}
}
