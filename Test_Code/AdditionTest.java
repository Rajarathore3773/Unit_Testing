package com.zensar.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.zensar.code.Addition;

import junit.framework.Assert;

public class AdditionTest {
	Addition a=null;
	
	@BeforeClass   // Execute only once time ,Before Executuing  every Test Case
	public static void setUp() {
		System.out.println("Ram");
	}
	@Before // Before executing every @test case
	public void beforEachTestMethod() {
		System.out.println("hii");
		a= new Addition();
	}
	

	@Test
	public void test_Add() {
		//Addition a= new Addition();  *Eska use Setup me kr liya h*
		int actualResult = a.add(5, 10);
		int expecteResult =15;
	//	Assert.assertEquals(expecteResult,actualResult);
		assertEquals(expecteResult,actualResult);
	}


	@Test
	public void test_sub() {
		//Addition a= new Addition();
		int actualResult = a.sub(10, 5);
		int expecteResult =5;
	//	Assert.assertEquals(expecteResult,actualResult);
		assertEquals(expecteResult,actualResult);
	}

	@Test
	public void test_Multiply() {
		//Addition a= new Addition();
		int actualResult = a. multiply(5, 10);
		int expecteResult =50;
	//	Assert.assertEquals(expecteResult,actualResult);
		assertEquals(expecteResult,actualResult);
	}


	@Test
	public void test_division() {
	//	Addition a= new Addition(); 
		int actualResult = a.division(10, 5);
		int expecteResult =2;
	//	Assert.assertEquals(expecteResult,actualResult);
		assertEquals(expecteResult,actualResult);
	}
	
	@After
 public void afterEachTestMethod() {
	 System.out.println("Hello");
	 a=null;
 }
	@Ignore
	@Test
	public void test() {
		System.out.println("Ram");
	}
	
	@AfterClass
	public static void tearDown() {
		System.out.println("Seeta");
	}
	@Test
	public  void testArray() {
		int  actualResult []= a.myArray();
		int expecteResult []={1,2,3,4,5};
	//Assert.assertEquals(expecteResult, actualResult);
		assertArrayEquals(expecteResult,actualResult);
		}
	@Test
	public void testString() {
		String actualResult = a.getName("Zensar");
		String expecteResult = "Zensar";
		//assertEquals(expecteResult,actualResult); *Esme line me erro aa rhi run karne par*
		assertNotEquals(expecteResult,actualResult);
	}
	@Test
	public void testStringForNull() {
		String actualResult = a.getName("abc");
		String expecteResult = null;
		//assertEquals(expecteResult,actualResult); *Esme line me erro aa rhi run karne par*
		assertNotEquals(expecteResult,actualResult);
	}
	@Test(expected=Exception.class)
	public void testStringForExceotion() {
	a.getName("");

	}
}
