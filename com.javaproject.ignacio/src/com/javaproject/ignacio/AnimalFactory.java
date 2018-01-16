package com.javaproject.ignacio;

public class AnimalFactory{
    public Animal getAnimal(String animalType){
        if(animalType.equalsIgnoreCase("Cow")){
            return new Cow();
        }
        else if(animalType.equalsIgnoreCase("Dog")){
            return new Dog();
        }
        else if(animalType.equalsIgnoreCase("Cat")){
            return new Cat();
        }
        else{
            System.out.println(animalType + " is not recognized by AnimalFactory.");
            return null;
        }
    }
}