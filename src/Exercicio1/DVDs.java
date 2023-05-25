package Exercicio1;

public class DVDs extends Venda{
    public int faixas;
    public DVDs(String nome, double preco, int faixas, int codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.faixas=faixas;
    }
    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }
    public String mostrarDetalhesDoItem(){
        return "\nCodigo de Barra: " + this.codigoDeBarras+
                "\nNome: " + this.nome +
                "\nPreco: " + this.preco+
                "\nNumero de faixas: " + this.faixas;
    }
}
