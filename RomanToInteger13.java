import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RomanToInteger13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s){
        HashMap<Character, Integer> romanValue = new HashMap<>();
        int valor = 0;
        romanValue.put('I', 1);
        romanValue.put('V', 5);
        romanValue.put('X', 10);
        romanValue.put('L', 50);
        romanValue.put('C', 100);
        romanValue.put('D', 500);
        romanValue.put('M', 1000);
        for (int i = 0 ; i < s.length(); i++){
            int curretValue = romanValue.get(s.charAt(i));
            if (i + 1 < s.length() && romanValue.get(s.charAt(i+1)) > curretValue)valor -=curretValue;
            else valor += curretValue;
        }
    return valor;
    }
}
