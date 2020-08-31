/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;

/*
        Recibir un número por JOptionPane y el número que le de, me devuelva 
        si es un número par o impar. Mostrar resultado en un JOptionPane
*/
/**
 *
 * @author luisangelcuriel
 */
public class CicloIfElse {
    public static void main(String[] args) {
        String dato = JOptionPane.showInputDialog(null, "Dame el número positivo: ");
        int numUno = Integer.parseInt(dato);
        String par = "";
        
        if (numUno % 2 == 0) {
            par = par + "El número " + numUno + " es par";
        } else {
            par = par + "El número " + numUno + " es impar";
        }
        
        JOptionPane.showMessageDialog(null, par, "¿Qué número es?", 
                JOptionPane.INFORMATION_MESSAGE);
    }
}
