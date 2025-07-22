public class Agenda {

    private String nome;
    private String email;
    private int ddTelefone;
    private int telefone;

    public Agenda(String nome, String email, int ddTelefone, int telefone){
        this.nome = nome;
        this.email = email;
        this.ddTelefone = ddTelefone;
        this.telefone=telefone;

    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getDdTelefone(){
        return this.ddTelefone;
    }

    public void setDdTelefone(int ddTelefone){
        this.ddTelefone = ddTelefone;
    }

    public int getTelefone(){
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    }

