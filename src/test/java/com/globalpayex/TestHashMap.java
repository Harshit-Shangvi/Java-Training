package com.globalpayex;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class TestHashMap {
    @Test
    void testHashMap(){
        HashMap<Integer, String> map = new HashMap<>();
        assertEquals(0,map.size());
        //add to a map
        map.put(70,"mehul");
        map.put(5,"jane");
        assertEquals(2,map.size());

        //get a value in map
        assertEquals("jane", map.get(5));

        //update
        map.put(5,"jill");
        assertEquals("jill",map.get(5));

        //remove
        map.remove(5);
        assertEquals(1,map.size());

        //get a list of all the values
        var keys = map.keySet();
        System.out.println(keys);

    }
}
