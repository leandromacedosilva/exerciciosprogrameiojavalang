
package visao;

import modelo.ControleRemoto;

/**
 *
 * @author leandro
 */
public class MainTelevisao {
    public static void main(String[] args) {
        // Instância objeto
        ControleRemoto cR1 = new ControleRemoto();
        cR1.setCanal(37);
        cR1.setVolume(48);
        cR1.setConfiguracoes(2);
        cR1.toString();
    }
}
