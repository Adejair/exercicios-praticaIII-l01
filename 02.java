import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner readScanner = new Scanner(System.in);

		System.out.println("Digite a quantidade de quilometros a serem percorridos");
		Double quilometros = readScanner.nextDouble();


		Double combustivelGasto, quantiaGasta;
		// Ele esta com o tanque vazio, logo eu assumo que ele tem que abastecer no minimo uma vez.
		int reabastencimentos = 1;

		combustivelGasto = quilometros / 12;
		reabastencimentos += (int)(combustivelGasto / 40);
		quantiaGasta = 3.70 * combustivelGasto;

		System.out.println(combustivelGasto + " " + reabastencimentos + " $" + quantiaGasta);
	}
}