import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionStream {
	List<Integer> intList = new ArrayList<Integer>();
	List<String> strList = new ArrayList<String>();
	
	
	private void init() {
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			intList.add(r.nextInt(100));
		}
		
		strList.add("Djamel");
		strList.add("MOUCHENE");
		strList.add("Axel");
		strList.add("Djamel");
		strList.add("JAVA");
		strList.add("Spark");
		strList.add("scala");
		strList.add("Sofiane");
		
	}
	
	
	public void stream() {
		intList.stream().filter(elt -> elt > 10).forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		
		CollectionStream cs = new CollectionStream();
		cs.init();
		cs.stream();
	}

}
