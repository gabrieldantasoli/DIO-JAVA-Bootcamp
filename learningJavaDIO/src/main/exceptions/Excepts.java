package main.exceptions;

public class Excepts {
	
	public Excepts() {
		int num = 30;
	    int div = 0;
	     
	    try {
	    	System.out.println(num / div);
	    } catch (StringIndexOutOfBoundsException e) {
	   	 	System.out.println(e.getMessage());
	    } catch (ArithmeticException e) {
	    	System.out.println(e.getMessage());
	    } finally {
	    	System.out.println("End");
		}
	}
}
