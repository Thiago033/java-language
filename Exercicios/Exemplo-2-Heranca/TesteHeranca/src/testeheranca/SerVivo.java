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
public class SerVivo {
    private boolean vivo;
    private int idade;
    
    public SerVivo() {
        vivo = true;
        idade = 0;
    }
    
    public boolean estaVivo() {
        return vivo;
    }
    
    public void fazAniversario() {
        idade++;
    }
    
    public int idade() {
        return idade;
    }
    
    public void morreu() {
        vivo = false;
    }
}
