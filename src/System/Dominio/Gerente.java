package System.Dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, Double salario, String cargo) {
        super(nome, salario, cargo);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.3;
    }
}
