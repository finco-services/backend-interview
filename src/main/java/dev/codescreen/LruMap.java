package dev.codescreen;

public interface LruMap<K,V> {

    /**
     * Retrieves the association for the key if found
     *
     * @param key The key of the association (non-nullable)
     * @return The value (if found) for the associated key
     */
    V get(K key);

    /**
     * Removes the binding fo the current key from the LRU map
     *
     * @param key The key of the association (non-nullable)
     */
    void remove(K key);

    /**
     * Puts a key into the map, performing necessary evictions in order to observe the capacity constraint
     *
     * @param key The key of the association (non-nullable)
     * @param value The value of the association
     */
    void put(K key, V value);

    /**
     *
     * @return Returns the total cache capacity of this map (the point at which evictions are triggered)
     */
    int capacity();

    /**
     * @return Returns the current accumulated map size
     */
    int size();

}
