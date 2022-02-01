package com.knavid.composite;

public class LeafTag extends TagComponent {
    public LeafTag(String name) {
        super(name);
    }

    public void print() {
        for (int i = 0; i < getLevel(); i++) {
            System.out.print("    ");
        }
        System.out.println("<%s />".formatted(getName()));
    }
}
