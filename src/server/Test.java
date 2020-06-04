package server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String s = "123gjkjah";
        System.out.println(s.substring(3));
        ArrayList<String> list = new ArrayList<>();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(1, "a");
        map.put(2, "b");
        map.put(1, "c");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
