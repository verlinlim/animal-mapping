package com.animalmapping.models;
import com.animalmapping.constants.Codes;
import com.animalmapping.constants.Messages;


public class Parrot extends Bird {
	
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
	
}