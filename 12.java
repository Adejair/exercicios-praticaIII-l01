class App {
	public static double distancia(double x1, double y1, double x2, double y2) {
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}

	public static void main(String[] args) {
		System.out.println(distancia(4, 5, 1, 1));
	}
}