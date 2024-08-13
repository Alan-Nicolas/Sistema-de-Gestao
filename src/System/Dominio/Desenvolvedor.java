package System.Dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, Double salario, String cargo) {
        super(nome, salario, cargo);
    }

    @Override
    public double hrExtra() {
        double Extra = 0.9;
        return getSalario() * Extra;
    }
}
