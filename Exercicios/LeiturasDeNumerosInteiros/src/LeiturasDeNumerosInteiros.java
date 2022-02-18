
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leiturasdenumerosinteiros;

import java.util.Scanner;

/**
 *
 * @author Felipe Marques
 */
public class LeiturasDeNumerosInteiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculosSobreValores csv = new CalculosSobreValores();
        Scanner sc = new Scanner(System.in);
        int valor;
        
        do {
            valor = sc.nextInt();
            if (valor != -1)
                csv.testaValor(valor);          
        } while (valor != -1);
        
        csv.imprimir();
    }
    
}
