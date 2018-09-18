/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg;

import poorpg.batalha.acao.AbstractAtaque;
import poorpg.batalha.acao.IAtaque;

/**
 *
 * @author senai
 */
public class Mago extends AbstractPersonagem {

    
    private int mana, enchanter, magic;

    public Mago(int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
        this.mana = mana;
        this.enchanter = enchanter;
        this.magic = magic;
    }

    @Override
    public AbstractAtaque atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int receberAtaque(IAtaque a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
