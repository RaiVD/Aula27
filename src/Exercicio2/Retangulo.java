package Exercicio2;


public class Retangulo extends Forma{
    protected float lado;
    protected float altura;
    public Retangulo(float lado) {
        this.lado = lado;
    }
    public Retangulo(float altura, float lado) {
        this.altura = altura;
        this.lado  = lado;
    }

    public float calcularArea() {
        return altura * lado;
    }
    public float calcularPerimetro() {
        return 2*(altura*lado);
    }

}
