package poorpg;

import poorpg.batalha.acao.AbstractAtaque;
import poorpg.batalha.acao.AtaqueMagico;
import poorpg.batalha.acao.IAtaque;

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
        super(NECROMANTE, 92, 5, 6, 10, 3, "Nekrotterio");
        this.mana = 9;
    }

    @Override
    public AbstractAtaque atacar() {
        return new AtaqueMagico(((this.getInteligencia() / 2) + (this.getMana() / 2)) * 2);
    }

    @Override
    public int receberAtaque(IAtaque a) {
        int dano = this.getDef(a.getTipoAtaque()) - a.getQuantidade();
        this.setHP(this.getHP() - dano);
        return dano;
    }

    @Override
    public int getDef(int tipoAtaque) {
        if (tipoAtaque == IAtaque.FISICO) {
            int def = (this.getForca() / 2 + (int) Math.round(Math.random() * this.getLevel()));
            return def;
        }

        int def = (this.getInteligencia() / 2 + (int) Math.round(Math.random() * this.getDestreza()));
        return def;
    }
}
