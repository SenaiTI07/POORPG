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

    public String getNome(String nome) {
        return null;
        
    }

    public int getHP(int hp) {
        return 10000;
        
    }

    public void setHP() {
        
    }

    public int getForca(int forca) {
        return 8000;
        
    }

    public void setForca() {
        
    }

    public int getDestreza(int destreza) {
        return 10000;
        
    }

    public void setDestreza() {
        
    }

    public int getInteligencia(int inteligencia) {
        return 6000;
        
    }

    public void setInteligencia() {
        
    }

    public int getTipo(int tipo) {
        return 1;
        
    }

    public void setTipo() {
        
    }

    public int tirosRapidos(AbstractPersonagem alvo, int chance, int força, int destreza, int hp){
        Random r = new Random();
        int chanceDeAcerto = r.nextInt(100);
        
        if (destreza > chance){
            return alvo.atacar(forca + hp);
            
        }else{
            return alvo.atacar(força + destreza);
        }
        
    }
   

    
}
