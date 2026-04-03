
package dsm.fatec;

public class Main {
    public static void main(String[] args) {

        // Criando máquina
        MaquinaDeCafe maquina = new MaquinaDeCafe("Minha Máquina");

        // Criando sabores
        Sabor cafePreto = new Sabor(1, "Café Preto");
        Sabor cappuccino = new Sabor(2, "Cappuccino");

        // Adicionando sabores na máquina
        maquina.adicionarSabor(cafePreto);
        maquina.adicionarSabor(cappuccino);

        // TESTE 1: fluxo normal
        maquina.selecionarSabor(cafePreto);
        maquina.liberarCafe();

        System.out.println("------------------");

        // TESTE 2: estoque acabando
        for (int i = 0; i < 31; i++) {
            maquina.selecionarSabor(cappuccino);
            maquina.liberarCafe();
        }

        System.out.println("------------------");

        // TESTE 3: tentar liberar sem selecionar
        maquina.liberarCafe();
    }
}
