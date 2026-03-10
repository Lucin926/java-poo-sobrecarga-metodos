package Aula14;

public class Pedido {
    // Lanche e bebida
    double calculartotal(double lanche, double bebida) {
        return lanche + bebida;
    }

    // Lanche, bebida, sobremesa
    double calculartotal(double lanche, double bebida, double sobremesa) {
        return lanche + bebida + sobremesa;
    }
}
