/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg;

import poorpg.batalha.ataque.AbstractAtaque;

/**
 *
 * @author senai
 */
public abstract class AbstractPersonagem
        implements IPersonagem {

    int tipo;

    private int hp, forca, destreza, inteligencia, level;
    private String nome;

    public AbstractPersonagem(int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        this.tipo = tipo;
        this.hp = hp;
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.nome = nome;
        this.level = level;
    }



    @Override
    public abstract AbstractAtaque atacar();

    @Override
    public abstract int receberAtaque(AbstractAtaque a);
    
    @Override
    public int getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public int getHP() {
        return this.hp;
    }

    @Override
    public void setHP(int hp) {
        this.hp = hp;
    }

    @Override
    public int getForca() {
        return forca;
    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public int getDestreza() {
        return destreza;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    @Override
    public int getInteligencia() {
        return inteligencia;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }




}
