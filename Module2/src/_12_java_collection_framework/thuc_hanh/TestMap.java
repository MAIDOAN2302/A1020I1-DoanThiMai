package _12_java_collection_framework.thuc_hanh;

import java.beans.IntrospectionException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map< String,Integer> hashMap = new HashMap<>();
        hashMap.put("Mai",29);
        hashMap.put("Hoa",30);
        hashMap.put("Huy",27);
        hashMap.put("Vi",26);

        System.out.println("Print list using hashmap: ");
        System.out.println(hashMap);

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Print list using tree map : ");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(2, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);

        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));




    }

}
