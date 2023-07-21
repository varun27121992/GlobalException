package Day4;

public class ExceptionCustom {

	// TODO Auto-generated method stub

	public void passwordCheck(String a) throws PasswordException {
		try {
			if (a.length() >= 8) {
				System.out.println("password is vaild");
			} else {
				throw new PasswordException("password is invalid");
			}
		} catch (PasswordException r) {

			r.printStacktrace();
			System.out.println(r);
			System.out.println("GIT");
		}
	}
}
