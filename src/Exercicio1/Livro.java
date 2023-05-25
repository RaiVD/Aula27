package Exercicio1;

public class Livro extends Venda {
    public String autor;
    public Livro(String nome, double preco, String autor, int codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.autor=autor;
    }
    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }
    public String mostrarDetalhesDoItem(){
        return "\nCodigo de Barra: " + this.codigoDeBarras+
                "\nNome: " + this.nome +
                "\nPreco: " + this.preco+
                "\nAutor: " + this.autor;
    }
}
