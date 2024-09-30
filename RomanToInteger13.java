import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RomanToInteger13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIVI"));
    }
    public static int romanToInt(String s){
        HashMap<Character, Integer> romanValues = new HashMap<>();
        int valor = 0;
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        for (int i = 0 ; i < s.length(); i++){
            int curretValue = romanValues.get(s.charAt(i));
            if (i + 1 < s.length() && romanValues.get(s.charAt(i+1)) > curretValue)valor -=curretValue;
            else valor += curretValue;
        }
    return valor;
    }
}
