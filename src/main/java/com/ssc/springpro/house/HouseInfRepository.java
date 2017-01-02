package com.ssc.springpro.house;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "house", path = "house")
public interface HouseInfRepository extends PagingAndSortingRepository<HouseInf, Long> {
	List<HouseInf> findByName(@Param("name")String name);
	
	List<HouseInf> findByCompany(@Param("company")String company);
	
	List<HouseInf> findByLayout(@Param("layout")String layout);
	
}
