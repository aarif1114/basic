package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="project")
public class Modelclass {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String busno;
    private String source;
    private String destination;
    private String pickuptime;
    private String droptime;
    private String busfare;
	public int getBookingid() {
		return id;
	}
	public void setBookingid(int id) {
		this.id = id;
	}
	public String getBusno() {
		return busno;
	}
	public void setBusno(String busno) {
		this.busno = busno;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPickuptime() {
		return pickuptime;
	}
	public void setPickuptime(String pickuptime) {
		this.pickuptime = pickuptime;
	}
	public String getDroptime() {
		return droptime;
	}
	public void setDroptime(String droptime) {
		this.droptime = droptime;
	}
	public String getBusfare() {
		return busfare;
	}
	public void setBusfare(String busfare) {
		this.busfare = busfare;
	}
    
}
