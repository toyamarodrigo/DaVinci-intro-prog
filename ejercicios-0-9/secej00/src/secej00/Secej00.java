/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secej00;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Secej00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, s;
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n1: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n2: "));
        s = a + b;
        
        JOptionPane.showMessageDialog(null, "El resultado es: " +s);
    }
    
}
