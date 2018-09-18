/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg;

import poorpg.batalha.acao.AbstractAtaque;
import poorpg.batalha.acao.AtaqueFisico;
import poorpg.batalha.acao.AtaqueMagico;

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

    public Mago() {
        super(2, 50, 56, 48, 56, 40, "Obelisco");
        this.mana = mana;
    }

    public void BoladeFogo(AbstractPersonagem personagem) {

        if (mana == 50) {
            personagem.setForca(personagem.getForca() + (int) (this.getInteligencia()));
        } else {
            System.out.println("Mana invalida");
        }
    }

    public AbstractAtaque atacar() {
        return new AtaqueMagico(this.getInteligencia() - this.getDestreza());
    }

    public int receberAtaque(AbstractAtaque a) {
        return a.getQuantidade() - (this.getForca() - this.getHP()); 
    }
}
