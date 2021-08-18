package com.animalmapping.models;
import com.animalmapping.interfaces.CanFly;
import com.animalmapping.interfaces.CanSwim;
import com.animalmapping.constants.Messages;


public class Duck extends Bird implements CanSwim, CanFly{
	@Override
	public void swim() {
		System.out.println(Messages.swiming);		
	}
	
	@Override
	public void fly() {
		System.out.println(Messages.flying);
	}
	
	@Override
	public void sing() {
		System.out.println(Messages.duck_singing);		
	}
	
	
	
}