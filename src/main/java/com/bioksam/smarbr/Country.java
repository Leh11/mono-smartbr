package com.bioksam.smarbr;

import java.io.Serializable;

public class Country implements Serializable {
    private int id;
    private String name;
    private String nick;

    public Country() {
    }

    public Country(int id, String name, String nick) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
