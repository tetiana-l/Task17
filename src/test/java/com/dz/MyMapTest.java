package com.dz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MyMapTest {

    @Test
    public void shouldReverseMap() {
        Map<String, Integer> subject = new HashMap<>();
        subject.put("Dima", 3);
        subject.put("Roma", 4);
        subject.put("Vika", 34);
        Map<Integer, String> expected = new HashMap<>();
        expected.put(3, "Dima");
        expected.put(4, "Roma");
        expected.put(34, "Vika");
        Map<Integer, String> actual = MyMap.reverseMap(subject);
        Assertions.assertEquals(expected, actual);
    }
}
