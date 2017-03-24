import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner readScanner = new Scanner(System.in);

		int contadorHomens = -1, contadorMulheres = -1;
		Double acumuladorIdadeHomens = 0.0, acumuladorIdadeMulheres = 0.0;

		Double idadeMedia, idadeMediaMulheres, idadeMediaHomens;

		Double varianciaH = 0.0, varianciaM = 0.0, varianciaT = 0.0;

		int[] idadeHomem = new int[20];
		int[] idadeMulher = new int[20];


		int idade;
		char sexo;

		for(int i = 0; i != 20; ++i) {
			System.out.println("Digite a idade");
			idade = readScanner.nextInt();

			System.out.println("m ou f");
			sexo = readScanner.next().charAt(0);

			if(sexo == 'm') {
				acumuladorIdadeHomens += idade; 
				idadeHomem[++contadorHomens] = idade;
			} else if(sexo == 'f') {
				acumuladorIdadeMulheres += idade;
				idadeMulher[++contadorMulheres] = idade;
			}
		}

		idadeMedia = (acumuladorIdadeMulheres + acumuladorIdadeHomens) / 20;
		idadeMediaHomens = (acumuladorIdadeHomens / contadorHomens);
		idadeMediaMulheres = (acumuladorIdadeMulheres / contadorMulheres);

		System.out.println(idadeMedia);
		System.out.println(idadeMediaHomens);
		System.out.println(idadeMediaMulheres);


		for(int i = 0; i != contadorHomens; ++i) {
			varianciaH += (idadeHomem[i] - idadeMediaHomens) * (idadeHomem[i] - idadeMediaHomens);
		}

		for(int i = 0; i != contadorMulheres; ++i) {
			varianciaM += (idadeMulher[i] - idadeMediaMulheres) * (idadeMulher[i] - idadeMediaMulheres);
		}

		varianciaH /= contadorHomens;
		varianciaM /= contadorMulheres;

		varianciaT = (varianciaH + varianciaM) / 20;

		System.out.println(varianciaH);
		System.out.println(varianciaM);
		System.out.println(varianciaT);
	}
}