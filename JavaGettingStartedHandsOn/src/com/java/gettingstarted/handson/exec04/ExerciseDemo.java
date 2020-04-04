package com.java.gettingstarted.handson.exec04;

public class ExerciseDemo {

	public static void main(String[] args) {
		System.out.println("-- Running if-then-else Demo\n" );
		
		boolean isCat = true;
		String animal = isCat ? "Cat" : "Dog";
		String sound = isCat ? "Meooow" : "Ruff Ruff";
		System.out.println("The " + animal + " says " + sound + " !!!") ;
		
		if (isCat) {
			System.out.println("The Cat says Meooow !!!");
		} else {
			System.out.println("The Dog says Ruff Ruff !!!");
		}
		
		
	}
	
}
