package com.code.Task_5;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.*;
import static org.junit.Assert.*;
public class SandCTest {
	
	final static Logger logger = Logger.getLogger("SimpleandCompoundTest.java");
	public void test() {

		SandC sc = new SandC();
logger.info("Principal,rate,and time of Interest should be greater than zero");
		

		// Calculate Simple Interest

		double answer = sc.simpleInterest(500, 20, 5);

		assertEquals(500, answer,0.1);

		

		

		// Calculate Compound Interest

		answer = sc.compoundInterest(500, 10, 2);

		assertEquals(105,answer,0.1);

}
}
