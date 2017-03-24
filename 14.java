class App {
	public static int[] MAX(int[][]a) {
		int[] n = new int[3];


		// MAX;
		n[0] = a[0][0];

		for(int i = 0; i != a.length; ++i) {
			for(int j = 0; j != a[i].length; ++j) {
				if(a[i][j] > n[0]) {
					n[0] = a[i][j];
					n[1] = i;
					n[2] = j;
				}
			}
		}
		return n;
	}

	public static void main(String[] args) {
		int[][] a = {{3, 7, 1}, {1, 2, 8}, {5, 3, 4}};

		int[] x = MAX(a);
		String[] message = {"MAIOR: ", "LINHA: ", "COL: "};

		for(int i = 0; i != x.length; ++i)
			System.out.println(message[i] + x[i]);
  	}
}