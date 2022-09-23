/*
 Pide un número que debe estar entre 0 y 10 y mostrar la tabla de multiplicar de dicho número.
 */
package ejercicio16;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número mayor a 0 y menor a 10: "));
        }
        while (numero<0 || numero>10);
        
        System.out.println("La tabla de multiplicar del número: "+numero+"es: ");
        
        for(int i=1;i<=12;i++){
            System.out.println(numero+" * "+i+" = "+numero*i);
        }
                
              
    }
    
}
