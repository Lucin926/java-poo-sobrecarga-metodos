package Aula14;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido();
        double doisitens = p1.calculartotal(12.0, 10.0);
        double tresitens = p1.calculartotal(12.0, 10.0, 8.0);

        System.out.println("Pedido com 2 itens: " + doisitens);
        System.out.println("Pedido com 3 itens: " + tresitens);

    }
}
