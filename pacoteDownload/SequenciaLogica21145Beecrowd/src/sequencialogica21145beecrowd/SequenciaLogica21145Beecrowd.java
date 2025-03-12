/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequencialogica21145beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class SequenciaLogica21145Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int X = teclado.nextInt();
        int Y = teclado.nextInt();
        
        for (int c = 1; c <= Y; c++){
            System.out.print(c);
            
            if (c % X == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
    
}
