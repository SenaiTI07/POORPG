package poorpg;

public class Necromante extends AbstractPersonagem {

    private int cadaveres;
    
    
    @Override
    public boolean atacar() {
        return true;
        
    }

    public Necromante(int tipo, int hp, int forca, int destreza, int inteligencia, String nome, int cadaveres) {
        super(tipo, hp, forca, destreza, inteligencia, nome);
        this.cadaveres = cadaveres;
    }

}
