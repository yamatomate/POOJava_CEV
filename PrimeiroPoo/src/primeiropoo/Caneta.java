package primeiropoo;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("Qual a ponta? " + this.ponta);
        System.out.println("Quanta cargas ainda restam? " + this.carga);
        System.out.println("Seu modelo eh "+this.modelo);
        System.out.println("-------------------------------");
        
    }
    void rabiscar(){
        /*metodo aqui*/
        if (this.tampada == true) {
            System.out.println("erro");
        } else {
            System.out.println("RaBIsCo");
        } 
        
    }
    
    void tampar() {
        /*metodo aqui*/
        this.tampada = true;
    }
    
    void destampar() {
        /*metodo aqui*/
        this.tampada = false;
    }
}
