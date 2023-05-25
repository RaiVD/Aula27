package Exercicio2;

public class Circulo extends Forma {
    protected float raio;
    public Circulo(float raio) {
        this.raio  = raio;
    }

    public float calcularArea() {
        return (float) (Math.PI * (raio)*2);
    }

    public float calcularPerimetro() {
        return (float) (2 * Math.PI * raio);
    }


}
