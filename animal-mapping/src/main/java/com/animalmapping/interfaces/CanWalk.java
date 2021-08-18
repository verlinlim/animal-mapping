package com.animalmapping.interfaces;

import com.animalmapping.constants.Messages;

public interface CanWalk{

	
	public default void walk() {
		System.out.println(Messages.walking);
	};


}