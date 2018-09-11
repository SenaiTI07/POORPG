/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg.batalha.ataque;

/**
 *
 * @author senai
 */
public interface IAtaque {
    int FISICO = 0;
    int MAGICO = 1;
    
    int getTipo();
    int getQuantidade();
}
