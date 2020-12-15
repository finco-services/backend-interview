package com.current;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This is the test suite for our String serializer.
 * Any method annotated with `@Test` is runnable.
 */
public class StringMapperTest {

    @Test
    public void testSingleValueMapper() {
        String fieldDelim = ",\t";
        UserInfoMapper mapper = new UserInfoMapper(fieldDelim);
        UserInfo userInfo = new UserInfo("Trevor", "123 Fancy St");
        String result = mapper.mapToValue(userInfo);
        assertEquals("Trevor,\t123 Fancy St", result);
    }

    @Test
    public void testMultiValueMapper() {
        String fieldDelim = ",";
        UserInfoMapper mapper = new UserInfoMapper(fieldDelim);
        UserInfo userInfo1 = new UserInfo("Trevor", "123 Fancy St");
        UserInfo userInfo2 = new UserInfo("Zac", "456 Cool St");
        // Arrays of type `Type` are created with `new Type[]{ ...comma-separated values... }`
        UserInfo[] userInfoArray = new UserInfo[]{userInfo1, userInfo2};
        String result = mapper.mapToValue(userInfoArray);
        assertEquals("Trevor,123 Fancy St\nZac,456 Cool St", result);
    }

}
