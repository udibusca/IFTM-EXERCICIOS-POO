package lista.exercicios.ocp.violation;

public class ManipuladorDeEventos {

    private Veiculo veiculo;

    public ManipuladorDeEventos(final Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void mudarModoDirecao(final ModoDirecao modoDirecao){
        switch (modoDirecao){
            case ESPORTE:
                veiculo.setPotencia(500);
                veiculo.setAlturaSuspencao(10);
                break;
            case PASSEIO:
                veiculo.setPotencia(400);
                veiculo.setAlturaSuspencao(20);
                break;
            default:
                veiculo.setPotencia(400);
                veiculo.setAlturaSuspencao(20);
                break;
            // para adicionar outro modo de dire��o, precisamos adicionar outro modo (exemplo ECONOMICO) duas classes ser�o alteradas ModoDirecao e ManipuladorDeEventos
        }
    }
}
