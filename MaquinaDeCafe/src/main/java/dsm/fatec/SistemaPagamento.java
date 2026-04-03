
package dsm.fatec;

public class SistemaPagamento implements IPagamento {

    private TipoPagamento tipo;

    public SistemaPagamento(TipoPagamento tipo) {
        this.tipo = tipo;
    }


    // getter e setter
    public TipoPagamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoPagamento tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public boolean validarPagamento() {
        return true;
    }

    @Override
    public boolean processarPagamento() {
        if (validarPagamento()) {
            System.out.println("Pagamento aprovado via " + tipo);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pagamento cancelado");
    }
}
