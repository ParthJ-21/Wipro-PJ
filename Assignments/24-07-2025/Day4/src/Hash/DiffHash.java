package Hash;
import java.util.HashSet;
import java.util.Set;
public class DiffHash {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        //Set<Integer> set3 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(4);
        set2.add(5);
        set2.add(6);
        
        set1.removeAll(set2);
        //set2.removeAll(set1);
        System.out.println(set1);
        //System.out.println(set2);
	}

}
