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
}