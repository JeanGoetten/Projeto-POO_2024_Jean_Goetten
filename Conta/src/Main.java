import java.util.*;

public class Main {
    static int id = 0;
    public static void main(String[] args) {
        System.out.println(" ============ Banco Digital ============ ");

        List<Conta> contas = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        boolean liveStart = true;
        while (liveStart) {
            System.out.println("1 - Abrir conta; 2 - Verificar saldo; 3 - Sacar; 4 - Depositar; 5 - Sair: ");
            int optStart = scan.nextInt();

            switch (optStart) {
                case 1:
                    //criar
                    Conta novaConta = new Conta();
                    System.out.println("Insira seu nome para a nova conta: ");
                    novaConta.SetNome(scan.next());

                    System.out.println("Faça seu depósito inicial: ");
                    novaConta.SetSaldo(scan.nextFloat());

                    novaConta.SetNumero(id);
                    contas.add(id, novaConta);
                    System.out.println("Conta de número " + novaConta.GetNumero() + " criada para cliente " + novaConta.GetNome());
                    id++;
                    break;
                case 2:
                    //saldo
                    System.out.println("Informe o número da conta: ");
                    int numero = scan.nextInt();
                    int iSaldo = 0;
                    for(iSaldo = 0; iSaldo < contas.size(); iSaldo++){
                        if(contas.get(iSaldo).GetNumero() == numero){
                            System.out.println("O saldo para a conta " + contas.get(iSaldo).GetNumero() +
                                                " de propriedade de " + contas.get(iSaldo).GetNome() +
                                                " é de: " + contas.get(iSaldo).GetSaldo());
                            break;
                        }
                    }
                    if(iSaldo > contas.size() - 1){
                        System.out.println("Conta não encontrada...");
                    }
                    break;
                case 3:
                    //sacar
                    System.out.println("Informe o número da conta: ");
                    int numeroSaque = scan.nextInt();
                    int iSaque = 0;
                    for(iSaque = 0; iSaque < contas.size(); iSaque++){
                        if(contas.get(iSaque).GetNumero() == numeroSaque){
                            System.out.println("Informe o valor para saque: ");
                            if(contas.get(iSaque).Sacar(scan.nextFloat())){
                                System.out.println("Saque realizado com sucesso! O saldo para a conta " + contas.get(iSaque).GetNumero() +
                                        " de propriedade de " + contas.get(iSaque).GetNome() +
                                        " é de: " + contas.get(iSaque).GetSaldo());
                            }else{
                                System.out.println("Transação inválida! O saldo para a conta " + contas.get(iSaque).GetNumero() +
                                        " de propriedade de " + contas.get(iSaque).GetNome() +
                                        " é de: " + contas.get(iSaque).GetSaldo());
                            }
                            break;
                        }
                    }
                    if(iSaque > contas.size() - 1){
                        System.out.println("Conta não encontrada...");
                    }
                    break;
                case 4:
                    //depositar
                    System.out.println("Informe o número da conta: ");
                    int numeroDeposito = scan.nextInt();
                    int iDeposito = 0;
                    for(iDeposito = 0; iDeposito < contas.size(); iDeposito++){
                        if(contas.get(iDeposito).GetNumero() == numeroDeposito){
                            System.out.println("Informe o valor para depósito: ");
                            contas.get(iDeposito).Depositar(scan.nextFloat());
                            System.out.println("Depósito realizado com sucesso! O saldo para a conta " + contas.get(iDeposito).GetNumero() +
                                    " de propriedade de " + contas.get(iDeposito).GetNome() +
                                    " é de: " + contas.get(iDeposito).GetSaldo());
                            break;
                        }
                    }
                    if(iDeposito > contas.size() - 1){
                        System.out.println("Conta não encontrada...");
                    }
                    break;
                default:
                    liveStart = false;
            }

        }
    }
}