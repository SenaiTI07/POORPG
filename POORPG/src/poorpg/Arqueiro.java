/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg;

import java.util.Random;

/**
 *
 * @author senai
 */
public class Arqueiro extends AbstractPersonagem {
    
    private int tirosRapidos;
    private int penetracaoMagica;
    
    public Arqueiro(int tipo, int hp, int forca, int destreza, int inteligencia, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, nome);
    }

    @Override
    public boolean atacar() {
        return true;
        
    }  
}
