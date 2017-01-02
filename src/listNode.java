import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listNode {
	public List<Integer> memoryList;
	public listNode left, right, parent;
	public int memorySize;
	
	listNode(int _memorySize) {
		memoryList = new ArrayList<Integer>(Collections.nCopies(_memorySize, 0));
		memorySize = _memorySize;
		parent = null;
		left = null;
		right = null;
	}
}
