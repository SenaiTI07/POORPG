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
public class AbstractAtaque implements IAtaque {
    private final int tipo;
    private final int quantidade;

    public AbstractAtaque(int tipo, int quantidade) {
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    @Override
    public int getTipo() {
        return tipo;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }
   
    
}
