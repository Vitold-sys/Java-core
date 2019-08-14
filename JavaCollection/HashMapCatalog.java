package Lesson8;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapCatalog {
    public static void main(String[] args) {
        Map<String, Integer> catalog = new HashMap<String, Integer>();
        catalog.put("smartphone", 230);
        catalog.put("smartwatch", 20);
        catalog.put("smartglasses", 2);
        catalog.put("smartmicrowawe", 0);

        //sort categories in catalog
        catalog.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .forEach(System.out::println);

        //find category that has max number of goods
        Object maxEntry = Collections.max(catalog.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Category: " + maxEntry);

      //delete category with 0 element
        //First version
        catalog.values().remove(0);
        //Second version
        catalog.entrySet().removeIf(entry ->  catalog.containsValue(0));
        catalog.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .forEach(System.out::println);

    }
}
