
package dsm.fatec;

import static dsm.fatec.Nivel.BAIXO;
import static dsm.fatec.Nivel.VAZIO;

public class StatusLuz implements ILuz {

    private CorLuz cor;
    
    public CorLuz getCor() {
        return cor;
    }

    public void setCor(CorLuz cor) {
        this.cor = cor;
    }
    
    @Override
    public void atualizarStatus(Nivel nivel) {

        if (null == nivel) {
            cor = CorLuz.VERDE;
        } else cor = switch (nivel) {
            case VAZIO -> CorLuz.VERMELHO;
            case BAIXO -> CorLuz.AMARELO;
            default -> CorLuz.VERDE;
        };
    }

    @Override
    public void mostrarCor() {
        System.out.println("Status da luz: " + cor);
    }
}