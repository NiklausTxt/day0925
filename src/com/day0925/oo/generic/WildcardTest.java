package com.day0925.oo.generic;

import java.util.ArrayList;

class Animal{
	
	@Override
	public String toString() {
		return "I am a animal";
	}
	public void eat(){
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal{
	@Override
	public String toString() {
		return "I am a dog";
	}
}
public class WildcardTest {
	public static void main(String[] args) {
		ArrayList<Animal> list = new ArrayList<>();
		
		list.add(new Animal());
		list.add(new Animal());

		ArrayList<Dog> list2 = new ArrayList<>();
		
		list2.add(new Dog());
		list2.add(new Dog());
		
		showList(list2);
		showList2(list2);
		showList2(list);
	}
	
	public static void showList(ArrayList<? extends Animal> list){
		for(Animal animal:list){
			System.out.println(animal);
			animal.eat();
		}
	}
	
	public static void showList2(ArrayList<? super Dog> list){
		for(Object animal : list){
			System.out.println(animal);
		}
	}
}


