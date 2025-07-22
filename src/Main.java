public class Aula06 {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Sabrina", 10, "Professora");
        //String brohibitted = pessoa.letraProibida();
        
         // System.out.println(brohibitted);
        
         
     
        
        System.out.println(" " + "O nome é " + pessoa.getNome() + "\n " +  "A idade é " + pessoa.getIdade() + "\n " + "A profissão é " + pessoa.getProfissao()+ "\n ");
        
        pessoa.idadeErrada();
        pessoa.letraProibida();
        pessoa.temIdade();

    }
    
    
    
    

    
}
