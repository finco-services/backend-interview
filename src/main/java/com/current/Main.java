package com.current;

public class Main {

    // Java programs are run in a static `main` method.
    // This serves as the entrypoint to our program.
    public static void main(String[] args) {
        UserInfoMapper mapper = new UserInfoMapper(":\t");
        System.out.println(mapper.mapToValue(new UserInfo("zac", "345 Hudson St")));
    }

}
