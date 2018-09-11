/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg;

/**
 *
 * @author senai
 */
public abstract class AbstractPersonagem
        implements IPersonagem {

    private int tipo, hp, forca, destreza, inteligencia;
    private String nome;

    public AbstractPersonagem(int tipo, int hp, int forca, int destreza, int inteligencia, String nome) {
        this.tipo = tipo;
        this.hp = hp;
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
