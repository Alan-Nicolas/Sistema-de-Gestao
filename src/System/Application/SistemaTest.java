package System.Application;

import System.Dominio.Desenvolvedor;

public class SistemaTest {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Dario", 2400.00, "Back - end");
        System.out.println(desenvolvedor);
        double result = desenvolvedor.hrExtra();

        System.out.println(result);
    }
}
