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
public class Monge extends AbstractPersonagem {

    public int getFoco() {
        return foco;
    }

    public void setFoco(int foco) {
        this.foco = foco;
    }

    private int foco;



    public Monge(int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome, int foco) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
        this.foco = foco;
    }
    
    public Monge(){
        super(MONGE, 85, 6, 9, 10, 1, "gregão");
        this.foco = 6;
    }

    public int curaPropia() {
        return this.getHP() + 5;
    }

    @Override
    public AbstractAtaque atacar() {
        return new AtaqueFisico((this.foco / 2) + this.getForca() / 2);
    }

    @Override
    public int receberAtaque(IAtaque a) {
        return a.getQuantidade() - this.getForca();
    }

}
