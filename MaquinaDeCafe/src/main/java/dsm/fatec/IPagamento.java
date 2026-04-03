
package dsm.fatec;

public interface IPagamento {
    public abstract boolean validarPagamento();
    public abstract boolean processarPagamento();
    public abstract void cancelarPagamento();
}
