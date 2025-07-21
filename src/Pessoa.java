
public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    // Getter do nome
//    public String getNome() {
//        // return nome;
//    }

    public String getNome() {
        if (nome.toLowerCase().contains("y")) {
            System.out.println("Nome inválido (contém a letra 'y').");
            return null;
        }
        return nome;
    }

    // Setter do nome
    public void setNome(String nome) {
        // nome = nome
        this.nome = nome;
    }

    // Getter da idade
    public int getIdade() {
        return idade;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;

    }

    public String getProfissao(){
        if(getIdade() <=16){
            System.out.println("Não tem profissão");
        }else {
        }  return profissao;
    }



    // Setter da idade
    public void setIdade(int idade) {
        if (idade >= 25) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }

        }
    }
