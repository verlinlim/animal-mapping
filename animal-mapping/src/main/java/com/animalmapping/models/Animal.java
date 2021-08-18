package com.animalmapping.models;

import com.animalmapping.constants.Messages;
import com.animalmapping.interfaces.CanWalk;

public abstract class Animal implements CanWalk{
	@Override
	public void walk() {
		System.out.println(Messages.walking);
	}
}