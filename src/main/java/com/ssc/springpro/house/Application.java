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
			repository.save(new HouseInf("清水公寓","万科","1#","三房两厅","3.1","144.01","110.65","33.36","39942",
					"5000","44942","6472044","1","101"));	
			
			repository.save(new HouseInf("万家花城","滨江","2#","三房两厅","3.1","123.01","100.65","33.36","39942",
					"5000","40000","5200155","2","201"));			
			
			logger.info("Finding all houses");
			for(HouseInf inf:repository.findAll()){
				logger.info(inf.toString());
			}
			//new House().saveToFile(repository,"\\\\HZ47P4498243\\ccsnapshot_views\\house.txt");
		};
		
	}
}
