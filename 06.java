class App {

	public static boolean poliedro(int v, int a, int f) {
		return v - (a + f) == 2;
	}

	public static void main(String[] args) {
		System.out.println(poliedro(6, 2, 2));
		System.out.println(poliedro(9, 2, 2));
	}
}