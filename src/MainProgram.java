import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//consider lists with 0s in them to imply empty lists, as memory is used it the 0s will become 1s

public class MainProgram {
	public static void main(String args[]) {
		
		List<Integer> allocation = new ArrayList<Integer>();
		allocation.addAll(Arrays.asList(20000, 35000, 90000, 40000, 240000, -40000, -20000, -90000, -35000, -240000));
		buddySystem bsInstance = new buddySystem(2097152, allocation);
		bsInstance.allocate(10);
		//bsInstance.allocate(8);
		bsInstance.traverseTree(bsInstance.head);
		
		
	}


}



