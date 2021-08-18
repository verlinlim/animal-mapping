package com.animalmapping.models;
import com.animalmapping.interfaces.CanSwim;
import com.animalmapping.constants.Messages;


public class Dolphin extends Animal implements CanSwim{	
	
	@Override
	public void swim() {
		System.out.println(Messages.swiming);		
	}
	
	
}