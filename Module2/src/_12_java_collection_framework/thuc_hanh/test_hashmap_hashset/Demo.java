package _12_java_collection_framework.thuc_hanh.test_hashmap_hashset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {

        public static void main(String args[]) {
            // Tao mot hash map
            HashMap hm = new HashMap();
            // Dat cac phan tu vao map
            hm.put("Zara", new Double(3434.34));
            hm.put("Mahnaz", new Double(123.22));
            hm.put("Ayan", new Double(1378.00));
            hm.put("Daisy", new Double(99.22));
            hm.put("Qadir", new Double(-19.08));

            // Lay mot set cac entry
            Set set = hm.entrySet();
            // Lay mot iterator
            Iterator i = set.iterator();
            // Hien thi cac phan tu
            while(i.hasNext()) {
                Map.Entry me = (Map.Entry)i.next();
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
            }
            System.out.println();
            // Gui 1000 vao trong tai khoan cua Zara
            double balance = ((Double)hm.get("Zara")).doubleValue();
            hm.put("Zara", new Double(balance + 1000));
            System.out.println("Balance moi cua Zara la: " +
                    hm.get("Zara"));
        }
}
