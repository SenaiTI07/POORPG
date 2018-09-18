package poorpg;

import poorpg.batalha.acao.AbstractAtaque;
import poorpg.batalha.acao.IAtaque;

public class Necromante extends AbstractPersonagem {

    public Necromante(int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
    }

    public void invocarCadaveres() {

    }

    @Override
    public AbstractAtaque atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int receberAtaque(IAtaque a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
