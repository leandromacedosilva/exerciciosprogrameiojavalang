
package modelo;

/**
 *
 * @author leandro
 */
public class ControleRemoto {
    private int canal;
    private int volume;
    private int configuracoes;
    
    // Construtor 
    public ControleRemoto(){}
    
    // Métodos
    public void aumentarVolume(int maisVolume){
        this.volume = this.volume + maisVolume; 
    }
    
    public void diminuirVolume(int menosVolume){
        this.volume = this.volume - menosVolume;
    }
    
    public void controleConfiguracoes(int configuracao){
        if(this.configuracoes == 1){
            System.out.println("Sintonia de canais realizada com sucesso!");
        }
        if(this.configuracoes == 2){
            System.out.println("Ajuste de cores realizada com sucesso!");
        }
        if(this.configuracoes == 3){
            System.out.println("Seu dispositivo está conectado à Internet.");
        }else{
            System.out.println("Nenhuma opção escolhida.");
        }
    }
    
    // Getters and Setters

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(int configuracoes) {
        this.configuracoes = configuracoes;
    }

    @Override
    public String toString() {
        return "ControleRemoto{" + "canal=" + canal + ", volume=" + volume + ", configuracoes=" + configuracoes + '}';
    }
    
}
