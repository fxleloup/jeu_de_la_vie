public class CellService {

    public boolean nextStatus(boolean currentStatus, int livingNeighbors) {
        if (livingNeighbors == 2) {
            return currentStatus;
        }
        return livingNeighbors != 0;
    }

}
