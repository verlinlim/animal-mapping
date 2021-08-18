package com.animalmapping.models;
import com.animalmapping.constants.Messages;


public class Chicken extends Bird {
	@Override
	public void sing() {
		System.out.println(Messages.chicken_singing);		
	}
	
	@Override
	public void fly() {
		 //cannot fly
	}
}