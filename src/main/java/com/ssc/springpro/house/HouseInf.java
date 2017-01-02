package com.ssc.springpro.house;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HouseInf {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name,company,builder,layout,high;
	private String total_area,inner_area,pub_area,rough_price,dec_price,unit_price,total_price;
	private String unit,room;
	
	protected HouseInf(){}
	
	public HouseInf(String name, String company, String builder, String layout, String high, String total_area,
			String inner_area, String pub_area, String rough_price, String dec_price, String unit_price,
			String total_price, String unit, String room) {
		super();
		this.name = name;
		this.company = company;
		this.builder = builder;
		this.layout = layout;
		this.high = high;
		this.total_area = total_area;
		this.inner_area = inner_area;
		this.pub_area = pub_area;
		this.rough_price = rough_price;
		this.dec_price = dec_price;
		this.unit_price = unit_price;
		this.total_price = total_price;
		this.unit = unit;
		this.room = room;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getTotal_area() {
		return total_area;
	}

	public void setTotal_area(String total_area) {
		this.total_area = total_area;
	}

	public String getInner_area() {
		return inner_area;
	}

	public void setInner_area(String inner_area) {
		this.inner_area = inner_area;
	}

	public String getPub_area() {
		return pub_area;
	}

	public void setPub_area(String pub_area) {
		this.pub_area = pub_area;
	}

	public String getRough_price() {
		return rough_price;
	}

	public void setRough_price(String rough_price) {
		this.rough_price = rough_price;
	}

	public String getDec_price() {
		return dec_price;
	}

	public void setDec_price(String dec_price) {
		this.dec_price = dec_price;
	}

	public String getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(String unit_price) {
		this.unit_price = unit_price;
	}

	public String getTotal_price() {
		return total_price;
	}

	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return String.format(
				"%s(%s): %s幢 %s单元 %s, %s, 层高%s, 总面积%s, 房内面积%s, 公共面积%s, 毛坯单价%s, 装修单价%s, 总单价%s, 总价%s.",
				 name, company, builder, unit, room, layout, high, total_area, inner_area, pub_area, rough_price,
				dec_price, unit_price, total_price);
	}
}
