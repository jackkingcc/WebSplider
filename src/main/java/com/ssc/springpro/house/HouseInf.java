package com.ssc.springpro.house;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HouseInf {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private String room;
	private long price;
	
	protected HouseInf(){}

	public HouseInf(String name, String room, long price) {
		super();
		this.name = name;
		this.room = room;
		this.price = price;
	};
	
	@Override
	public String toString() {
		return String.format("HouseInf[id=%d, name=%s, room=%s, price=%d", id, name, room, price);
	}
}
