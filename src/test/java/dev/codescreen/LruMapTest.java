package dev.codescreen;

import org.junit.Test;

import static junit.framework.TestCase.*;

/**
 * Add test cases for your coding test in here. All tests must use the Junit test framework.
 */
public class LruMapTest {

    @Test
    public void testBasicInsertion() {
        LruMap map = new LruMapImpl(1);
        map.put("one", 1);
        map.put("two", 2);
        assertNull(map.get("one"));
        assertNotNull(map.get("two"));
        assertEquals(1, map.size());
        assertEquals(1, map.capacity());
    }

    @Test
    public void testBasicTouch() {
        LruMap map = new LruMapImpl(2);
        map.put("one", 1);
        map.put("two", 2);
        assertEquals(2, map.size());
        assertNotNull(map.get("one"));
        assertNotNull(map.get("two"));
        map.put("three", 3);
        assertEquals(2, map.size());
        assertEquals(3, map.get("three"));
        // Two was accessed last before placing 3
        assertEquals(2, map.get("two"));
        assertNull(map.get("one"));
    }


    @Test
    public void testPutReorders() {
        LruMap map = new LruMapImpl(2);
        map.put("one", 1);
        map.put("two", 2);
        assertEquals(2, map.size());
        assertNotNull(map.get("one"));
        map.put("two", 22);
        map.put("three", 3);
        assertEquals(2, map.size());
        assertEquals(3, map.get("three"));
        // Two was updated to 22 and should have been preserved
        assertEquals(22, map.get("two"));
    }

    @Test
    public void testEmptyGets() {
        LruMap map = new LruMapImpl(2);
        assertNull(map.get("lol"));
    }

    @Test
    public void testRemoveTail() {
        LruMap map = new LruMapImpl(2);
        map.put("one", 1);
        map.put("two", 1);
        map.remove("one");
        assertEquals(1, map.size());
        assertNotNull(map.get("two"));
        assertNull(map.get("one"));
    }

    @Test
    public void testRemoveHead() {
        LruMap map = new LruMapImpl(2);
        map.put("one", 1);
        map.put("two", 1);
        map.remove("two");
        assertEquals(1, map.size());
        assertNotNull(map.get("one"));
        assertNull(map.get("two"));
    }


}
