package Exercicio2;
// COMMITEI NOVAMENTE DEPOIS DO HORARIO PARA ACRESCENTAR O getCodigoDeBarras NOS MEUS METODOS!
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

    public float getLado() {
        return lado;
    }

    public float getAltura() {
        return altura;
    }

    public float calcularArea() {
        return getAltura() * getLado();
    }
    public float calcularPerimetro() {
        return 2*(getAltura()*getLado());
    }

}
