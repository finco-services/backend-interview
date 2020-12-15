package com.current;

/**
 * An interface for a java class that serializes values as `String`s.
 * <p>
 * Interfaces are abstract types. They specify the behaviour that a class must implement. A good example
 * is the `List` interface in java (https://docs.oracle.com/javase/8/docs/api/java/util/List.html). In order
 * to be a `List`, a class must implement all of the methods in that interface (add(), clear(),
 * get(), isEmpty(), etc...)
 * <p>
 * This interface uses a generic type. The class that implements this interface must specify what this type is.
 * For example, a class that maps `Integer`s to `String`s would look something like:
 * <pre>
 * {@code
 * public class IntToString implements StringMapper<Integer> {
 *   ...
 * }
 * }
 * </pre>
 * You can read more about generic types here: https://docs.oracle.com/javase/tutorial/java/generics/types.html
 *
 * @param <GenericType> A generic type that we will use to map into a `String`
 */
public interface StringMapper<GenericType> {

    // These are interface methods. They defines the method signatures that classes must implement.

    /**
     * Map a single value to a `String`
     *
     * @param value An instance of type `GenericType` that we want to map to a string.
     * @return A `String` instance that represents our input value.
     */
    String mapToValue(GenericType value);

    /**
     * Map an array of values to a `String`
     *
     * @param values An array of `GenericType` instances that we want to map to a string.
     * @return A `String` instance that represents our input values.
     */
    String mapToValue(GenericType[] values);

}
