/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg.batalha;

import poorpg.batalha.acao.AbstractAtaque;
import java.util.Random;
import poorpg.AbstractPersonagem;
import poorpg.IPersonagem;

/**
 *
 * @author senai
 */
public class AbstractBatalha1x1
implements IBatalha1x1{
    AbstractPersonagem p1,p2;
    private int vez;
    public AbstractBatalha1x1(AbstractPersonagem p1, AbstractPersonagem p2) {
        this.p1 = p1;
        this.p2 = p2;
        Random r = new Random();
        this.vez = r.nextInt(2);
    }
    
    @Override
    public AbstractPersonagem getPersonagem(int personagem) {
        switch(personagem){
            case IBatalha1x1.PERSONAGEM1:
                return this.p1;
            case IBatalha1x1.PERSONAGEM2:
                return this.p2;
        }
        return null;
    }

    @Override
    public int getVez() {
        return this.vez;
    }
    
    private int mudarVez() {
        switch(this.vez){
            case IBatalha1x1.PERSONAGEM1:
                this.vez = IBatalha1x1.PERSONAGEM2;
            case IBatalha1x1.PERSONAGEM2:
                this.vez = IBatalha1x1.PERSONAGEM1;
        }
        return this.vez;
    }

    @Override
    public boolean verificaFimBatalha() {
        return(this.p1.getHP() <= 0 ||
                this.p2.getHP() <= 0);
    }

    @Override
    public void consumirVez(AbstractAtaque a) {
        switch(this.vez){
            case IBatalha1x1.PERSONAGEM1:
                this.p2.receberAtaque(a);
            case IBatalha1x1.PERSONAGEM2:
                this.p1.receberAtaque(a);
        }
        mudarVez();
    }
    
}
