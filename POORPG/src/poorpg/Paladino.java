package poorpg;

import poorpg.batalha.acao.AbstractAtaque;
import poorpg.batalha.acao.AtaqueFisico;



public class Paladino extends AbstractPersonagem {

    private static final int HP = 100;
    private static final int FORCA = 8;
    private static final int DESTREZA = 3;
    private static final int INTELIGENCIA = 5;
    private static final int LEVEL = 1;
    private static final String NOME = "Lanches";

    public Paladino(int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
    }

    public Paladino() {
        super(Paladino.PALADINO, Paladino.HP, Paladino.FORCA, Paladino.DESTREZA, Paladino.INTELIGENCIA, Paladino.LEVEL, Paladino.NOME);
    }

    @Override
    public AbstractAtaque atacar() {
        return new AtaqueFisico(((this.getForca() / 2) + (this.getInteligencia() / 2) * 2));
    }

    @Override
    public int receberAtaque(AbstractAtaque a) {
        return a.getQuantidade() - this.getForca();
    }

}
