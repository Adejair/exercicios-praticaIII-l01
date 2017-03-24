class App {
	public static double sp(double a, double b, double c) {
		return (a + b + c) / 2;
	}

	public static double area(double a, double b, double c) {
		double s = sp(a, b, c);
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public static void main(String[] args) {
		System.out.println(area(2, 3, 4));
	} 
}