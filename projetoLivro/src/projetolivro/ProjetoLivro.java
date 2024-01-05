
package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa b = new Pessoa("caburi",19,'F');
        Livro a = new Livro("jaci", "cucuci",100, b);
        a.detalhes();
        a.abrir();
        a.avancarPag();
        a.avancarPag();
        a.detalhes();
        a.folhear(0);
        a.detalhes();
        a.folhear(100);
    }
    
}
