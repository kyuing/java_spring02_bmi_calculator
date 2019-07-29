package com.javalec.bmiEx;

import java.util.ArrayList;

public class MyInfo {

	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobbies;
	private BMICalc bmiCalc;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public ArrayList<String> getHobbies() {
		return hobbies;
	}
	
	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	public BMICalc getBmiCalc() {
		return bmiCalc;
	}
	public void setBmiCalc(BMICalc bmiCalc) {
		this.bmiCalc = bmiCalc;
	}
	
	public void getInfo() {
		
		System.out.println("name: " + name);
		System.out.println("height: " + height);
		System.out.println("weight: " + weight);
		System.out.println("hobbies: " + hobbies);
		bmiBridge();
	}
	
	public void bmiBridge() {
		this.bmiCalc.bmiCalculator(weight, height);
	}
}
