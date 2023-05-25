package Exercicio1;

abstract class Venda {
    protected String nome;
    protected double preco;
    protected int codigoDeBarras;
    public Venda(String nome, double preco, int codigoDeBarras){
        this.nome=nome;
        this.preco=preco;
        this.codigoDeBarras=codigoDeBarras;
    }
    //Sobrescrita do metodo toString
    public String mostrarDetalhesDoItem(){
        return "\nCodigo de Barra: " + this.codigoDeBarras+
                "\nNome: " + this.nome +
                "\nPreco: " + this.preco;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }


}
