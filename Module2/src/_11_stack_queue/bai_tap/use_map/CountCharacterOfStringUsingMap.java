package _11_stack_queue.bai_tap.use_map;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOfStringUsingMap {
    public static void main(String[] args) {
        String string = "count character of string using map";
        int count;
        char ch;
        Map<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++){
            ch = string.charAt(i);
            if (hashMap.containsKey(ch)){
                count = hashMap.get(ch);
                count++;
                hashMap.replace(ch,count);
            }else {
                hashMap.put(ch,1);
            }
        }
        for (Character key:hashMap.keySet()) {
            System.out.println(key + " = " + hashMap.get(key));
        }

    }
}
