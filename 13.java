class App {
	public static String segundosEmHoras(int segundos) {
		// 11030
		int[] x = new int[2];

		for(int i = 0; i != 2; ++i) {
			x[i] = segundos % 60;
			segundos /= 60;
		}

		int horas = segundos % 24;
		return horas + " : " + x[1] + " : " + x[0];
	}

	public static void main(String[] args) {
		System.out.println(segundosEmHoras(11030));
	}
}