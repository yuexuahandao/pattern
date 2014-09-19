import java.util.*;

public class MachineComposite extends MachineComponent {
    private List<MachineComponent> components = new ArrayList<MachineComponent>();

    public boolean isTree(Set visited) {
        visited.add(this);
        return true;
    }
    
    public int getMachineCount() {
        int count = 0;
        int length = components.size();

        for(int i=0;i<length;i++) {
            count += components.get(i).getMachineCount();
        }

        return count;
    }
}