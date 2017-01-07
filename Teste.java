public class Teste {
	public void expect(String title, Object x, Object y) {
		if (x == y) {
			System.out.println("\u001B[32m" + "PASS: " + title + "\u001B[0m");
		} else {
			System.out.println("\u001B[31m" + "FAIL: " + title + "\u001B[0m");
		}
	}
}