package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	public ArrayList() {
	}
	
	public int get(int loc) throws IndexOutOfBoundsException {
	ArrayList<Integer> lists = new ArrayList<Integer>();
	lists.add(0);
	lists.add(1);
	lists.add(206);
	return lists.get(loc);
	}
	
	public void add(T val) {
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}