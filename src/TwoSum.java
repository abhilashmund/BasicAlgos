import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public boolean twoSum(int[] arr, int targer){
        Map<Integer, Integer> vMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = targer - arr[i];
            if(vMap.containsKey(comp)){
                return true;
            }
            vMap.put(i, comp);
        }
        return false;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        System.out.println(ts.twoSum(new int[]{2,3,4,5,8}, 12));
    }
}
