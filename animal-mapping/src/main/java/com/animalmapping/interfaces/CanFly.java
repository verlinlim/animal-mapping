package com.animalmapping.interfaces;

import com.animalmapping.constants.Messages;

public interface CanFly{
	
	public default void fly() {;
	System.out.println(Messages.flying);

	}

}