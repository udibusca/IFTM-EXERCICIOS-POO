package lista_06_03_2018.ex6;

public class Gerente extends Funcionario {
    private double salario_base;

    public Gerente(String nome, String matricula, double salario_base) {
        super(salario_base, matricula, nome);
        this.salario_base = salario_base;
    }

    @Override
    public double calculaSalario(){
        return salario_base * 2;
    }
}
