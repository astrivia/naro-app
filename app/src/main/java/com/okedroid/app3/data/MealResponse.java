package com.okedroid.app3.data;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class MealResponse{

	@SerializedName("meals")
	private List<MealsItem> meals;

	public void setMeals(List<MealsItem> meals){
		this.meals = meals;
	}

	public List<MealsItem> getMeals(){
		return meals;
	}

	@Override
 	public String toString(){
		return 
			"MealResponse{" + 
			"meals = '" + meals + '\'' + 
			"}";
		}
}