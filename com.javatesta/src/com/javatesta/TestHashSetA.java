package com.javatesta;

import java.util.HashSet;

public class TestHashSetA {
	public static void main(String[] args) {
		HashSet<Integer> it = new HashSet<>();
		it.add(10);
		it.add(20);
		it.add(20);
		it.add(30);

		/*
		 * //search--->contains if(!it.contains(40)) {
		 * System.out.println("it is dos not contains"); } it.remove(10);
		 * if(!it.contains(10)) { System.out.println("it is not remove"); }
		 */
		// how to print setSize
		System.out.println("it is print set of size" + it.size());
	}
}
