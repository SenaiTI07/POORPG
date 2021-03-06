/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg;

import java.util.Random;
import poorpg.batalha.acao.AbstractAtaque;
import poorpg.batalha.acao.AtaqueFisico;
import poorpg.batalha.acao.AtaqueMagico;
import poorpg.batalha.acao.IAtaque;

/**
 *
 * @author senai
 */
public class Mago extends AbstractPersonagem {

    private int mana, magic;

    public Mago(int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
        this.mana = mana;
        this.magic = magic;
    }

    public Mago() {
        super(2, 100, 4, 6, 7, 10, "Obelisco");
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
        return new AtaqueMagico(((this.mana) + (this.getForca() / 2)) * 2);
    }

    public int receberAtaque(IAtaque a) {
        int dano = a.getQuantidade() - (this.getForca());
        if (dano >= 0) {
            setHP(getHP() - dano);
        }
        return dano;
    }

    @Override
    public int getDef(int tipoAtaque) {
        Random math = new Random();

        if (tipoAtaque == 0) {
            return (this.getInteligencia() + (int) Math.round((Math.random() * this.getDestreza())));
        } else {
            return (this.getInteligencia() + (int) Math.round((Math.random() * this.getHP())));
        }

    }
}
