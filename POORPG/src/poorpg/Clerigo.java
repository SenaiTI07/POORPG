package poorpg;

import poorpg.batalha.acao.*;

public class Clerigo extends AbstractPersonagem {

    private String nome;

    public Clerigo(int tipo, int hp, int forca, int destreza, int inteligencia, int level, String nome) {
        super(tipo, hp, forca, destreza, inteligencia, level, nome);
    }
    
    public Clerigo(String nome) {
        super(GUERREIRO, 10, 5, 10, 16, 1, nome);
    }

    public void Curar(AbstractPersonagem personagem) {
        personagem.setHP(personagem.getHP() + (int)(this.getInteligencia() * 3.5)) ;
    }

    @Override
    public AbstractAtaque atacar() {
        return new AtaqueMagico(this.getInteligencia() * this.getHP() / 2);
    }

    @Override
    public int receberAtaque(IAtaque a) {
        int dano = this.getDef(a.getTipoAtaque()) - a.getQuantidade();
        this.setHP(this.getHP() - dano);
        
        return dano;
    }
    
    @Override
    public int getDef(int tipoAtaque) {
        if (tipoAtaque == 0) {
            return (this.getInteligencia() + (int)Math.round((Math.random() * this.getDestreza())));
        } else {
            return (this.getInteligencia() + (int)Math.round((Math.random() * this.getHP())));
        }
        
    }

}
