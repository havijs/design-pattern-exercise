package com.knavid.composite;

public abstract class TagComponent {
    private String name;
    private int level;

    public TagComponent(String name) {
        this.name = name;
        this.level = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public abstract void print();
}
