
package projetolivro;

public class Livro implements Publicacao {
    private String nome;
    private String autor;
    private int totPags;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    //construto

    public Livro(String nome, String autor, int totPags, Pessoa leitor) {
        this.nome = nome;
        this.autor = autor;
        this.totPags = totPags;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    //metdos
    public void detalhes() {
        String a = "-----------------";
        System.out.format("%s\nNome do livro: %s\nAutor: %s\nTotal de paginas"
                + ": %d\nPagina atual: %d\nAberto: %s\nLeitor: %s\n%s\n",
                a,this.nome, this.autor, this.totPags,
                this.pagAtual, this.aberto, this.leitor.getNome(),a);
    }
    //get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPags() {
        return totPags;
    }

    public void setTotPags(int totPags) {
        this.totPags = totPags;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    //metodos abstas
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if ((0 <= p) && this.pagAtual+p <= this.totPags) {
            this.setPagAtual(p);
        } else {   
        System.out.println("acabou o livro");
        }   
        
    }

    @Override
    public void avancarPag() {
        if (this.pagAtual+1 < this.totPags) {
        this.pagAtual++;
        }
    }

    @Override
    public void voltarPag() {
        if (0 < this.pagAtual) {
        this.pagAtual--;
        }
    }
}
