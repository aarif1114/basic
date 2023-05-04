package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Modelclass {
  @Id
  private int id;
  private String foodname;
  private String addons;
  private int Quantity;
  private int price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFoodname() {
	return foodname;
}
public void setFoodname(String foodname) {
	this.foodname = foodname;
}
public String getAddons() {
	return addons;
}
public void setAddons(String addons) {
	this.addons = addons;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
  
}
