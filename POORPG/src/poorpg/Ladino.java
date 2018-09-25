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
public class Ladino extends AbstractPersonagem{
    
    private int backStab;
    private int invisibility;

    public Ladino(int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
    }

    public void RoubarItens (AbstractPersonagem personagem) {
        
        
    }
    
    
    @Override
    public AbstractAtaque atacar() {
      return new AtaqueFisico(this.getForca());  
    }

    @Override
    public int receberAtaque(IAtaque a) {
        this.setHP(this.getHP() - a.getQuantidade());
        return a.getQuantidade();
    }

    @Override
    public int getDef(int tipoAtaque) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
    
    
   
    
    
}

