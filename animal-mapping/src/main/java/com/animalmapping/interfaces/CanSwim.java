package com.animalmapping.interfaces;

import com.animalmapping.constants.Messages;

public interface CanSwim{
	
	public default void swim() {
		System.out.println(Messages.swiming);
	};

}