/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg.batalha;

import poorpg.batalha.ataque.AbstractAtaque;
import poorpg.AbstractPersonagem;

/**
 *
 * @author senai
 */
public interface IBatalha1x1 {
    int PERSONAGEM1 = 0;
    int PERSONAGEM2 = 1;
    AbstractPersonagem getPersonagem(int personagem);
    int getVez();
    void consumirVez(AbstractAtaque a);
    boolean verificaFimBatalha();
}
