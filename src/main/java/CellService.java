public class CellService {

    public boolean nextStatus(boolean currentStatus, int livingNeighbors) {
        if (livingNeighbors == 0 || livingNeighbors == 2)
            return false;
        return true;
    }

}
