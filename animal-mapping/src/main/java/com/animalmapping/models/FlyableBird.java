package com.animalmapping.models;
import com.animalmapping.interfaces.CanFly;
import com.animalmapping.constants.Messages;


public class FlyableBird extends Bird implements CanFly{
	@Override
	public void fly() {
		System.out.println(Messages.flying);		
	}
	
}