import java.util.*;

public class Machine extends MachineComponent {
    public int getMachineCount() {
        return 1;
    }

    public boolean isTree(Set visited) {
        visited.add(this);
        return true;
    }
}