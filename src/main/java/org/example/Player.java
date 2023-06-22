package org.example;

public class Player {
    protected int id;
    protected String name;
    protected int strange;

    public Player(int id, String name, int strange) {
        this.id = id;
        this.name = name;
        this.strange = strange;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getStrange() {
        return strange;
    }


}
