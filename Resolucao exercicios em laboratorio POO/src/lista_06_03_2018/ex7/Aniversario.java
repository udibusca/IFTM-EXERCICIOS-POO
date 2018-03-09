package lista_06_03_2018.ex7;

public class Aniversario extends CartaoWeb {
    private String destinatario;

    public Aniversario(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Aniversário " + destinatario);
    }
}
