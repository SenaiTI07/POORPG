/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg;

import poorpg.batalha.ataque.AbstractAtaque;

/**
 *
 * @author senai
 */
public interface IPersonagem {
    int GUERREIRO = 0;
    int ARQUEIRO = 1;
    int MAGO = 2;
    int LADINO = 3;
    int MONGE = 4;
    int NECROMANTE = 5;
    int PALADINO = 6;
    int CLERIGO = 7;
    /**
     * Cria um AbstractAtaque para alguma batalha
     * @return 
     */
    AbstractAtaque atacar();
    /**
     * @param recebe um AbstractAtaque a
     * @return quantidade de dano 
     */
    int receberAtaque(AbstractAtaque a);
    
    String getNome();
    void setNome(String nome);
    int getHP();
    void setHP(int hp);
    int getForca();
    void setForca(int forca);
    int getDestreza();
    void setDestreza(int destreza);
    int getInteligencia();
    void setInteligencia(int inteligencia);
    int getTipo();
    void setTipo(int tipo);
    int getLevel();
    void setLevel(int level);
}
