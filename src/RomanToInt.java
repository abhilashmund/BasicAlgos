import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        Map<Character, Integer> val = new HashMap<>();
        val.put('I',1);
        val.put('V',5);
        val.put('X',10);
        val.put('L',50);
        val.put('C',100);
        val.put('D', 500);
        val.put('M',1000);

        char[] cArr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < cArr.length; i++) {
            if(i+1 < cArr.length && val.get(cArr[i]) < val.get(cArr[i+1])){
                sum -= val.get(cArr[i]);
            }else{
                sum += val.get(cArr[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInt().romanToInt("MCMXCIV"));
    }
}
