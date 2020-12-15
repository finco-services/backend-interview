package com.current;


public class UserInfoMapper implements StringMapper<UserInfo> {

    // A private STATIC field that is the same across all instances.
    private static final String NEWLINE_DELIMITER = "\n";

    // A private field that only instances of this class can access. This can differ across instances.
    private final String fieldDelimiter;

    /**
     * @param fieldDelimiter The delimiter that we use to separate fields in our String serializer.
     */
    public UserInfoMapper(String fieldDelimiter) {
        this.fieldDelimiter = fieldDelimiter;
    }


    @Override
    public String mapToValue(UserInfo value) {
        // Use the "+" operator to add the strings and our delimiter
        return value.getName() + fieldDelimiter + value.getAddress();
    }

    @Override
    public String mapToValue(UserInfo[] values) {
        // Create a builder that we will mutate as we iterate through the `UserInfo` values
        StringBuilder stringBuilder = new StringBuilder();
        // Define a for loop
        for (int i = 0; i < values.length; i++) {
            // TODO: add a breakpoint on this line to test your debugger
            //       (click to the right of the line number in IntelliJ)
            stringBuilder.append(mapToValue(values[i]));
            // We don't want to append a newline delimiter to the last record
            if (i < values.length - 1) {
                stringBuilder.append(NEWLINE_DELIMITER);
            }
        }
        return stringBuilder.toString();
    }

}
