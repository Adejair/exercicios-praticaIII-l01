import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner readScanner = new Scanner(System.in);
		int formaPagamento;

		Double valorCompra, valorTotal, descontos = 0.0;	

		System.out.println("Digite o valor da compra");
		valorCompra = readScanner.nextDouble();

		do {
			System.out.println("Escolha a forma de pagamento.\n 1 - Cheque\n 2- Dinheiro\n 3- Cartão");
			formaPagamento = readScanner.nextInt();
		} while(formaPagamento > 3 || formaPagamento < 1);

		valorTotal = valorCompra;
	
		switch(formaPagamento) {
			case 1: {
				System.out.println("Valor da Compra " + valorCompra);
				System.out.println("Descontos: " + 0);
				System.out.println("Valor Total: " + valorTotal);
				break;
			}

			case 2: {
				if(valorTotal <= 50) {
					descontos = 0.15;
				} else if(valorTotal >= 51 && valorTotal <= 100) {
					descontos = 0.20;
				} else if(valorTotal >= 101 && valorTotal <= 200) {
					descontos = 0.25;
				} else if(valorTotal > 200) {
					descontos = 0.30;
				}

				descontos *= valorCompra;
				valorTotal -= descontos;

				System.out.println("Valor da Compra " + valorCompra);
				System.out.println("Descontos: " + descontos);
				System.out.println("Valor Total: " + valorTotal);
				break;
			}

			case 3: {
				int quantidadeParcelas;

				do {
					System.out.println("Digite em quantas vezes deseja parcelar, (MAX: 3x)");
					quantidadeParcelas = readScanner.nextInt();	
				} while(quantidadeParcelas > 3 || quantidadeParcelas < 1);

				descontos = 0.10 * valorTotal;
				valorTotal -= descontos;

				System.out.println("Valor da Compra " + valorCompra);
				System.out.println("Descontos: " + descontos);
				System.out.println("Valor Total: " + valorTotal);
				System.out.println(quantidadeParcelas + "x de " + (valorTotal / quantidadeParcelas));
				break;
			}

		}
	}
}