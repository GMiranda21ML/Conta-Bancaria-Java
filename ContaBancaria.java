import java.util.Scanner;
import java.util.Locale;

public class ContaBancaria {
    public static void main(String[] args) {

        String nome = "Gabriel Miranda";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;

        System.out.println("""
                
                █▄▄ █▀▀ █▀▄▀█ ▄▄ █░█ █ █▄░█ █▀▄ █▀█ ▄▀ ▄▀█ ▀▄
                █▄█ ██▄ █░▀░█ ░░ ▀▄▀ █ █░▀█ █▄▀ █▄█ ▀▄ █▀█ ▄▀
                """);



        System.out.println("***************************************");
        System.out.println("Dados inicias do cliente: \n");

        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Tipo da conta: %s\n", tipoConta);
        System.out.printf("Saldo inicial: R$%.2f\n", saldoInicial);
        System.out.println("***************************************");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldoAtual = saldoInicial;

        while (true) {
            System.out.println("""
                    Operações
                                        
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """);

            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual é RS%.2f\n", saldoAtual);

                    break;
                case 2:
                    System.out.print("Informe o valor a receber: ");
                    double receberValor = scanner.nextDouble();
                    saldoAtual += receberValor;
                    System.out.printf("Saldo atualizado: R$%.2f\n", saldoAtual);

                    break;
                case 3:
                    System.out.print("Informe o valor que deseja transferir: ");
                    double transferirValor = scanner.nextDouble();
                    if (saldoAtual >= transferirValor) {
                        saldoAtual -= transferirValor;
                        System.out.printf("Saldo atualizado: R$%.2f\n", saldoAtual);
                    } else {
                        System.out.println("Impossível fazer essa transferência, saldo insuficiente!\n");
                    }

                    break;
                case 4:
                    System.out.println("Saindo do programa...");

                    return;
                default:
                    System.out.println("Opção invalida, tente novamente");

                    break;
            }
        }

    }
}
