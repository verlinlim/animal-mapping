package com.animalmapping.models;
import com.animalmapping.interfaces.CanSwim;
import com.animalmapping.constants.Messages;


public class Duck extends Bird implements  CanSwim{
	@Override
	public void swim() {
		System.out.println(Messages.swiming);		
	}
	
	@Override
	public void sing() {
		System.out.println(Messages.duck_singing);		
	}
	
}