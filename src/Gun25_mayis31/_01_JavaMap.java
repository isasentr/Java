package Gun25_mayis31;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _01_JavaMap {
    public static void main(String[] args) {

        // Sets ->  HashSet, LinkedHashSet, TreeSet
        //Maps- HashMap, LinkedHashMap, TreeMap

        Set<Integer> s = new HashSet<>();

        //Map ailesinden HashMap
        Map<Integer, Integer> m = new HashMap<>(); //Key ve value si integer olan Map
        m.put(2, 11); // 2 KEY ine 11 atandı.
        m.put(3, 12);
        m.put(6, 15);
        m.put(2, 5); // 2 anahtarındaki değeri güncellendi.

        System.out.println("m = " + m); //m = {2=5, 3=12, 6=15} key value
        System.out.println("m = " + m.get(2)); // 2 anahtarındaki değer // 5
        System.out.println("m.keySet() = " + m.keySet());
        System.out.println("m.values() = " + m.values());

        for (Integer k : m.keySet())
            System.out.println("k = " + k);

        for (Integer v : m.values())
            System.out.println("v = " + v);

        for (Map.Entry<Integer, Integer> anahtarValue : m.entrySet()) {
            System.out.println("anahtarKey = " + anahtarValue.getKey());
            System.out.println("anahtarValue = " + anahtarValue.getValue());
        }
        System.out.println("m.containsKey(2) = " + m.containsKey(2));
        System.out.println("m.containsValue(12) = " + m.containsValue(12));

        System.out.println("m = " + m);
        System.out.println("m.size() = " + m.size());

        m.remove(2);
        System.out.println("m = " + m);

        System.out.println("m.size() = " + m.size());

        m.clear();
        System.out.println("m = " + m);





    }
}
