package com.day0925.oo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class person {
	String name;
	String id;

	public person(String name, String id) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", id=" + id + "]";
	}
	// @Override
	// public int compareTo(person o) {
	// if(this.name!=o.name){
	// return this.name.compareTo(o.name);
	// }else{
	// return this.id.compareTo(o.id);
	// }
	// }

}

class personScoreComparator implements Comparator<person> {

	@Override
	public int compare(person o1, person o2) {
		return o1.name.compareTo(o2.name);
	}

}

class personIdComparator implements Comparator<person> {

	@Override
	public int compare(person o1, person o2) {
		if (!o1.id.equals(o2.id)) {
			return o1.id.compareTo(o2.id);
		} else {
			return o1.name.compareTo(o2.name);
		}
	}

}

public class SetTest {
	public static void main(String[] args) {
		Set<person> set1 = new TreeSet<>(new personIdComparator());
		set1.add(new person("a", "1111"));
		set1.add(new person("a2", "2222"));
		set1.add(new person("v2", "2222"));
		set1.add(new person("v3", "4444"));
		set1.add(new person("z", "5555"));
//		Object[] arr = set1.toArray();
//		System.out.println(Arrays.toString(arr));
//		System.out.println(set1);
//		Collections
		Set<String> set = new LinkedHashSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		// System.out.println(set);

		Set<String> set2 = new TreeSet<>();
		set2.add("four");
		set2.add("siy");
//		set2.add("eight");
//		set2.add("nine");
//		 System.out.println("==================================");
//		 System.out.println(set2);

	}
}
