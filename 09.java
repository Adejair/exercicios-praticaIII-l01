

class App {
	public static int[][] matriz(int[][] m) {
		int[][] INVALID_MATRIZ = {{-1}};
		int[][] MATRIZ_NOVA = new int[2][5];

		int acc = 0,
			acc2 = 0;

		if(m.length != 5 || m[1].length != 5) {
			return INVALID_MATRIZ;
		}

		for(int i = 0; i != m.length; ++i) {
			acc = 0;
			for(int j = 0; j != m[i].length; ++j) {
				acc += m[i][j];
				acc2 += m[j][i];

			}
			MATRIZ_NOVA[0][i] = acc;
			MATRIZ_NOVA[1][i] = acc2;
		}

		return MATRIZ_NOVA;
	}

	public static void main(String[] args) {
		int[][] m1 = {{1, 2, 4, 5, 2}, {6, 5, 8, 1, 7}, {3, 4, 2, 6, 3}, {8, 1, 7, 8, 5}, {6, 3, 4, 1, 7}};
		
		int[][] x = matriz(m1);

		for(int i = 0; i != 2; ++i) {
			for(int j = 0; j != 5; ++j) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}

	}
}	