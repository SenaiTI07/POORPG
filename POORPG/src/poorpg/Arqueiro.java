/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg;

import java.util.Random;
import poorpg.batalha.acao.AbstractAtaque;
import poorpg.batalha.acao.AtaqueFisico;
import poorpg.batalha.acao.IAtaque;

/**
 *
 * @author senai
 */
public class Arqueiro extends AbstractPersonagem {
    
    int evasao;
    int penetracaoMagica;
    private int armaduraFisica;
    private int resistenciaMagica;

    public Arqueiro(int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
        this.evasao = evasao;
        this.penetracaoMagica = penetracaoMagica;
    }

    @Override
    public AbstractAtaque atacar() {
        return new AtaqueFisico(this.getDestreza() * this.getForca()); 
    }

    
    public int receberAtaque(IAtaque a) {
         return a.getQuantidade() - (this.getDestreza() - (this.getHP() / 15));
    }
    
    public void evasao(AbstractPersonagem personagem){
        personagem.setHP(personagem.getHP() * (int)(this.getDestreza() * 100)) ;
    }
    
    public Arqueiro(){
        super(ARQUEIRO,100,6,10,4,10,"SoulBeast");
    }

    @Override
    public int getDef(int tipoAtaque) {
       Random math = new Random();
       
        if (tipoAtaque == 0){
            this.armaduraFisica = (int)(this.getDestreza() / 2 + math.random() * (this.getForca()));
        }else{
            this.resistenciaMagica = (int)(this.getDestreza() / 2 + math.random() * (this.getHP()));
        }
        return 0;
    }
}
