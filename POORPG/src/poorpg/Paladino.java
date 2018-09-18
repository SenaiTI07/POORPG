package poorpg;

import java.util.Random;
import poorpg.batalha.acao.AbstractAtaque;
import poorpg.batalha.acao.AtaqueFisico;
import poorpg.batalha.acao.IAtaque;

public class Paladino extends AbstractPersonagem {

    private static final int CURA = 10;

    private static final int HP = 100;
    private static final int FORCA = 6;
    private static final int DESTREZA = 2;
    private static final int INTELIGENCIA = 4;
    private static final int LEVEL = 1;
    private static final String NOME = "Lanches";

    public Paladino(int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
    }

    public Paladino() {
        super(PALADINO, Paladino.HP, Paladino.FORCA, Paladino.DESTREZA, Paladino.INTELIGENCIA, Paladino.LEVEL, Paladino.NOME);
    }

    @Override
    public AbstractAtaque atacar() {
        return new AtaqueFisico(((this.getForca() / 2) + (this.getInteligencia() / 2) * 2));
    }

    @Override
    public int receberAtaque(IAtaque a) {
        int dano = a.getQuantidade() - this.getDef(a.getTipoAtaque());
        this.setHP(this.getHP() - dano);
        return dano;
    }

    @Override
    public int getDef(int tipoAtaque) {
        Random rand = new Random();
        if (tipoAtaque == IAtaque.FISICO) {
            int def = ((this.getForca() / 2) + (int) Math.round(Math.random() * this.getInteligencia()));
            return def;
        } else if (tipoAtaque == IAtaque.MAGICO) {
            int def = ((this.getForca() / 2) + (int) Math.round(Math.random() * this.getInteligencia()));
        }
        return 0;
    }
}
