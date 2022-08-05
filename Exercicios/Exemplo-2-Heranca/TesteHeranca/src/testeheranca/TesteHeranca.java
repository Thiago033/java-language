/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeheranca;

/**
 *
 * @author Felipe Marques
 */
public class TesteHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        p[0] = new Aluno("Felipe", "9999999999", 2020);
        p[1] = new Pessoa("Joao", "44444444444");
        
        p[0].imprimir();
        p[1].imprimir();
    }
    
}
