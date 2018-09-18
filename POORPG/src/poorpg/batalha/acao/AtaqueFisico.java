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
public class AtaqueFisico extends AbstractAtaque{
    
    public AtaqueFisico(int quantidade) {
        super(IAtaque.FISICO, quantidade);
    }
    
}
