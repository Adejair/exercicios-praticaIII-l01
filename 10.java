class App {
	/**
	* TIPOS
	* 1 - BEZZEROS
	* 2 - VACA SECAS
	* 3 - VACAS EM LACTAÇÃO
	*/

	public static double valorDiaReais(int type, int numero) {
		double calc = 0.0;

		switch(type) {
			case 1: {
				calc = (0.70 * 1) * numero;
				break;
			}

			case 2: {
				calc = (0.65 * 2.5) * numero;
				break;
			}

			case 3: {
				calc = (0.75 * 4.5) * numero;
				break;
			}
		}
		return calc;
	}


	public static double valorDiaKg(int type, int numero) {
		double calc = 0.0;

		switch(type) {
			case 1: {
				calc = 1 * numero;
				break;
			}

			case 2: {
				calc = 2.5 * numero;
				break;
			}

			case 3: {
				calc = 4.5 * numero;
				break;
			}
		}
		return calc;
	}


	public static double valorTempoReais(int type, int numero, int tempo) {
		double calc = 0.0;

		switch(type) {
			case 1: {
				calc = ((0.70 * 1) * numero) * tempo;
				break;
			}

			case 2: {
				calc = ((0.65 * 2.5) * numero) * tempo;
				break;
			}

			case 3: {
				calc = ((0.75 * 4.5) * numero) * tempo;
				break;
			}
		}
		return calc;
	}


	public static double[] gastoMensalVetor() {
		double[] racaoGasto = new double[3];
		double[] values = {0.70, 0.65, 0.75};
		double[] diaGasto = {1, 2.5, 4.5};

		for(int i = 0; i != values.length; ++i) {
			racaoGasto[i] = (values[i] * diaGasto[i]) * 30;
 		}

 		return racaoGasto;
	}

	public static double[] sacasMensaisVetor() {
		double[] sacas = new double[3];
		double[] diaGasto = {1, 2.5, 4.5};

		for(int i = 0; i != 3; ++i) {
			sacas[i] = diaGasto[i] * 30;
		}
		return sacas;
	}

	public static void main(String[] args) {
		double[] racaoGasto = new double[3];
		double[] sacasMes = new double[3];

		System.out.println(valorDiaReais(2, 100));
		System.out.println(valorDiaKg(2, 100));
		System.out.println(valorTempoReais(2, 100, 30));

		System.out.println("--- GASTOS MES VETOR ----");

		racaoGasto = gastoMensalVetor();

		for(int i = 0; i != racaoGasto.length; ++i) {
			System.out.println(racaoGasto[i]);
		}

		System.out.println("--- SACAS MES ---");

		sacasMes = sacasMensaisVetor();

		for(int i = 0; i != sacasMes.length; ++i) {
			System.out.println(sacasMes[i]);
		}
	}
}