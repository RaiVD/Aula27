package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Forma forma[]=new Forma[5];

        forma[0]=new Circulo(12);
        forma[1]=new Retangulo(9,4);
        forma[2]=new Retangulo(13,17);
        forma[3]=new Quadrado(45);
        forma[4]=new Quadrado(3);

        for(Forma forma1: forma){
            System.out.println(forma1.calcularArea());
            System.out.println(forma1.calcularPerimetro()+"\n");
        }

    }
}
