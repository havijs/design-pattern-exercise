package com.knavid.templateMethod;

public class DesignPattern extends ClassInformation {
    /**
     * 10 percent of course grades belongs to being present in classes
     * */
    public double presenceGrade(double grade) {
        return (grade * 10)/ 100;
    }

    /**
     * 20 percent of course grades belongs to assignments
     * */
    public double assignmentsGrade(double grade) {
        return (grade * 20)/ 100;
    }

    /**
     * 30 percent of course grades belongs to midterm exam
     * */
    public double midtermGrade(double grade) {
        return (grade * 30)/ 100;
    }

    /**
     * 40 percent of course grades belongs to midterm exam
     * */
    public double finalGrade(double grade) {
        return (grade * 30)/ 100;
    }
}
