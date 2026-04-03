
package dsm.fatec;

import java.util.ArrayList;
import java.util.List;

public class MaquinaDeCafe implements IMaquinaCafe {

    private List<Sabor> sabores;
    private StatusLuz luz;
    private Sabor saborSelecionado;

    public MaquinaDeCafe(String nome) {
        this.sabores = new ArrayList<>();
        this.luz = new StatusLuz();
    }

    // MÉTODO CORRIGIDO (sem erro)
    public void adicionarSabor(Sabor sabor) {
        sabores.add(sabor);
    }

    @Override
    public void selecionarSabor(Sabor sabor) {

        if (sabor == null || !sabores.contains(sabor)) {
            System.out.println("Sabor inválido");
            return;
        }

        if (!sabor.verificarDisponibilidade()) {
            System.out.println("Produto esgotado");
            return;
        }

        this.saborSelecionado = sabor;

        System.out.println("Sabor selecionado: " + sabor.getNome());
    }

    @Override
    public void liberarCafe() {

        if (saborSelecionado == null) {
            System.out.println("Nenhum sabor selecionado");
            return;
        }

        saborSelecionado.diminuirDose();

        System.out.println("Café liberado: " + saborSelecionado.getNome());

        Nivel nivel = saborSelecionado.verificarNivel();
        luz.atualizarStatus(nivel);
        luz.mostrarCor();

        // limpa seleção após uso
        saborSelecionado = null;
    }

    // GETTERS E SETTERS
    public List<Sabor> getSabores() {
        return sabores;
    }

    public void setSabores(List<Sabor> sabores) {
        this.sabores = sabores;
    }

    public StatusLuz getLuz() {
        return luz;
    }

    public void setLuz(StatusLuz luz) {
        this.luz = luz;
    }
}