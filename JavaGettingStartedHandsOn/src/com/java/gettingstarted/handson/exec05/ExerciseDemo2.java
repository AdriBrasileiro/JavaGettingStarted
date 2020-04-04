package com.java.gettingstarted.handson.exec05;

public class ExerciseDemo2 {

	public static void main(String[] args) {
		
		System.out.println("-- Running switch animal Demo 2\n" );
		if (args.length != 1) {
			StringBuffer buffer = new StringBuffer();
			buffer.append("usage: java com.java.gettingstarted.handson.exec05.ExerciseDemo [arg]\n" );
			buffer.append("arg  : 1 - Cat; " );
			buffer.append("2 - Dog; " );
			buffer.append("3 - Cow; " );
			buffer.append("4 - Lion" );
			System.out.println(buffer.toString());
			System.exit(1);
		}
		
		int option = Integer.valueOf(args[0]);
		--option;

		String[][] animal = { { "Cat", "Meooow" }, { "Dog", "Ruff Ruff" }, { "Cow", "Moooo" }, { "Lion", "Roooar" } };
		
		switch (option) {
		case 0: 
		case 1: 
		case 2: 
		case 3: {
			System.out.println("The " + animal[option][0] + " says " + animal[option][0] + "!!!");
			break;
		}
		default:
			System.out.println("The sound of silence !!!");
		}

	}

}
