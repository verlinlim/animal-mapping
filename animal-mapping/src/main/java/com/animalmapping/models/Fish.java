package com.animalmapping.models;
import com.animalmapping.interfaces.CanSwim;
import com.animalmapping.constants.Messages;


public class Fish extends Animal implements  CanSwim{
	
	public String colour;
	
	public String size;
	
	
	@Override
	public void swim() {
		System.out.println(Messages.swiming);		
	}
	
	public String getColour() {
		return colour;
	}
	
	public String getSize() {
		return size;
	}
	
	
}