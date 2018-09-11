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
public abstract class Mago extends AbstractPersonagem {

    
    private int mana, enchanter, magic;
      
    
    public Mago(int tipo, int hp, int forca, int destreza, int inteligencia, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, nome);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getEnchanter() {
        return enchanter;
    }

    public void setEnchanter(int enchanter) {
        this.enchanter = enchanter;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    
    public void TacarMagia (int TacarMagia){  
        
    }
    
    public void AutoCura(){     
    }
    
    
}
