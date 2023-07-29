package BasicJava;

public class InsufficientFundException extends Exception { // this class extends Exception class
	
	double amount;
	
	public InsufficientFundException(double amt){ 
		amount = amt;
	}

}
