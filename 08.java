class App {
	public static double vel(double vf, double vi, double s, double si) {
		return ((vf - vi) / (s - si)) / 3.6;
	}

	public static void main(String[] args) {
		System.out.println(vel(300, 0, 12, 7));
	}
}