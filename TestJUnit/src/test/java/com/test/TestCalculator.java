package com.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lesson.Calculator;

public class TestCalculator {

	private static Calculator calculator;
	
	@BeforeClass
	public static void init(){
		calculator = new Calculator();
	}
	
	@AfterClass
	public static void destroy(){
		calculator = null;
	}
	
	@Test
	public void testAdd(){
		int real = calculator.add(5, 5);
		int expected = 11;
		
		//Assert.assertEquals(expected, real);
		
		if(expected != real){
			Assert.fail("hahaha");
		}
		
		
		
	}
	
	
	@Test
	public void testSubstruct(){
		Assert.assertEquals(calculator.substruct(2, 2), 0, 0.000001);
	}
	
	
	
	
}
