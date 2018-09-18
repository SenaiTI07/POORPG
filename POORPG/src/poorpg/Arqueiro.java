/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg;

import java.util.Random;
import poorpg.batalha.acao.AbstractAtaque;
import poorpg.batalha.acao.AtaqueFisico;

/**
 *
 * @author senai
 */
public class Arqueiro extends AbstractPersonagem {
    
    int evasao;
    int penetracaoMagica;

    public Arqueiro(int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
        this.evasao = evasao;
        this.penetracaoMagica = penetracaoMagica;
    }

    @Override
    public AbstractAtaque atacar() {
        return new AtaqueFisico(this.getDestreza() * this.getForca()); 
    }

    
    public int receberAtaque(AbstractAtaque a) {
         return a.getQuantidade() - (this.getDestreza() - (this.getHP() / 15));
    }
    
    public void evasao(AbstractPersonagem personagem){
        personagem.setHP(personagem.getHP() * (int)(this.getDestreza() * 100)) ;
    }
    
    public Arqueiro(){
        super(0,100,100,100,100,100,"Comi o>");
    }
}
