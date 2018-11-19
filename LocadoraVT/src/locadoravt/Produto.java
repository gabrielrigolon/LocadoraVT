package locadoravt;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author gabrielrigolon
 */
public class Produto 
{
    int codigoProduto;
    String nome;
    String modelo;
    String marca;
    String lote;
    double preco;
    int quantidade;
    int dia;
    int mes;
    int ano;
    Scanner scan = new Scanner(System.in);
    Calendar dataValidade = Calendar.getInstance();
    Produto()
    {
        System.out.println("Digite o código do produto: "); 
        this.codigoProduto = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Digite o nome do produto: ");
        this.nome = scan.nextLine();
        
        System.out.println("Digite o modelo do produto: ");
        this.modelo = scan.nextLine();
        
        System.out.println("Digite a marca do produto: ");
        this.marca = scan.nextLine();
        
        System.out.println("Digite o dia da validade: ");
        this.dia = scan.nextInt();
        
        System.out.println("Digite o mês da validade: ");
        this.mes = scan.nextInt();
        
        System.out.println("Digite o ano da validade: ");
        this.ano = scan.nextInt();
        
        dataValidade.set(dia, mes, ano);
        
        System.out.println("Digite o lote do produto: ");
        this.lote = scan.nextLine();
        
        System.out.println("Digite o preço do produto: ");
        this.preco = scan.nextDouble();
        
        System.out.println("Digite a quantidade do produto: ");
        this.quantidade = scan.nextInt();
        
    }
    int calcularValidade()
    {
        Calendar dataAtual = Calendar.getInstance();
        dataAtual.set(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH);
        long milissegundos = dataValidade.getTimeInMillis()-dataAtual.getTimeInMillis();
        int hora = (int)(milissegundos/1000/60/60);
        int fimValidade = hora/24;
        return fimValidade;  
    }

    @Override
    public String toString() 
    {
        String str = "";
        str += "Produto: "; 
        str += "\nCodigo do Produto=" + codigoProduto;
        str += "\nNome=" + nome;
        str += "\nModelo=" + modelo;
        str += "\nMarca=" + marca;
        str += "\nPreco=" + preco;
        
        return str;
    }
}

