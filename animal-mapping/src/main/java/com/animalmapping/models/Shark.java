package com.animalmapping.models;

import com.animalmapping.constants.Codes;
import com.animalmapping.constants.Messages;

public class Shark extends Fish {
	
	public Shark() {
		this.size=Codes.size_large;
		this.colour=Codes.color_grey;
	}
	
	public void eatFish() {
		System.out.println(Messages.shark_eating_fishes);
	}
	
}