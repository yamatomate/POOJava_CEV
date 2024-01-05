
import java.util.Scanner;

    //----Classe--//
public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //----construtor----//
    public Banco() {
    this.status = false;
    this.saldo = 0.0f;
    }
    //----métodos-------//
    
    public void abrirConta(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Abrindo conta...");
        setStatus(true);
        System.out.println("Qual sera o tipo? CC(conta corrente) ou CP(conta poupanca)?");
        setTipo(teclado.nextLine().toUpperCase());
        if (!(this.tipo.equals("CC") ^ this.tipo.equals("CP"))) {
            // caso não digite certo
            do {
                System.out.println("opcao invalida, poderia escolher novamente...");
                System.out.println("Qual sera o tipo? CC(conta corrente) ou CP(conta poupanca)?");
                setTipo(teclado.nextLine().toUpperCase());
            } while(!(this.tipo.equals("CC") ^ this.tipo.equals("CP")));    
        }
        if (getTipo().equals("CC")) {
            setSaldo(50f);
        } else {
            setSaldo(150f);
        }
        System.out.println("Qual eh seu nome?");
        setDono(teclado.nextLine().toUpperCase());
        setNumConta( (int) (Math.random() * 10000));
        System.out.format("Esse serah o numero da sua conta: %d \nConta aberta.\n", getNumConta());
        
    }
    public void fecharConta(){
        if (getSaldo() > 0) {
            System.out.println("Nao eh possivel encerrar conta, ainda ha-h dinheiro nela.");
        } if (getSaldo() < 0 ) {
            System.out.println("Nao eh possivel encerrar conta, voce estah em debito com banco.");
        }
    }
    public void depositar(float deposito){
        if (getStatus()) {
            setSaldo( (getSaldo()+(float)deposito) );
            System.out.format("Depositado, seu saldo atual eh R$ %.2f\n",getSaldo());
        } else {
            System.out.println("Nao foi possivel depositar, conta estah fechada");
        }
    }
    public void sacar(float saque){
        if (getStatus()) {
            if (saque < getSaldo()) {
                setSaldo( (getSaldo()-(float)saque));
                System.out.format("Saque de R$ %.2f realizado, saldo atual: R$ %.2f\n"
                        ,saque, getSaldo());
            } else {
                System.out.println("Saque negado");
            }
        } else {
            System.out.println("Nao foi possivel sacar, conta estah fechada");
        }
    }
    public void pagarMensal(){
        if (getTipo().equals("CC")) {
            setSaldo(getSaldo()-12f);
        } else {
            setSaldo(getSaldo()-20f);
        }
        System.out.format("Mensalidade paga, saldo atual: R$ %.2f\n", getSaldo());
    }
    public void perfil(){
        //visão geral da conta//
        String n = "----------------------";
        System.out.format("%s\nNome: %s\nNumero da conta: %d\nTipo: %s\nSaldo: R$ %.2f\n%s\n"
                ,n,getDono(),getNumConta(),getTipo(), getSaldo(),n);
    }
    ///----set-e-get----//
    public void setConta(String nome, String tipo) {
        setStatus(true);
        setNumConta( (int) (Math.random() * 10000));
        setDono(nome);
        setTipo(tipo.toUpperCase());
        if (getTipo().equals("CC")) {
            setSaldo(50f);
        } else {
            setSaldo(150f);
        }
    }
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
