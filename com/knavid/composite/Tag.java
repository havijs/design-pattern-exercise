package com.knavid.composite;

import java.util.ArrayList;
import java.util.List;

public class Tag extends TagComponent {
    private List<TagComponent> children;

    public Tag(String name) {
        super(name);
        this.children = new ArrayList<>();

    }

    public void addChild(TagComponent tag) {
        tag.setLevel(this.getLevel() + 1);
        this.children.add(tag);
    }

    public void print() {
        for (int i = 0; i < getLevel(); i++) {
            System.out.print("    ");
        }
        System.out.println("<%s>".formatted(getName()));
        for (TagComponent child : children) {
           child.print(); 
        }
        for (int i = 0; i < getLevel(); i++) {
            System.out.print("    ");
        }
        System.out.println("</%s>".formatted(getName()));
    }
}
