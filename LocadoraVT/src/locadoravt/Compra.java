package locadoravt;

import java.util.Calendar;

/**
 *
 * @author gabrielrigolon
 */
public class Compra 
{
    Cliente cliente;
    Produto produto;
    Calendar dataCompra = Calendar.getInstance();

    public Compra(Calendar dataCompra, Produto produto ,Cliente cliente) 
    {   
        this.dataCompra = dataCompra;
        this.produto = produto;
        this.cliente = cliente;
        
    }
    
    String emitirNota()
    {
        String str = "";
        str += "Nome do cliente: " + cliente.nome + " " + cliente.sobrenome;
        str += "CPF: " + cliente.cpf;
        str += produto.toString();
        str += "Valor total: " + calcularValorTotal();
        
        return str;
    }
    
    float calcularValorTotal()
    {
        float valorTotal = 0;
        valorTotal += produto.preco;
       
        return valorTotal;
        
    }
    
    
}