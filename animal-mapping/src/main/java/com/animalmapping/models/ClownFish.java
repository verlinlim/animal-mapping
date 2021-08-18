package com.animalmapping.models;

import com.animalmapping.constants.Codes;
import com.animalmapping.constants.Messages;

public class ClownFish extends Fish {
	
	public ClownFish() {
		this.size=Codes.size_small;
		this.colour=Codes.color_orange;
	}
	
	public void makeJokes() {
		System.out.println(Messages.clownfish_jokes);
	}
	
}