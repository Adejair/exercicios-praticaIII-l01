import java.util.Scanner;
import java.util.Random;

class App {
	public static void main(String[] args) {
		Scanner readScanner = new Scanner(System.in);
		Random random = new Random();

		int valorAleartorio = random.nextInt((100 - 1) + 1) + 1;
		int palpite, tentativas = 0, opt;

		// vai rolar fazer casting dps n
		Double tentativasContador = 1.0, acertos = 0.0, derrotas = 0.0;

		Double porcentagemDerrota, porcentagemAcerto;

		while(true) {
			System.out.println(valorAleartorio);

			palpite = readScanner.nextInt();
			++tentativas;

			if(palpite == valorAleartorio) {
				System.out.println("Você ganhou !!");
				++acertos;
				do {
					System.out.println("1 - Reniciar o Jogo");
					System.out.println("2 - Terminar o Jogo");
					opt = readScanner.nextInt();
				} while(opt > 2 || opt < 1);

				if(opt == 1) {
					System.out.println(valorAleartorio);
					valorAleartorio = random.nextInt((100 - 1) + 1) + 1;
					tentativas = 0;
					++tentativasContador;
				} else {
					porcentagemDerrota = (derrotas / tentativasContador) * 100.0;
					porcentagemAcerto = (acertos / tentativasContador) * 100.0;

					System.out.println(porcentagemDerrota);
					System.out.println(porcentagemAcerto);
					break;
				}
			} else if(palpite > valorAleartorio) {
				System.out.println("Tente um valor menor");
			} else {
				System.out.println("Tente um valor maior");
			}

			if(tentativas == 5 && palpite != valorAleartorio) {
				System.out.println("Computador ganhou");
				++derrotas;

				do {
					System.out.println("1 - Reniciar o Jogo");
					System.out.println("2 - Terminar o Jogo");
					opt = readScanner.nextInt();
				} while(opt > 2 || opt < 1);

				if(opt == 1) {
					System.out.println(valorAleartorio);
					valorAleartorio = random.nextInt((100 - 1) + 1) + 1;
					tentativas = 0;
					++tentativasContador;
				} else {
					porcentagemDerrota = (derrotas / tentativasContador) * 100.0;
					porcentagemAcerto = (acertos / tentativasContador) * 100.0;

					System.out.println(porcentagemDerrota);
					System.out.println(porcentagemAcerto);
					break;
				}
			}
		}
	}
}

