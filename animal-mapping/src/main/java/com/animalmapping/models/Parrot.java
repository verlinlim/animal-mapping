package com.animalmapping.models;
import com.animalmapping.constants.Codes;
import com.animalmapping.constants.Messages;
import com.animalmapping.interfaces.CanFly;


public class Parrot extends Bird implements CanFly {
	
	public String housemate;
	
	public Parrot() {
		
	}
	public Parrot(String housemate) {
		this.housemate=housemate;
	}
	
	@Override
	public void sing() {
		String sound = housemate !=null ? Codes.animal_sound_map.get(housemate): Messages.singing;
		System.out.println(sound);		
	}
	
	@Override
	public void fly() {
		System.out.println(Messages.flying);
	}
	
}