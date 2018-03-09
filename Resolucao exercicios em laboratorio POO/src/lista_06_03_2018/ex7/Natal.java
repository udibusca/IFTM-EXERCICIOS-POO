package lista_06_03_2018.ex7;

public class Natal extends CartaoWeb {
    private String destinatario;

    public Natal(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Natal " + destinatario);
    }
}
