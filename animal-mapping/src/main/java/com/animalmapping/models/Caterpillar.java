package com.animalmapping.models;
import com.animalmapping.interfaces.CanWalk;


public class Caterpillar extends Animal implements CanWalk{
	
	public Butterfly butterfly;
	
	public Butterfly metamorphosis() {
		Butterfly butterfly = new Butterfly();
		butterfly.caterpillar=this;
		this.butterfly=butterfly;
		return butterfly;
	}
	
}