package com.java.gettingstarted.handson.exec01;

public class Product {

	private String model;
	private String name;
	private int category;

	public Product() {
		// Do nothing
	}

	public Product(String model, String name, int category) {
		this.setModel(model);
		this.setName(name);
		this.setCategory(category);
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCategory() {
		return this.category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public static void main(String[] args) {
		System.out.println("--- Overloaded constructor");
		Product portablePlender = new Product("XPTO-A030","Portable Blender PlusX",3);
		System.out.println("Model    = " + portablePlender.getModel());
		System.out.println("Name     = " + portablePlender.getName());
		System.out.println("Category = " + portablePlender.getCategory());
		
		Product blender = new Product();
		System.out.println("\n--- Default values");
		System.out.println("Model    = " + blender.getModel());
		System.out.println("Name     = " + blender.getName());
		System.out.println("Category = " + blender.getCategory());
		
		System.out.println("\n--- Updated values");
		blender.setModel("XPTO-B43");
		blender.setName("Blender Smart Auto-Clean");
		blender.setCategory(1);
		System.out.println("Model    = " + blender.getModel());
		System.out.println("Name     = " + blender.getName());
		System.out.println("Category = " + blender.getCategory());
		
		
	}
	
}
