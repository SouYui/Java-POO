/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;

/*
    Recibir tres número y determinar cúal es el mayor, cuál el medio y cuál el 
    menor.
*/

/**
 *
 * @author luisangelcuriel
 */
public class EjercicioTresNumeros {
    public static void main(String[] args) {
        String datoUno = JOptionPane.showInputDialog(null, "Dame el número 1: ");
        String datoDos = JOptionPane.showInputDialog(null, "Dame el número 2: ");
        String datoTres = JOptionPane.showInputDialog(null, "Dame el número 3: ");
        
        int numUno = Integer.parseInt(datoUno);
        int numDos = Integer.parseInt(datoDos);
        int numTres = Integer.parseInt(datoTres);
        
        if (numUno > numDos) {
            if (numUno > numTres) {
                if (numTres > numDos) {
                    JOptionPane.showMessageDialog(null, "El número mayor es:    " + numUno + "\n" 
                            + "El número medio es:  " + numTres + "\n" 
                            + "EL número menor es:  " + numDos);
                } else {
                    JOptionPane.showMessageDialog(null, "El número mayor es:    " + numUno + "\n" 
                            + "El número medio es:  " + numDos + "\n" 
                            + "EL número menor es:  " + numTres);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El número mayor es:    " + numTres + "\n" 
                            + "El número medio es:  " + numUno + "\n" 
                            + "EL número menor es:  " + numDos);
            }
        } else {
            if (numDos > numTres) {
                if (numTres > numUno) {
                    JOptionPane.showMessageDialog(null, "El número mayor es:    " + numDos + "\n" 
                            + "El número medio es:  " + numTres + "\n" 
                            + "EL número menor es:  " + numUno);
                } else {
                    JOptionPane.showMessageDialog(null, "El número mayor es:    " + numDos + "\n" 
                            + "El número medio es:  " + numUno + "\n" 
                            + "EL número menor es:  " + numTres);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El número mayor es:    " + numTres + "\n" 
                            + "El número medio es:  " + numDos + "\n" 
                            + "EL número menor es:  " + numUno);
            }
        }
        
        
    }
}
