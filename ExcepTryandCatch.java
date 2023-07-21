package Day4;

public class ExcepTryandCatch {
	public static void main(String[] args) {
		String[] a = { "car", "bike", "aeroplane", "rock" };
		try {
			System.out.println(a[0].charAt(5));
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException f) {
			// f.printStackTrace();
			// System.out.println("There is Index out of exception");
			System.out.print(f);
		} catch (RuntimeException g) {
			g.printStackTrace();
		} catch (Exception i) {
			i.printStackTrace();
		}
	}
}
