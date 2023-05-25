package Exercicio1;

public class CDs extends Venda{
    public int duracao;
    public CDs(String nome, double preco, int duracao, int codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.duracao=duracao;
    }
    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public String mostrarDetalhesDoItem(){
        return "\nCodigo de Barra: " + this.codigoDeBarras+
                "\nNome: " + this.nome +
                "\nPreco: " + this.preco+
                "\nDuração: " + this.duracao;
    }
}
