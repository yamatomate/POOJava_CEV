
package encapsulamento;

public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //construtot
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    //metodos espciiei
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // metodos abstartata
    @Override
    public void ligar() {
      this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Estah ligado? " + this.getLigado());
        System.out.println("Estah tocando? " + this.getTocando());
        System.out.print("volume: ");
         for (int i = 0; i < this.getVolume(); i += 10) {
           System.out.print("*");
        }
         System.out.println(" " + this.getVolume());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume()+1);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume()-1);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }
    @Override
    public void pause() {
        if (this.getLigado() && (this.getTocando())) {
            this.setTocando(false);
        }
    }
    
}
