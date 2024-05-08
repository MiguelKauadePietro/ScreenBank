import java.util.Scanner;

public class ScreenBank {

    public static void main(String[] args) {
        Scanner lendoDados = new Scanner(System.in);

        boolean op = false;

        System.out.println("Insira seu nome: ");
        String Nome = lendoDados.nextLine();
        System.out.println("Insira o tipo da conta: ");
        String TipoConta = lendoDados.nextLine();


        double Saldo = 2500.00;

        System.out.println("""
                ***************************************
                Nome:               %s
                Tipo da Conta:      %s
                Saldo inicial:      R$ %.2f
                ***************************************
                
                
                
                Operações 
                
                1- Consultar saldo
                2- Receber Valor
                3- Transferir Valor
                4- Sair
                
                """.formatted(Nome, TipoConta, Saldo));

        while (!op){

            System.out.println("Insira o número da operação que você deseja realizar");
            int numOp = lendoDados.nextInt();

            switch (numOp){
                case 1:
                    System.out.println(String.format("O saldo atual é de: %.2f", Saldo));
                    break;
                case 2:
                    System.out.println("Informe o valor que será recebido: ");
                    double valorRecebido = lendoDados.nextDouble();
                    Saldo += valorRecebido;
                    System.out.println(String.format("Saldo atualizado: %.2f", Saldo));
                    break;
                case 3:
                    System.out.println("Informe o valor a ser transferido: ");
                    double valorTransferido = lendoDados.nextDouble();
                    if(valorTransferido > Saldo){
                        System.out.println("Saldo insuficiente para essa transferência!");
                    }else{
                        Saldo -= valorTransferido;
                        System.out.println(String.format("Saldo atualizado: %.2f", Saldo));
                    }
                    break;
                case 4:
                    op = true;
                    break;
                default:
                    System.out.println("Operação inválida!");
                    break;
            }
        }
    }
}