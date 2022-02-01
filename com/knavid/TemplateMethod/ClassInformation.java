package com.knavid.templateMethod;

public abstract class ClassInformation {
    public final double totalGrade(double presenceGrade, double assignmentsGrade, double midtermGrade, double finalGrade) {
        return presenceGrade(presenceGrade) + assignmentsGrade(assignmentsGrade) + midtermGrade(midtermGrade) + finalGrade(finalGrade);
    }

    public abstract double presenceGrade(double grade);
    public abstract double assignmentsGrade(double grade);
    public abstract double midtermGrade(double grade);
    public abstract double finalGrade(double grade);

}
