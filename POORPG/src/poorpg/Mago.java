/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg;

/**
 *
 * @author senai
 */
public class Mago extends AbstractPersonagem {

    
    private int mana, enchanter, magic;
      
    
    public Mago(int tipo, int hp, int forca, int destreza, int inteligencia, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, nome);
    }
    
    @Override
    public boolean atacar() {
       return true;
    }
}