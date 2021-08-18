package com.animalmapping.models;
import com.animalmapping.constants.Codes;
import com.animalmapping.constants.Messages;


public class Chicken extends NonFlyableBird {
	
	public String gender = Codes.gender_f;
	
	public Chicken() {
		
	}
	
	public Chicken(String gender) {
		this.gender=gender;
	}
	
	@Override
	public void sing() {
		if(this.gender.equals(Codes.gender_m)) {
			System.out.println(Messages.rooster_singing);		
		}else {
			System.out.println(Messages.chicken_singing);		
		}
	}
	
	
}