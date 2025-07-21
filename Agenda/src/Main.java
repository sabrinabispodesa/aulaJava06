
public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.setNome("Sabrina");
        agenda.setEmail("sabrinabispodesa@gmail.com");
        agenda.setDdTelefone(11);
        agenda.setTelefone(917320837);
        System.out.println("\n" + agenda.getNome() + "\n" + agenda.getEmail() + "\n" + agenda.getDdTelefone() + " " + agenda.getTelefone());




    }
}