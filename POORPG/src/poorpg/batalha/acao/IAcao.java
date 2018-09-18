/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg.batalha.acao;

/**
 *
 * @author senai
 */
public interface IAcao {
    int ATAQUE = 0;
    int ITEM = 1;
    
    int getTipoAcao();
}
