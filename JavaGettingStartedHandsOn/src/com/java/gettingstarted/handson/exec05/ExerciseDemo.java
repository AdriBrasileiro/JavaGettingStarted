package com.java.gettingstarted.handson.exec05;

public class ExerciseDemo {

	public static void main(String[] args) {
		
		System.out.println("-- Running switch animal Demo\n" );
		if (args.length != 1) {
			StringBuffer buffer = new StringBuffer();
			buffer.append("usage: java com.java.gettingstarted.handson.exec05.ExerciseDemo 1 2 3   \n" );
			buffer.append("arg  : 1 - Cat; \n" );
			buffer.append("       2 - Dog; \n" );
			buffer.append("       3 - Cow; \n" );
			buffer.append("       4 - Lion" );
			System.out.println(buffer.toString());
			System.exit(1);
		}
		
		// auto unboxing
		Integer i = Integer.valueOf(args[0]);
		int option = i;
		--option;

		String[][] animal = { { "Cat", "Meooow" }, 
				              { "Dog", "Ruff Ruff" }, 
				              { "Cow", "Moooo" }, 
				              { "Lion", "Roooar" } 
				            };
		
		switch (option) {
		case 0: {
			System.out.println("The " + animal[option][0] + " says " + animal[option][1] + "!!!");
			break;
		}
		case 1: {
			System.out.println("The " + animal[option][0] + " says " + animal[option][1] + "!!!");
			break;
		}
		case 2: {
			System.out.println("The " + animal[option][0] + " says " + animal[option][1] + "!!!");
			break;
		}
		case 3: {
			System.out.println("The " + animal[option][0] + " says " + animal[option][1] + "!!!");
			break;
		}
		default:
			System.out.println("The sound of silence !!!");
		}

	}

}
