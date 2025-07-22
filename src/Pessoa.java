
public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;
    
    // Constructor is a way of defining  an object and give values to the proporties of that object.
    
    public Pessoa(String nome, int idade, String professora){
        this.nome = nome;
        this.idade = idade;
        this.profissao = professora;
    
    }
    
    
    public String getNome(){
    return this.nome;
    }
    
    public void setNome(String nome){
    this.nome = nome; 
    }
    
     public int getIdade(){
    return this.idade;
    }
    
    public void setIdade(int idade){
    this.idade = idade; 
    }
    
     
    public String getProfissao(){
    return this.profissao;
    }
    
    public void setProfissao(String profissao){
    this.profissao = profissao; 
    }
    
    public String letraProibida(){
    if(nome.toLowerCase().contains("y")){
        System.out.println("Nome inválido (contém letra 'y').");
        return null;
    } 
        return nome;
    } 
    
    public int idadeErrada(){
    if (getIdade() >=18){
        System.out.println("Idade válida");    
    }else {
        System.out.println("Idade Inválida");     
    } return getIdade();
       
}
    public String temIdade(){
    if(getIdade() >=18){
        System.out.println("Tem profissão");
    }else{
        System.out.println("Não tem profissão");
        
        return null;
    }
        return profissao;
    }
}

