package com.current;

/**
 * This is a Plain Old Java Object (POJO) to hold data that we'd like to pass around in our program.
 */
public class UserInfo {

    private final String name;
    private final String address;

    /**
     * A "Constructor" that is used to create an instance of our class.
     * Usage: `UserInfo myUserInfo = new UserInfo("name", "address");`
     */
    public UserInfo(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * A "Getter" that is used to access the data stored internally in our class.
     */
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
