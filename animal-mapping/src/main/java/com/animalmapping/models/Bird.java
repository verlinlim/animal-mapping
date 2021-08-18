package com.animalmapping.models;
import com.animalmapping.interfaces.CanSing;
import com.animalmapping.interfaces.CanFly;
import com.animalmapping.constants.Messages;


public class Bird extends Animal implements  CanSing, CanFly{
	@Override
	public void sing() {
		System.out.println(Messages.singing);		
	}
	
	@Override
	public void fly() {
		System.out.println(Messages.flying);
	}
}