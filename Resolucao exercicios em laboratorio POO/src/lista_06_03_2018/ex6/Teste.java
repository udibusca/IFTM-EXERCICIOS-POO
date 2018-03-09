package lista_06_03_2018.ex6;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args){

    	ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
        Gerente g1 = new Gerente("Gerente", "1", 1500);
        Assistente a1 = new Assistente("Assistente", "2", 1000);
        Vendedor v1 = new Vendedor("Vendedor", "3", 500, 500);


        System.out.println("O "+g1.getNome()+" Recebeu "+g1.calculaSalario());
        System.out.println("O "+a1.getNome()+" Recebeu "+a1.calculaSalario());
        System.out.println("O "+v1.getNome()+" Recebeu "+g1.calculaSalario());


    }
}
