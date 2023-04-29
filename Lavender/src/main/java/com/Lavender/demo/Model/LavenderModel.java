package com.Lavender.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LavenderModel {
	@Id
	private int itemid;
	private String itemname;
	private String brandname;
	private String straptype;
	private String flipflop;
	//flip type or not a type
	private String types; 
	//heels or flats
	private String shoes;
	//boots or casual or ballerinas or sports
	private int size;
	private int cost;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getStraptype() {
		return straptype;
	}
	public void setStraptype(String straptype) {
		this.straptype = straptype;
	}
	public String getFlipflop() {
		return flipflop;
	}
	public void setFlipflop(String flipflop) {
		this.flipflop = flipflop;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getShoes() {
		return shoes;
	}
	public void setShoes(String shoes) {
		this.shoes = shoes;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}	