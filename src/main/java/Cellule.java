import java.util.List;


public class Cellule {
    private boolean vivante;

    private Cellule(boolean vivante) {
        this.vivante = vivante;
    }

    public boolean isVivante() {
        return vivante;
    }

    public static Cellule morte() {
        return new Cellule(false);
    }

    public static Cellule vivante() {
        return new Cellule(true);
    }

    public boolean prochainEtat(List<Cellule> voisins) {
        long nombreDeVoisinsVivants = voisins.stream()
                .filter(Cellule::isVivante)
                .count();
        return  nombreDeVoisinsVivants == 3 || (vivante && nombreDeVoisinsVivants == 2);
    }
}
