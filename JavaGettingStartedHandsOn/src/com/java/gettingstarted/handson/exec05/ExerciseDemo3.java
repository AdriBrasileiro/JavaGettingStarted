package com.java.gettingstarted.handson.exec05;

public class ExerciseDemo3 {

	public static void main(String[] args) {

		System.out.println("-- Running switch animal Demo 3\n");
		if (args.length != 1) {
			StringBuffer buffer = new StringBuffer();
			buffer.append("usage: java com.java.gettingstarted.handson.exec05.ExerciseDemo [arg]\n");
			buffer.append("arg  : 1 - Cat; ");
			buffer.append("2 - Dog; ");
			buffer.append("3 - Cow; ");
			buffer.append("4 - Lion");
			System.out.println(buffer.toString());
			System.exit(1);
		}

		int option = Integer.valueOf(args[0]);
		--option;

		Animal animal = Animal.get(option);
		switch (animal) {
		case CAT:{
			System.out.println("The " + Animal.CAT.type() + " says " + Animal.CAT.sound() + "!!!");
			break;
		}
		case DOG: {
			System.out.println("The " + Animal.DOG.type() + " says " + Animal.DOG.sound() + "!!!");
			break;
		}
		case COW:
		case LION: {
			System.out.println("The " + animal.type() + " says " + animal.sound() + "!!!");
			break;
		}
		default:
			System.out.println("The sound of silence !!!");
		}

	}

}

