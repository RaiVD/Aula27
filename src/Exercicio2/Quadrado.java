package Exercicio2;
// COMMITEI NOVAMENTE DEPOIS DO HORARIO PARA ACRESCENTAR O getCodigoDeBarras NOS MEUS METODOS!
public class Quadrado extends Retangulo {
    public Quadrado(float lado) {
        super(lado);
    }
    public float getlado() {
        return super.getLado();
    }
    public float calcularArea() {
        return 2 * getlado() ;
    }
    public float calcularPerimetro() {
        return 2*(2*getlado());
    }
}
