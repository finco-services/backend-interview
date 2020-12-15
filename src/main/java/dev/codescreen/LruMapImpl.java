package dev.codescreen;

public class LruMapImpl<K,V> implements LruMap<K,V> {

    private final int capacity;

//    private Node<K,V> head;
//    private Node<K,V> tail;
//    private int size = 0;
//
//    private static class Node<K,V> {
//        K key;
//        V value;
//        Node<K,V> next;
//        Node<K,V> previous;
//    }

    public LruMapImpl(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public void remove(K key) {
    }

    @Override
    public void put(K key, V value) {
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public int size() {
        return 0;
    }

}
