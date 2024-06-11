package core.programming.datastructures.sorting;
import java.util.*;
import java.util.Map.Entry;

public class MapSortingDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "two");
        map.put(1, "one");
        map.put(3, "three");
        System.out.println("========== Sorting Map by Comparable Key ==========");
        List<Entry<Integer,String>> list =  new ArrayList<Entry<Integer,String>>(map.entrySet());
        Collections.shuffle(list);
        System.out.println("Entries before sorting: " + list);
        list.sort(Entry.comparingByKey());
        System.out.println("Entries after sorting: " + list);
        // ========== Sorting Map by Comparable Key with TreeMap
        Map<Integer, String> sortedMap = new TreeMap<>(map);
        System.out.println("Elements in TreeMap: " + sortedMap);

        // ========== Sorting Map by Comparable Value
        Collections.shuffle(list);
        System.out.println("Entries before sorting: " + list);
        list.sort(Entry.comparingByValue());
        Collections.sort(list, Entry.comparingByValue());
        System.out.println("Entries after sorting by value: " + list);

    }
}
