import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoAgenciaMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Banco banco = new Banco();

        System.out.print("Digite o número do banco: ");
        banco.setNumero(scanner.nextInt());
        scanner.nextLine(); 

        System.out.print("Digite o nome do banco: ");
        banco.setNome(scanner.nextLine());

        List<Agencia> listaAgencias = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            Agencia agencia = new Agencia();

            System.out.println("\nAgência " + i);

            System.out.print("Número da agência: ");
            agencia.setNumero(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Nome da agência: ");
            agencia.setNome(scanner.nextLine());

            listaAgencias.add(agencia);
        }

        banco.setAgencias(listaAgencias);

        System.out.println("\n===== DADOS DO BANCO =====");
        System.out.println("Número: " + banco.getNumero());
        System.out.println("Nome: " + banco.getNome());

        System.out.println("\nAgências cadastradas:");
        for (Agencia ag : banco.getAgencias()) {
            System.out.println("Número: " + ag.getNumero()
                    + " | Nome: " + ag.getNome());
        }

        scanner.close();
    }
}