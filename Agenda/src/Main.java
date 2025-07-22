import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();


        System.out.println("\n" + "------- Cadastro de informações na agenda -------" + "\n");

        System.out.println("Digite o seu nome: ");
        agenda.setNome(scanner.next());

        System.out.println("Digite o seu email: ");
        agenda.setEmail(scanner.next());

        do {
            agenda.characterNecessario();
            agenda.setEmail(scanner.next());
        }while (agenda.getEmail().equalsIgnoreCase("@"));

        System.out.println("Digite o seu DD: ");
        agenda.setDdTelefone(scanner.nextInt());

        if (agenda.getDdTelefone() == 11) {
            System.out.println("\n"+ "O seu número é de São Paulo"+"\n");
        } else {
            System.out.println("Não é possível cadastrar número!");
            System.exit(agenda.getDdTelefone());

        }

        System.out.println("Digite o seu número sem DD");
        agenda.setTelefone(scanner.nextInt());


        agenda.mostrarInfo();




    }
}
