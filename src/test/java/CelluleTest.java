import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CelluleTest {

    @Test
    void doit_rester_morte_si_un_seul_voisin_vivant() {
        // Given
        Cellule cellule = Cellule.morte();
        List<Cellule> voisins = List.of(Cellule.vivante(), Cellule.morte());
        // When
        boolean prochainEtat = cellule.prochainEtat(voisins);
        // Then
        assertThat(prochainEtat).isFalse();
    }
    @Test
    void doit_mourir_si_un_seul_voisin_vivant() {
        // Given
        Cellule cellule = Cellule.vivante();
        List<Cellule> voisins = List.of(Cellule.vivante(), Cellule.morte());
        // When
        boolean prochainEtat = cellule.prochainEtat(voisins);
        // Then
        assertThat(prochainEtat).isFalse();
    }

    @Test
    void doit_etre_vivante_si_3_voisins_vivants() {
        // Given
        Cellule cellule = Cellule.morte();
        List<Cellule> voisins = List.of(Cellule.vivante(), Cellule.vivante(), Cellule.vivante());
        // When
        boolean prochainEtat = cellule.prochainEtat(voisins);
        // Then
        assertThat(prochainEtat).isTrue();
    }

    @Test
    void doit_etre_vivante_si_3_voisins_vivants_et_1_voisin_mort() {
        // Given
        Cellule cellule = Cellule.morte();
        List<Cellule> voisins = List.of(Cellule.vivante(), Cellule.vivante(), Cellule.vivante(), Cellule.morte());
        // When
        boolean prochainEtat = cellule.prochainEtat(voisins);
        // Then
        assertThat(prochainEtat).isTrue();
    }

    @Test
    void doit_rester_vivante_et_2_voisins_vivants() {
        // Given
        Cellule cellule = Cellule.vivante();
        List<Cellule> voisins = List.of(Cellule.vivante(), Cellule.vivante());
        // When
        boolean prochainEtat = cellule.prochainEtat(voisins);
        // Then
        assertThat(prochainEtat).isTrue();
    }

    @Test
    void doit_rester_mort_si_2_voisins_vivants() {
        // Given
        Cellule cellule = Cellule.morte();
        List<Cellule> voisins = List.of(Cellule.vivante(), Cellule.vivante());
        // When
        boolean prochainEtat = cellule.prochainEtat(voisins);
        // Then
        assertThat(prochainEtat).isFalse();
    }

    @Test
    void doit_rester_mourir_si_plus_3_voisins_vivants() {
        // Given
        Cellule cellule = Cellule.vivante();
        List<Cellule> voisins = List.of(Cellule.vivante(), Cellule.vivante(), Cellule.vivante(), Cellule.vivante());
        // When
        boolean prochainEtat = cellule.prochainEtat(voisins);
        // Then
        assertThat(prochainEtat).isFalse();
    }
}