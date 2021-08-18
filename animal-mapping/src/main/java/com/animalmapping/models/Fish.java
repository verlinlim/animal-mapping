package com.animalmapping.models;
import com.animalmapping.interfaces.CanSwim;


public class Fish extends Animal implements  CanSwim{
	
	public String colour;
	
	public String size;
	
	public String getColour() {
		return colour;
	}
	
	public String getSize() {
		return size;
	}
	
	
}