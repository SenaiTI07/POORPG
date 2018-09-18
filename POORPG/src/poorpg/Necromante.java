package poorpg;

import poorpg.batalha.acao.AbstractAtaque;
import poorpg.batalha.acao.AtaqueMagico;

public class Necromante extends AbstractPersonagem {

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    private int mana;

    public Necromante(int tipo, int hp, int forca, int destreza, int inteligencia, int level, int mana, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
        this.mana = mana;
    }

    public Necromante() {
        super(NECROMANTE, 95, 5, 6, 10, 1, "Kel'Thuzad");
        this.mana = 9;
    }



    @Override
    public AbstractAtaque atacar() {
        return new AtaqueMagico((this.getInteligencia() / 2) + (this.getMana() / 2));
    }

    @Override
    public int receberAtaque(AbstractAtaque a) {
        return a.getQuantidade() - this.getForca();
    }
}
