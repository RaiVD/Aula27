package Exercicio2;
// COMMITEI NOVAMENTE DEPOIS DO HORARIO PARA ACRESCENTAR O getCodigoDeBarras NOS MEUS METODOS!
public class Circulo extends Forma {
    protected float raio;
    public Circulo(float raio) {
        this.raio  = raio;
    }
    public float getRaio() {
        return raio;
    }
    public float calcularArea() {
        return (float) (Math.PI * getRaio()*getRaio());
    }
    public float calcularPerimetro() {
        return (float) (2 * Math.PI * getRaio());
    }
}
