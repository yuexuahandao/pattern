import java.util.*;

public abstract class MachineComponent {
	public abstract int getMachineCount();

	public abstract boolean isTree(Set s);

	public boolean eanisTree() {
		return isTree(new HashSet());
	}
}