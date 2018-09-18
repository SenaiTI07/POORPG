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
public interface IAtaque extends IAcao {
    
    int FISICO = 0;
    int MAGICO = 1;
    
    int getTipoAtaque();
    int getQuantidade();
}
