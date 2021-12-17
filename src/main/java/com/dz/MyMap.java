package com.dz;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("hi", 3);
        map.put("cat", 13);
        map.put("red", 5);
        map.put("good", 67);
        map.put("sun", 34);
        map.put("fog", 68);
        map.put("hello", 52);
        map.put("nice", 23);
        map.put("git", 2);
        map.put("hit", 1);

        Map<Integer, String> map1 = reverseMap(map);

        System.out.println(map);
        System.out.println(map1);
    }

    public static Map<Integer,String> reverseMap(Map<String,Integer> map) {
        Map<Integer,String> map1 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            map1.put(entry.getValue(), entry.getKey());
        }
        return map1;
    }
}
