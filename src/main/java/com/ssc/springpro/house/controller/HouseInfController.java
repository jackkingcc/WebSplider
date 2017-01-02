package com.ssc.springpro.house.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssc.springpro.house.HouseInf;
import com.ssc.springpro.house.HouseInfRepository;

@RestController

public class HouseInfController {
	private final HouseInfRepository repository;
	private final static Logger logger = LoggerFactory.getLogger(HouseInfController.class);
	
	@Autowired
	public HouseInfController(HouseInfRepository repository) {
		this.repository=repository;
	}
	
	
/*	public @ResponseBody List<HouseInf> getHouseInf(){
		List<HouseInf> res = new ArrayList<>();
		for(HouseInf inf:repository.findAll()){
			res.add(inf);
		}
		return res;
	}*/
	
@RequestMapping("/HHHH")
  public  HouseInf getHouseInf(){
	logger.info("getting house information");
	HouseInf houseInf = repository.findOne((long) 0);
	logger.info("house : "+houseInf.toString());
	return houseInf;
}
}
