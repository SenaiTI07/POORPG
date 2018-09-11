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
public class Guerreiro extends AbstractPersonagem {

    int forcaEspada;
    int block;

    public Guerreiro(int forcaEspada, int block, int tipo, int hp, int forca, int destreza, int inteligencia, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, nome);
        this.forcaEspada = forcaEspada;
        this.block = block;
    }
    
    @Override
    public boolean atacar() {
       return true;
    }
}
