import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CellServiceTest {

    @Test
    void nextCellStatusShouldBeTreûeWhen3livingNeighbors() {
        CellService service = new CellService();

        boolean nextStatus = service.nextStatus(true, 3);

        assertThat(nextStatus).isTrue();
    }

    @Test
    void nextCellStatusShouldBeFalseWhenNoLivingNeighbors() {
        CellService service = new CellService();

        boolean nextStatus = service.nextStatus(true, 0);

        assertThat(nextStatus).isFalse();
    }

    @Test
    void nextCellStatusShouldBeFalseWhen2LivingNeighborsOfADeadCell() {
        CellService service = new CellService();

        boolean nextStatus = service.nextStatus(false, 2);

        assertThat(nextStatus).isFalse();
    }

    @Test
    void nextCellStatusShouldBeTrueWhen2LivingNeighborsOfALivingCell() {
        CellService service = new CellService();

        boolean nextStatus = service.nextStatus(true, 2);

        assertThat(nextStatus).isTrue();
    }

}