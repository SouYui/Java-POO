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
public class CicloFor {
    public static void main(String[] args) {
        String dato = JOptionPane.showInputDialog(null, "Dame un número: ");
        float numUno = Float.parseFloat(dato);
        String cad = "";
        
        for (int i = 1; i <= 10; i++) {
            cad = cad + numUno + " x " + i + " = " + (numUno * i) + "\n";
        }
        
        JOptionPane.showMessageDialog(null, cad);
    }
}
