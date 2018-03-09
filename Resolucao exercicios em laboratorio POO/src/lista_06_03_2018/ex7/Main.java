package lista_06_03_2018.ex7;

public class Main {
    public static void main(String[] args) {
    	
        CartaoWeb c1 = new Natal("André");
        CartaoWeb c2 = new Aniversario("Natasha");
        CartaoWeb c3 = new DiaDosNamorados("Sandra");

        CartaoWeb cartoes[] = {c1, c2, c3};

        for (int i = 0; i < cartoes.length; i++) {
            cartoes[i].showMessage();
        }


    }

}
