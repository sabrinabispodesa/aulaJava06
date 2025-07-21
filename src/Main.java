public class Main {
    public static void main(String[] args) {
 //   Scanner scanner =  new Scanner(System.in);
        //
        Pessoa p1 = new Pessoa();
        p1.setNome("ana");
        p1.setIdade(25);
        //
        Pessoa p2= new Pessoa();
        p2.setNome("Minoru");
        p2.setIdade(25);

       Pessoa p3= new Pessoa();
       p3.setNome("Sabrina");
       p3.setIdade(25);
       p3.setProfissao("Professora");

        //




        //
        System.out.println("Nome: " + p1.getNome()+ "\n");
        System.out.println("Idade: " + p1.getIdade()+"\n");
        System.out.println("Nome: " + p2.getNome()+"\n");
        System.out.println("Idade: " + p2.getIdade()+"\n");
        System.out.println("Nome: " + p3.getNome()+"\n");
        System.out.println("Idade: " + p3.getIdade()+"\n");
        System.out.println("Profissão:" + p3.getProfissao() );
    }
}