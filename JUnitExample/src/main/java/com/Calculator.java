package com;

import org.apache.log4j.Logger;


public class Calculator {
	static long c=0;
	static Logger log1 = Logger.getLogger(Calculator.class);

	
	
	public static long add(long a, long b) {
		log1.warn("Do not enter divisor as Zero");
		c = a+b;
		System.out.println("Addition is:"+c);
        return c;
    }
    public long subtract(long first, long second) {
    	System.out.println("Subtraction is :");
        return first - second;
    }
    public long multiply(long first, long second) {
    	System.out.println("Multiplication is :");
        return first * second;
    }
    public long divide(long first, long second) {
    	log1.warn("Do not enter divisor as Zero");
    	System.out.println("Division is :");
    	
        return first / second;
    }
}

