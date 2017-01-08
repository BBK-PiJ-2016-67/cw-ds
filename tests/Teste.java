public class Teste {
	private int tests = 0;
	private int passingTests = 0;
	public void itShould(String title, Object x, Object y) {
		this.tests += 1;
		if (x == y) {
			this.passingTests += 1;
			System.out.println("\u001B[32m" + "PASS: " + title + "\u001B[0m");
		} else {
			System.out.println("\u001B[31m" + "FAIL: " + title + "\u001B[0m");
		}
	}
	public void finish() {
		System.out.println();
		System.out.println(this.passingTests + " of " + this.tests + " tests passed.");
		System.out.println();
	}
	public void section(String title) {
		System.out.println();
		System.out.println(title);
		System.out.println();
	}
}