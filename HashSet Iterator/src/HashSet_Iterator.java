import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Iterator {
	public static void main(String[] args) {
		HashSet<String> hash=new HashSet<>();
		hash.add("banana");
		hash.add("mango");
		hash.add("apple");
		System.out.println(hash);
		Iterator<String> it=hash.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
