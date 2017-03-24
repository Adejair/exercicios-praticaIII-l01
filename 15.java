class App {
	public static int alinhado(int x1, int x2, int x3, int y1, int y2, int y3) {
		return (((x1 * y2 * 1) + (y1 * 1 * x3) + (1 * x2 * y3)) - ((y1 * x2 * 1) + (x1 * 1 * y3) + (1 * y2 * x3))) == 0 ? 1: 0;
	}

	public static void main(String[] args) {
		// 0
		System.out.println(alinhado(0, 0, 0, 0, 0, 0));
		// -59
		System.out.println(alinhado(5, -2, 0, 0, 3, 2));
	}
}

