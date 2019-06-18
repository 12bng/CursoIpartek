package ejercicios1;

public class FechaException extends RuntimeException {
	public FechaException() {
	}

	public FechaException(String message) {
		super(message);
		// System.out.println(message);
	}

	public FechaException(String message, Throwable cause) {
		// System.out.println(message);
		super(message, cause);
	}

	public FechaException(Throwable cause) {
		super(cause);
	}

}
