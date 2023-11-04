public class CellService {

    public boolean nextStatus(boolean currentStatus, int livingNeighbors) {
        if (livingNeighbors == 2) {
            return currentStatus;
        }
        if(livingNeighbors > 3){
            return false;
        }
        return livingNeighbors != 0;
    }

}
