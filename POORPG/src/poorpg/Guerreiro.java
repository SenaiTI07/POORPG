/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg;

import poorpg.batalha.ataque.AbstractAtaque;
import poorpg.batalha.ataque.AtaqueFisico;

/**
 *
 * @author senai
 */
public class Guerreiro extends AbstractPersonagem {

 
    int block;

    public Guerreiro( int block, int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
       
        this.block = block;
    }

    @Override
    public AbstractAtaque atacar( ) {
        
        return new AtaqueFisico(getForca() - getHP()/2);
        
    }

    
    public int receberAtaque(AbstractAtaque a) {
           
        return  a.getQuantidade() - (this.getHP() -( this.getForca() - block));
    }




    
    

  

}
