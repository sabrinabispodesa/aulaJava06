public class Agenda {

    private String nome;
    private String email;
    private int ddTelefone;
    private int telefone;


//    public Agenda(String nome, String email, int ddTelefone, int telefone){
//        this.nome = nome;
//        this.email = email;
//        this.ddTelefone = ddTelefone;
//        this.telefone=telefone;
//
//    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void characterNecessario() {
        if (email.toLowerCase().contains("@")) {
            System.out.println("Email válido!");
        } else {
            System.out.println("Email inválido! ");
            System.out.println("Digite e-mail novamente:");
        }
    }

    public int getDdTelefone() {
        return this.ddTelefone;
    }

    public void setDdTelefone(int ddTelefone) {
        this.ddTelefone = ddTelefone;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void mostrarInfo(){
        System.out.println("\n" + "________________________________Informações Cadastradas_______________________________________" + "\n");
        System.out.println("Nome: "+ getNome());
        System.out.println("E-mail: "+ getEmail());
        System.out.println("Número: "+ getDdTelefone() + getTelefone());
    }


}
