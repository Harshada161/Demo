package com;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class SingletonExTest {
	Logger log = Logger.getLogger(SingletonExTest.class);

	@Test
	public void testSingleton() throws Exception {
		log.info("Creating first instance");
		SingletonEx s1 = SingletonEx.createInstance();
		log.info("Creating second instance");
		SingletonEx s2 = SingletonEx.createInstance();
		System.out.println("Check equality of both the objects");
		log.info("Checking eqality");
		Assert.assertEquals(true, s1==s2);
		log.info("Correct");

		//fail("Not yet implemented");
		System.out.println("Test pass");
	}

}
