

class App {
	public static String triangulo(int x, int y, int z) {
		if(x == y && x == z) {
			return "Equilatero";
		} else if((x == y) || (x == z)) {
			return "Isoceles";
		} else {
			return "Escaleno";
		}
	}

	public static void main(String[] args) {
		System.out.println(triangulo(3, 3, 3));
		System.out.println(triangulo(3, 2, 3));
		System.out.println(triangulo(6, 1, 5));
	}
}