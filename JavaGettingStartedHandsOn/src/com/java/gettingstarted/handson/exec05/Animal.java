package com.java.gettingstarted.handson.exec05;

public enum Animal {
	CAT("Cat", "Meaw"), 
	DOG("Dog", "Ruff"), 
	COW("Cow", "Moo"), 
	LION("Lion", "Roar");

	private String type;
	private String sound;

	private Animal(String type, String sound) {
		this.type = type;
		this.sound = sound;
	}

	public String type() {
		return this.type;
	}

	public String sound() {
		return this.sound;
	}

	public static Animal get(int ordinal) {
		for (Animal animal : Animal.values()) {
			if (animal.ordinal() == ordinal) {
				return animal;
			}
		}
		return null;
	}

}
