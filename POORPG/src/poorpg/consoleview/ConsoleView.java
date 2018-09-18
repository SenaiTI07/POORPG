/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorpg.consoleview;

import java.lang.reflect.Constructor;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import poorpg.AbstractPersonagem;
import poorpg.batalha.Batalha1x1Generica;
import poorpg.batalha.IBatalha;
import poorpg.batalha.acao.IAcao;
import poorpg.*;
import poorpg.batalha.IBatalha1x1;

/**
 *
 * @author senai
 */
public class ConsoleView {
    Scanner sc;
    public ConsoleView(){
        this.sc = new Scanner(System.in);
    }
    public void iniciar(){
        AbstractPersonagem p1 = null;
        AbstractPersonagem p2 = null;
        while(p1 == null){
            p1 = criarPersonagem(1);
        }
        while(p2 == null){
            p2 = criarPersonagem(2);
        }
        Batalha1x1Generica batalha = 
                new Batalha1x1Generica(p1, p2);
        do{
            mostrarHP(batalha);
            mostrarVez(batalha);
            IAcao a = null;
            while(a == null){
                a = pedirAcao(batalha);
                if(a != null){
                    batalha.consumirVez(a);
                }
            }
        }while(!batalha.verificaFimBatalha());
    }

    private AbstractPersonagem criarPersonagem(int n) {
        System.out.println("Digite a classe de seu personagem " + n + ": ");
        String classe = sc.nextLine();
        Class<?> classePersonagem;
        Constructor<?> construtor;
        AbstractPersonagem ap;
        try{
            classePersonagem = Class.forName("poorpg."+classe); 
            construtor = classePersonagem.getConstructor();
            ap = (AbstractPersonagem) classePersonagem.newInstance();
        } catch (ClassNotFoundException |
                InstantiationException | 
                IllegalAccessException |
                NoSuchMethodException |
                SecurityException ex) {
            System.out.println("Classe não existente");
            return null;
        } 

        return ap;
    }
    private void mostrarVez(IBatalha b){
        System.out.println("Agora é a vez de " + 
                b.getPersonagem(b.getVez()) + " " +
                b.getVez()+1);
    }

    private IAcao pedirAcao(IBatalha batalha) {
        System.out.println("Digite \n 0 para ataque\n 1 para item");
        int opcao = sc.nextInt();
        sc.nextLine();
        IAcao a = null;
        switch (opcao){
            case IAcao.ATAQUE:
                a = batalha.getPersonagem(batalha.getVez()).atacar();
                break;
            case IAcao.ITEM:
                System.out.println("Não implementado ainda!");
                break;
        }
        return a;
    }
    
    private void mostrarHP(IBatalha b){
        System.out.println( "HP " +
                b.getPersonagem(IBatalha1x1.PERSONAGEM1) + 
                        " =" + 
                b.getPersonagem(IBatalha1x1.PERSONAGEM1).getHP());
        System.out.println( "HP " +
                b.getPersonagem(IBatalha1x1.PERSONAGEM2) + 
                        " =" + 
                b.getPersonagem(IBatalha1x1.PERSONAGEM2).getHP());
    
    }
}
