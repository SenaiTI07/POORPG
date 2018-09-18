/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg;

import poorpg.batalha.acao.AbstractAtaque;

/**
 *
 * @author senai
 */
public class Monge extends AbstractPersonagem {

    private int foco;



    public Monge(int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
    }
    
    public Monge(){
        super(0, 85, 60, 90, 100, 1, "grego");
    }

    public void curaPropia() {
        
    }

    @Override
    public AbstractAtaque atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int receberAtaque(AbstractAtaque a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
