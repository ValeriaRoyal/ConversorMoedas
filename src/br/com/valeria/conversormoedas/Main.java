package br.com.valeria.conversormoedas;

import br.com.valeria.conversormoedas.service.ConversorService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("🔐 Digite sua API Key: ");
        String apiKey = scanner.nextLine();

        ConversorService service = new ConversorService(apiKey);

        while (true) {
            System.out.println("\n=== Conversor de Moedas ===");
            System.out.println("1 - Real para Dólar");
            System.out.println("2 - Dólar para Real");
            System.out.println("3 - Euro para Real");
            System.out.println("4 - Real para Euro");
            System.out.println("5 - Libra para Dólar");
            System.out.println("6 - Dólar para Peso Mexicano");
            System.out.println("0 - Sair");
            System.out.print("Escolha a opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) break;
            if (opcao < 0 || opcao > 6) {
                System.out.println("❗ Opção inválida. Tente novamente.");
                continue;
            }

            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();

            try {
                switch (opcao) {
                    case 1 -> System.out.printf("💰 Resultado: %.2f USD%n", service.converter("BRL", "USD", valor));
                    case 2 -> System.out.printf("💰 Resultado: %.2f BRL%n", service.converter("USD", "BRL", valor));
                    case 3 -> System.out.printf("💰 Resultado: %.2f BRL%n", service.converter("EUR", "BRL", valor));
                    case 4 -> System.out.printf("💰 Resultado: %.2f EUR%n", service.converter("BRL", "EUR", valor));
                    case 5 -> System.out.printf("💰 Resultado: %.2f USD%n", service.converter("GBP", "USD", valor));
                    case 6 -> System.out.printf("💰 Resultado: %.2f MXN%n", service.converter("USD", "MXN", valor));
                }
            } catch (Exception e) {
                System.out.println("❌ Erro na conversão: " + e.getMessage());
                System.out.println("Verifique sua conexão com a internet ou a validade da API Key.");
            }
        }

        System.out.println("👋 Até mais!");
        scanner.close();
    }
}