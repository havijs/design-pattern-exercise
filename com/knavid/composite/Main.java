package com.knavid.composite;

public class Main {
    public static void main(String[] main) {
        Tag parent = new Tag("div");
        Tag child1 = new Tag("p");
        Tag child2 = new Tag("div");
        parent.addChild(child1);
        parent.addChild(child2);
        TagComponent innerChild1 = new LeafTag("img");
        TagComponent innerChild2 = new Tag("div");
        child2.addChild(innerChild1);
        child2.addChild(innerChild2);


        parent.print();
    }
}
