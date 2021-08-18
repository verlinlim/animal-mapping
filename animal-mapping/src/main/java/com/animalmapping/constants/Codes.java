package com.animalmapping.constants;
import static java.util.Map.entry;

import java.util.Map;    


public interface Codes{
	
	public static final String gender_m="M";
	public static final String gender_f="F";
	
	public static final String animal_dog="DOG";
	public static final String animal_cat="CAT";
	public static final String animal_rooster="ROOSTER";

	
	public static final	Map<String, String> animal_sound_map = Map.ofEntries(
	    entry(animal_dog, Messages.dog_singing),
	    entry(animal_cat, Messages.cat_singing),
	    entry(animal_rooster, Messages.rooster_singing)

	);
	
	
	public static final String color_grey="GREY";
	public static final String color_orange="ORANGE";
	
	public static final String size_large="LARGE";
	public static final String size_small="SMALL";






}