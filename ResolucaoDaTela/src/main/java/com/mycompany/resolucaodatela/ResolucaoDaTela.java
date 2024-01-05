package com.mycompany.resolucaodatela;

import java.awt.*;

public class ResolucaoDaTela {

    public static void main(String[] args) {
        Dimension tamanho = Toolkit.getDefaultToolkit().getScreenSize();
        int altura = (int)tamanho.getHeight();
        int largura = (int)tamanho.getWidth();
        System.out.println("O tamanho da sua tela é "+ largura+ "x" + altura);
    }
}
