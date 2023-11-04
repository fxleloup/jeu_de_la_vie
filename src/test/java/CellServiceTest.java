import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CellServiceTest {
    CellService service = new CellService();

    @Test
    void nextCellStatusShouldBeTreûeWhen3livingNeighbors() {

        boolean nextStatus = service.nextStatus(true, 3);

        assertThat(nextStatus).isTrue();
    }

    @Test
    void nextCellStatusShouldBeTreûeWhen3livingNeighborsOfADeadCell() {

        boolean nextStatus = service.nextStatus(false, 3);

        assertThat(nextStatus).isTrue();
    }

    @Test
    void nextCellStatusShouldBeFalseWhenNoLivingNeighbors() {

        boolean nextStatus = service.nextStatus(true, 0);

        assertThat(nextStatus).isFalse();
    }

    @Test
    void nextCellStatusShouldBeFalseWhen2LivingNeighborsOfADeadCell() {

        boolean nextStatus = service.nextStatus(false, 2);

        assertThat(nextStatus).isFalse();
    }

    @Test
    void nextCellStatusShouldBeTrueWhen2LivingNeighborsOfALivingCell() {

        boolean nextStatus = service.nextStatus(true, 2);

        assertThat(nextStatus).isTrue();
    }

    @Test
    void nextCellStatusShouldBeFalseWhen4LivingNeighbors() {

        boolean nextStatus = service.nextStatus(true, 4);

        assertThat(nextStatus).isFalse();
    }

    @Test
    void nextCellStatusShouldBeFalseWhen1LivingNeighbor() {

        boolean nextStatus = service.nextStatus(false, 1);

        assertThat(nextStatus).isFalse();
    }
}