import lombok.Value;

import java.util.List;

@Value
public class Damier {

    List<List<Cellule>> contenu;

    public void nouvelEtat() {
    }
}
