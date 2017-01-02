package com.ssc.springpro.house.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssc.springpro.house.HouseInf;
import com.ssc.springpro.house.HouseInfRepository;

@RestController
@RequestMapping("/house-inf")
public class HouseInfController {
	private final HouseInfRepository repository;
	
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
	
  public @ResponseBody HouseInf getHouseInf(){
	return repository.findOne((long) 0);
}
}
