package com.knavid.templateMethod;

class Main {
    public static void main(String[] args) {
        DesignPattern d = new DesignPattern();
        double designPatternTotal = d.totalGrade(100, 70, 80, 60);
        System.out.println("Design Pattern total grate is %.2f".formatted(designPatternTotal));

        AI a = new AI();
        double aiTotalGrade = a.totalGrade(100, 70, 80, 60);
        System.out.println("AI total grate is %.2f".formatted(aiTotalGrade));
        
    }
}
