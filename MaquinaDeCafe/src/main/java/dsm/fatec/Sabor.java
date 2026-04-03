
package dsm.fatec;

public class Sabor {

    private int id;
    private String nome;
    private int quantidade;

    public Sabor(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.quantidade = 30;
    }

    public boolean verificarDisponibilidade() {
        return quantidade > 0;
    }

    public void diminuirDose() {
        if (quantidade > 0) {
            quantidade--;
        } else {
            System.out.println("Sem estoque para o sabor: " + nome);
        }
    }

    public Nivel verificarNivel() {
        if (quantidade == 0) {
            return Nivel.VAZIO;
        } else if (quantidade <= 5) {
            return Nivel.BAIXO;
        } else {
            return Nivel.ALTO;
        }
    }

    // GETTERS E SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade inválida");
        }
    }
}