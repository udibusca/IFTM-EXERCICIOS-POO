package lista_06_03_2018.ex6;

public class Assistente extends Funcionario {
    public Assistente(String nome, String matricula, double salario_base) {
        super(salario_base, matricula, nome);
    }

    @Override
    public double calculaSalario(){
        return getSalario_base();
    }
}
