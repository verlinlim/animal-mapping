package com.animalmapping.interfaces;

import com.animalmapping.constants.Messages;

public interface CanSing{
	
	public default void sing() {
		System.out.println(Messages.singing);		
	}

}