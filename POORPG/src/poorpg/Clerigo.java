package poorpg;

import poorpg.batalha.ataque.AbstractAtaque;
import poorpg.batalha.ataque.AtaqueMagico;

public class Clerigo extends AbstractPersonagem {

    public Clerigo(int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
    }

    public void Curar(AbstractPersonagem personagem) {
        personagem.setHP(personagem.getHP() + (int)(this.getInteligencia() * 3.5)) ;
    }

    @Override
    public AbstractAtaque atacar() {
        return new AtaqueMagico(this.getInteligencia() * this.getHP() / 2);
    }

    @Override
    public int receberAtaque(AbstractAtaque a) {
        return a.getQuantidade() - (this.getInteligencia() * (this.getDestreza() / 10));
    }



}
