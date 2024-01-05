
package projetolivro;

public interface Publicacao {
    abstract void abrir();
    abstract void fechar();
    abstract void folhear(int p);
    abstract void avancarPag();
    abstract void voltarPag();
}
