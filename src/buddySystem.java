import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class buddySystem {
	public int totalMemory;
	public List<Integer> allocation;
	public double count;
	public listNode head;
	public static int size = 0;
	
	public buddySystem(int _totalMemory, List<Integer> _allocation) {
		this.totalMemory = _totalMemory;
		this.allocation = _allocation;
		this.count = Math.log(this.totalMemory)/Math.log(2);
		head = new listNode(this.totalMemory);
		size++;
	}

	public void allocate(int request) {
		createTree(head, request, logCeiling(request), head.memorySize);
	}
	
	public void deallocate(int request) {
		
	}

	public void createTree(listNode _head, int request, int ceildRequest, int count) {
		listNode temp = _head;
		if (temp.memorySize == ceildRequest) {
			if (!isFull(temp.memoryList)) {
				for (int j = 0; j < request; j++)	{
					temp.memoryList.set(j, 1);
				}
				return;
			}
			else {
				return;
			}
			
		}
		else if (temp.left == null) {
			temp.left = new listNode(count/2);
			temp.right = new listNode(count/2);
			temp.left.parent = temp;
			temp.right.parent = temp;
			size += 2;
			createTree(temp.left, request, ceildRequest, count/2);
			createTree(temp.right, request, ceildRequest, count/2);
		}
		
	}
	
	public void traverseTree(listNode _head) {
		if (_head == null)
			return;
		System.out.println(_head.memoryList);
		traverseTree(_head.left);
		traverseTree(_head.right);
	}
	
	public int logCeiling(int number) {
		double checkInt = (Math.log10(number)/Math.log10(2));
		if (checkInt == (int)checkInt) 
			return number;
		else {
			int exp = (int) Math.ceil(checkInt);
			return (int) Math.pow(2, exp);
		}
	}

	public boolean isFull(List<Integer> l) {
		if (l.contains(1))
			return true;
		return false;
	}




}
