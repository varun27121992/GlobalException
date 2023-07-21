package Day4;

public class PasswordException extends Exception {
	public PasswordException(String msg) {
		super(msg);
	}
	public void printStacktrace() {
		System.out.println("error");
	}
}
