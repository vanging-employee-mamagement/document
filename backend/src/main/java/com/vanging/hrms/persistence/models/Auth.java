package com.vanging.hrms.persistence.models;

public class Auth
{
    private long id;
    private String password;

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}