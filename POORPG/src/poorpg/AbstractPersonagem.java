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
    
}
