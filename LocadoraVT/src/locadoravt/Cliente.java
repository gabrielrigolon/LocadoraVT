package locadoravt;

import java.util.Scanner;




public class Cliente {
    
    String cpf;
    String nome;
    String sobrenome;
    String endereco;
    String telefone;
    String email;
    String senha;
    double renda;

    
    Scanner scan = new Scanner(System.in);
    
    @Override
    public String toString() {
        String str = "";
        
        str += "Cliente:";
        str += "\nCPF = " + cpf;
        str += "\nNome = " + nome; 
        str += "\nSobrenome = " + sobrenome; 
        str += "\nEndereço = " + endereco;
        str += "\nTelefone = " + telefone;
        str += "\nE-mail = " + email;
        str += "\nSenha = " + senha;
        str += "\nRenda = " + renda;
        
        return str;
    }

    
    
    public Cliente() {
        
        System.out.println("Digite o seu nome: ");
        this.nome = scan.nextLine().toUpperCase();
        
        System.out.println("Digite o seu sobrenome: ");
        this.sobrenome = scan.nextLine().toUpperCase();
        
        System.out.println("Digite o seu endereço: "); 
        this.endereco = scan.nextLine();
        
        System.out.println("Digite o seu telefone: ");
        this.telefone = scan.nextLine();
        
        
        System.out.println("Digite o seu e-mail: ");
        this.email = scan.nextLine().toUpperCase();
        while (this.validaEmail(this.email) == false)
        {
            System.out.println("Este e-mail não é valido. Por favor, digite novamente: ");
            this.email = scan.nextLine().toUpperCase();
            
        }
        
        System.out.println("Informe sua senha: ");
        this.senha = scan.nextLine();
        while (this.validaSenha(this.senha)== false)
        {
            System.out.println("A senha deve conter exatamente 6 caracteres. Por favor, tente novamente:");
            this.senha = scan.nextLine();
        }
        
        System.out.println("Digite sua renda: ");
        this.renda = scan.nextDouble();
    }
    
   
    boolean validaSenha(String s){
        if(s.length() != 6){
            
            return false;
            
        } else {
            
            return true;
            
        }
    }

    boolean validaEmail(String s) {
        if ( s.contains("@") && s.endsWith(".COM") || s.endsWith(".BR")) {
            return true;
            
        } 
        else {
            
            return false;
        }
    }
    
    boolean autenticar(String em, String s) {
        if (em.toUpperCase().equals(this.email) && s.equals(this.senha))
        {
            return true;
        }
        else 
        {
            return false;
        }        
    }
    
    void exibir(boolean valido)
    {
        valido = this.autenticar(nome, senha);
        if (valido == true)
        {
            System.out.println("Bem-vindo Sr. "+this.nome+" "+this.sobrenome);
        }
        else
        {
            System.out.println("Login Invalido");
        }
    }

    
    
}
