package Exercicio1;

public class Loja {


    public static void main(String[] args) {
        Venda venda[] = new Venda[7];

        venda[0] = new Livro("Dezesseis Luas", 52.00, "Kami Garcia", 123456);
        venda[1] = new CDs("Barbie", 22.00, 60, 12345676);
        venda[2] = new CDs("Banda Djavu", 15.00, 25, 12345678);
        venda[3] = new Livro("Para todos garotos que ja amei", 65.00, "Jenny Han", 123458765);
        venda[4] = new DVDs("Calypso", 15.00, 12, 12345676);

        venda[5] = new Livro("Para todos garotos que ja amei", 65.00, "Jenny Han", 123458765);
        venda[6] = new Livro("Para todos garotos que ja amei", 65.00, "Jenny Han", 123998765);

        for (Venda vendas : venda) {
            System.out.println("_______________________________________________________");
            System.out.println(vendas.mostrarDetalhesDoItem());
        }

        System.out.println("_______________________________________________________");
        System.out.println("Comparação 1: "+venda[3].equals(venda[5]));
        System.out.println("Comparação 2: "+venda[4].equals(venda[2]));

        int i = 0;

        for (Venda vendas : venda) {
            if (vendas.nome.equals("Barbie")) {
                System.out.println("_______________________________________________________");
                System.out.println("Produto encontrado posição: " + (i + 1));
                break;
            }
            if(i == venda.length-1){
                System.out.println("Produto não encontrado.");
            }
            i++;
        }

    }
}
