package com.day0925.oo.generic;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

class Container<k, v>{
	private k key;
	private v value;
	public Container(k key, v value) {
		this.key=key;
		this.value=value;
	}
	public k getKey() {
		return key;
	}
	public void setKey(k key) {
		this.key = key;
	}
	public v getValue() {
		return value;
	}
	public void setValue(v value) {
		this.value = value;
	}
	
}

interface Genericer<T>{
	public T next();
}

class AnimalGenericer implements Genericer{
	private String[] arr = {"dog","cat","mouse"};

	@Override
	public Object next() {
		Random random = new Random();
		return arr[random.nextInt(2)];
	}
	
}

public class GenericTest {

	public static <T> void out(T t){
		System.out.println(t);
	}
	
	public static <T> void out2(T...args){
		for(T t:args){
			System.out.println(t);
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Dog");
		list.add("Cat");
		list.add("Fish");
		list.add("Mouse");
		out(list);
		System.out.println("==========================");
		out2(list);
		System.out.println("==========================");
//		System.out.println(list.get(3));

		HashMap<Integer, String> map = new HashMap<>();
		ArrayList<String> arrayList1 = new ArrayList<>();
		Container c1 =  new Container("a", "b");
		Container c2 =  new Container("v", "e");
		Container c3 =  new Container(new Date(), 1.2);
		System.out.println(c1.getKey()+":"+c1.getValue());
		System.out.println(c2.getKey()+":"+c2.getValue());
		System.out.println(c3.getKey()+":"+c3.getValue());
		
		AnimalGenericer a = new AnimalGenericer();
		System.out.println(a.next());
		System.out.println(a.next());
		System.out.println(a.next());

		}

}
