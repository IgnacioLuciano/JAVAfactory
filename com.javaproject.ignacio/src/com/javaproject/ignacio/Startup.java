package com.javaproject.ignacio;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnimalFactory animalfactory = new AnimalFactory();
	
Animal cow = animalfactory.getAnimal("Cow");
cow.speak();

Animal cat = animalfactory.getAnimal("Cat");
cat.speak();

Animal dog = animalfactory.getAnimal("Dog");
dog.speak();
	
	}

}
