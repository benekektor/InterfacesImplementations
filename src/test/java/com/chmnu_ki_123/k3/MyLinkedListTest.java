package com.chmnu_ki_123.k3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    @Test
    void testAdd() {
        MyList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(3, list.size());
        assertEquals(20, list.get(1));
    }

    @Test
    void testRemove() {
        MyList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(20);
        assertEquals(2, list.size());
        assertEquals(30, list.get(1));
    }

    @Test
    void testGet() {
        MyList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);

        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
    }
}
