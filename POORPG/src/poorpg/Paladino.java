package poorpg;

import poorpg.batalha.ataque.AbstractAtaque;
import poorpg.batalha.ataque.AtaqueFisico;

public class Paladino extends AbstractPersonagem {

    public Paladino(int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
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
