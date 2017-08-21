package dao;

public class DAOException extends RuntimeException {
	
	private String ErrorMessage;
	private int errorCode;
	
	public DAOException(int code, String message) {
		this.ErrorMessage = message;
		this.errorCode = code;
	}

}
