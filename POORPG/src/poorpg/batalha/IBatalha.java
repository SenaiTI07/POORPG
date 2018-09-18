/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg.batalha;

import poorpg.AbstractPersonagem;
import poorpg.batalha.acao.AbstractAtaque;
import poorpg.batalha.acao.IAcao;

/**
 *
 * @author senai
 */
public interface IBatalha {
    AbstractPersonagem getPersonagem(int personagem);
    int getVez();
    void consumirVez(IAcao a);
    boolean verificaFimBatalha();
}
