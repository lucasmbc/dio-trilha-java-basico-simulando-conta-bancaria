package com.lucasmbc.contaBanco;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.print("Por favor, digite o número da conta: ");
		int numero = obterEntradaInteira(scanner);

		System.out.print("Por favor, digite o número da agência: ");
		String agencia = scanner.nextLine();

		System.out.print("Por favor, digite o nome do cliente: ");
		String nome = scanner.nextLine();

		double saldo = 237.48;

		exibirMensagemBoasVindas(nome, agencia, numero, saldo);

		scanner.close();
	}

	private static int obterEntradaInteira(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			System.out.print("Entrada inválida. Por favor, digite um número válido: ");
			scanner.next();
		}
		int numero = scanner.nextInt();
		scanner.nextLine();
		return numero;
	}

	private static void exibirMensagemBoasVindas(String nome, String agencia, int numero, double saldo) {
		System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco!%n", nome);
		System.out.printf("Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", agencia, numero, saldo);
	
	}

}
