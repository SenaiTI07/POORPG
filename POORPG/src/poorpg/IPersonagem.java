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
public interface IPersonagem {
    int GUERREIRO = 0;
    int ARQUEIRO = 1;
    int MAGO = 2;
    int LADINO = 3;
    int MONGE = 4;
    int NECROMANTE = 5;
    int PALADINO = 6;
    int CLERIGO = 7;
    boolean atacar();
    String getNome(String nome);
    void setNome(String nome);
    int getHP(int hp);
    void setHP();
    int getForca(int forca);
    void setForca();
    int getDestreza(int destreza);
    void setDestreza();
    int getInteligencia(int inteligencia);
    void setInteligencia();
    int getTipo();
    void setTipo(int tipo);
}
