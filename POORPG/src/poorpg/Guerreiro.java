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

 
    int block;

    public Guerreiro( int block, int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
       
        this.block = block;
    }

    @Override
    public AbstractAtaque atacar( ) {

        return new AtaqueFisico(getForca() - getHP()/2);
        
    }

    @Override
    public int receberAtaque(IAtaque a) {
           
        int dano = a.getQuantidade() - (this.getHP() -( this.getForca() - block));
        this.setHP(this.getHP() - dano); 
        return  dano;
    }


    public Guerreiro(){
        super(GUERREIRO,100,6,5,2,5,"DesertoNegro");
    }


    
    

  

}
