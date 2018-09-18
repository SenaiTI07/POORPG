/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg;

import poorpg.batalha.acao.AbstractAtaque;
import poorpg.batalha.acao.AtaqueMagico;
import poorpg.batalha.acao.IAtaque;

/**
 *
 * @author senai
 */
public class Professor extends AbstractPersonagem {

    public static final int BASEHP = 200;
    public static final int BASEFORCA = 8;
    public static final int BASEDEX = 9;
    public static final int BASEINT = 10;
    public static final String NOME = "Nakagawa";

    public Professor(int tipo, int hp, int forca,
            int destreza, int inteligencia, int level,
            String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
    }

    public Professor(){
        super(IPersonagem.PROFESSOR, BASEHP, 
                BASEFORCA, BASEDEX, BASEINT, 1, NOME);
    
    }

    @Override
    public AbstractAtaque atacar() {
        return new AtaqueMagico(
                this.getForca() + this.getDestreza() + 
                        this.getInteligencia());
    }

    @Override
    public int receberAtaque(IAtaque a) {
        int dano = a.getQuantidade() - 
                this.getDef(a.getTipoAtaque());
        if(dano > 0){
            this.setHP(this.getHP() - dano);
        }
        return dano;
    }

    @Override
    public int getDef(int tipoAtaque) {
        switch(tipoAtaque){
            case IAtaque.FISICO:
                return this.getForca()/2+
                        (int)Math.round(Math.random()*
                                this.getDestreza());
            case IAtaque.MAGICO:
                return this.getInteligencia()/2+
                        (int)Math.round(Math.random()*
                                this.getDestreza());
        }
        return 0;
    }

}
