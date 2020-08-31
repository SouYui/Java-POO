/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;

/*
    Un programa que reciba un número JOptionPane y este número que sea
    mayor a 1 y menor a 7 de en resultado un día de la semana.
*/

/**
 *
 * @author luisangelcuriel
 */
public class CicloSwitch {
    public static void main(String[] args) {
        String dato = JOptionPane.showInputDialog(null, "Dame un día de la semana");
        int numUno = Integer.parseInt(dato);
        String dia = "";
        
        switch(numUno) {
            case 1:
                dia = "El día es Lunes";
                break;
            case 2:
                dia = "El día es Martes";
                break;
            case 3:
                dia = "El día es Miércoles";
                break;
            case 4:
                dia = "El día es Jueves";
                break;
            case 5:
                dia = "El día es Viernes";
                break;
            case 6:
                dia = "El día es Sábado";
                break;
            default:
                dia = "El día es Domingo";
                break;
        }
        
        JOptionPane.showMessageDialog(null, dia);
    }
}
