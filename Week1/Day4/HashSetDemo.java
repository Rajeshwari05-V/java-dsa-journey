package Week1.Day4;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(45);
        set.add(5);
        set.add(6);
        System.out.println("HashSet: " + set);
        System.out.println("Contains 5?"+ set.contains(5));
        set.remove(45);
        System.out.println("After removing 45" + set);
    }
    
}
