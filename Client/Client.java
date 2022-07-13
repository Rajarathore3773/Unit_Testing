package com.zensar.client;

import com.zensar.code.Addition;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a = new Addition();
		System.out.println(a.add(10, 5));
		System.out.println(a.sub(10, 5));
		System.out.println(a.multiply(10, 5));
		System.out.println(a.division(10, 5));
	}

}
