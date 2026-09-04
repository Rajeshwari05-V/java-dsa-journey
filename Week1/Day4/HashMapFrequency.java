package Week1.Day4;
import java.util.HashMap;

public class HashMapFrequency {
    public static void main(String args[]){
        int[] nums = {1,3,4,1,2,3,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
            }
            System.out.println("Frequency:"+map);
        }
    }
