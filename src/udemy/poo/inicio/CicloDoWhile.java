/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;

/*
    Tablas de multiplicar del 1 al 10 y el número a multiplicar nos lo proporcionará
    el usuraio. JOptionPane
*/

/**
 *
 * @author luisangelcuriel
 */
public class CicloDoWhile {
    public static void main(String[] args) {
        String dato = JOptionPane.showInputDialog(null, "Dame un número: ");
        int numUno = Integer.parseInt(dato);
        int multiplo = 1;
        String cad = "";
        
        do {            
            cad = cad + numUno + " x " + multiplo + " = " + (numUno * multiplo) + "\n";
            multiplo += 1;
        } while (multiplo <= 10);
        
        JOptionPane.showMessageDialog(null, cad);
    }
}
