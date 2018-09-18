/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg;

import poorpg.batalha.acao.AbstractAtaque;
import poorpg.batalha.acao.AtaqueFisico;
import poorpg.batalha.acao.IAtaque;

/**
 *
 * @author senai
 */
public class Guerreiro extends AbstractPersonagem {

 
  

    public Guerreiro( int block, int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
       
        
    }

    @Override
    public AbstractAtaque atacar( ) {

        return new AtaqueFisico((getForca()/2) + (getDestreza()/2)*2);
        
    }

    @Override
    public int receberAtaque(IAtaque a) {
           
        int dano = a.getQuantidade() - this.getForca();
        this.setHP(this.getHP() - dano); 
        return  dano;
    }


    public Guerreiro(){
        super(GUERREIRO,100,6,6,2,5,"DesertoNegro");
    }


    
    

  

}
