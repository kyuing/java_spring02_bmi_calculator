package com.javalec.bmiEx;

public class BMICalc {

	private double lowWeight;
	private double normal;
	private double overWeight;
	private double obesity;
	

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}
	
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	public void bmiCalculator(double weight, double height) {
	
		double h = height * 0.01;
		double result = weight / (h * h);
		
		System.out.println("BMI Classification: " + (int)result);
		
		if (result > obesity) {
			System.out.println("obesity");
			
		}else if (result > overWeight) {
			System.out.println("over Weight");
			
		}else if (result > normal) {
			System.out.println("normal");
			
		}else {
			System.out.println("low weight");
		}
	}
}

