package ua.lviv.lga.palindrom;

public class MyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	public MyException(String message) {
		super(message);
		this.message = message;
		
	}

}
