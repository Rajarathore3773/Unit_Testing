package com.zensar.code;

public class Addition {

	public Integer add(Integer a,Integer b) {
		return a+b;
	}
	
	public Integer sub(Integer a,Integer b) {
		return a-b;
	}
	
	public Integer multiply(Integer a,Integer b) {
		return a*b;
	}
	public Integer division(Integer a,Integer b) {
		return a/b;
	}
	
	public  int[] myArray() {
		return new int [] {1,2,3,4,5};
	}
	
	public String getName(String name) {
		if(name.length()!=0) {
			return name.toUpperCase();
		}
		//return null;
		throw new IllegalArgumentException("Arg not valid");	
	}
}
