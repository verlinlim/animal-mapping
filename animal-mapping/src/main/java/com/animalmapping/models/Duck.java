package com.animalmapping.models;
import com.animalmapping.interfaces.CanSwim;
import com.animalmapping.constants.Messages;


public class Duck extends FlyableBird implements CanSwim{
	
	@Override
	public void sing() {
		System.out.println(Messages.duck_singing);		
	}
	
	
	
}