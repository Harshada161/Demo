package Demo;

import org.apache.log4j.Logger;

public class Log4j {

	static Logger logger = Logger.getLogger(Log4j.class);
	
	public static void main(String[] args) {
		logger.info("Dont Enter divisor as Zero");
		{
		      try{
		         int num1=30, num2=0;
		         int output=num1/num2;
		         System.out.println ("Result: "+output);
		      }
		      catch(ArithmeticException e){
		         System.out.println ("You Shouldn't divide a number by zero");
		         logger.fatal("You Shouldn't divide a number by zero");
		      }
		   }
	}
}