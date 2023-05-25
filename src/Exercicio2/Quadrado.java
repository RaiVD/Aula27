package Exercicio2;

public class Quadrado extends Retangulo {
    public Quadrado(float lado) {
        super(lado);
    }

    public float calcularArea() {
        return 2 * lado ;
    }

    public float calcularPerimetro() {
        return 2*(2*lado);
    }
}
