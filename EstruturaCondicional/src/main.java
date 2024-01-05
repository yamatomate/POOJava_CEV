
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gusta
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a suas 2 nota:");
        System.out.print(">");
        float nota1 = teclado.nextFloat();
        System.out.print(">");
        float nota2 = teclado.nextFloat();
        float media = (nota1 + nota2)/2;
        System.out.print("Sua media eh " + media);
        if (media > 9) {
            System.out.println(" , Parabens pela media alta!");
        }
        else {
            System.out.println(" .");
        }
    }
    
}
