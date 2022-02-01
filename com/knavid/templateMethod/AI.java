package com.knavid.templateMethod;

public class AI extends ClassInformation {
    /**
     * 5 percent of course grades belongs to being present in classes
     * */
    public double presenceGrade(double grade) {
        return (grade * 5)/ 100;
    }

    /**
     * 5 percent of course grades belongs to assignments
     * */
    public double assignmentsGrade(double grade) {
        return (grade * 5)/ 100;
    }

    /**
     * 40 percent of course grades belongs to midterm exam
     * */
    public double midtermGrade(double grade) {
        return (grade * 40)/ 100;
    }

    /**
     * 50 percent of course grades belongs to midterm exam
     * */
    public double finalGrade(double grade) {
        return (grade * 50)/ 100;
    }
}
