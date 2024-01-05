
package ultraemojicombat;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private char categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    //construtuor//

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    //metodos//
    
    public void apresentar() {
        //aa
    }
    public void status(){
        //aa
    }
    public void ganharLuta() {
        //aa
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta() {
        //aa
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta() {
        //aa
        this.setEmpates(this.getEmpates()+1);
    }
    //gett e setters//

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(this.getPeso());
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(float peso) {
        if (peso < 52.2f){
            this.categoria = '-';
        } else if (peso < 70.3f){
            this.categoria = 'l';
        } else if (peso < 83.9f){
            this.categoria = 'm';
        } else if (peso < 120.2f){
            this.categoria = 'p';
        } else {
            this.categoria = '-';
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
