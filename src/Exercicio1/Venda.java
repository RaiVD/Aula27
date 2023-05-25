package Exercicio1;
import java.util.Objects;

// COMMITEI NOVAMENTE DEPOIS DO HORARIO PARA ACRESCENTAR O getCodigoDeBarras NOS MEUS METODOS!

abstract class Venda {
    protected String nome;
    protected double preco;
    protected int codigoDeBarras;
    public Venda(String nome, double preco, int codigoDeBarras){
        this.nome=nome;
        this.preco=preco;
        this.codigoDeBarras=codigoDeBarras;
    }
    //Sobrescrita do metodo mostrarDetalhesDoItem
    public String mostrarDetalhesDoItem(){
        return "\nCodigo de Barra: " + this.codigoDeBarras+
                "\nNome: " + this.nome +
                "\nPreco: " + this.preco;
    }
    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venda venda)) return false;
        return getCodigoDeBarras() == venda.codigoDeBarras;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDeBarras);
    }
}
