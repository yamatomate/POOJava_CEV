/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadordeterno;

/**
 *
 * @author gusta
 */
public class OperadordeTerno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 23, n2 = 9, r;
        r = (n1>n2)?n1:n2;
        System.out.println(r);
        //----------------------------//
        String nome1="Gustavo", nome2="Gustavo",
               nome3= new String("Gustavo"), res;
        res = (nome1.equals(nome3))?"ingual":"desingual";
        System.out.println(res);
    }
    
}
