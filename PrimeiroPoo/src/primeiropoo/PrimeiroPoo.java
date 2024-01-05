package primeiropoo;

public class PrimeiroPoo {

    public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.cor = "roxa";
    c1.carga = 100;
    c1.modelo = "bic";
    c1.ponta =  0.5f;
    c1.tampada = true;
    c1.status();
    c1.rabiscar();
    c1.destampar();
    c1.rabiscar();
    c1.status();
    }
    
}
